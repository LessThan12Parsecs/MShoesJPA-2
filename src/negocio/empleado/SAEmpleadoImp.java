package negocio.empleado;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import negocio.departamento.ONDepartamento;
import negocio.jpa.EntityManagerFactoryMShoes;

public class SAEmpleadoImp implements SAEmpleado{

	@Override
	public boolean altaEmpleado(TransferEmpleado e) throws Excepciones {
	
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		TypedQuery<ONEmpleado> query = null;
		ONEmpleado nuevoEmpleado = null;
				
		try {		
			entityManager.getTransaction().begin();
			
			if(e == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else if(e.getNombre().equals("") || e.getApellidos().equals("") ||
					e.getDNI().equals("") || e.getDepartamento_emp()==null){
				throw new Excepciones("Es necesario introducir un nombre, apellidos, dni y departamento");
			}
			else {
				query = entityManager.createNamedQuery("queryConsultarEmplPorDNI", ONEmpleado.class);
				query.setParameter("DNI", e.getDNI());
				nuevoEmpleado = query.getSingleResult();
				
				//Si existe y activo es true
				if(nuevoEmpleado.getActivo()) {
					throw new Excepciones("El empleado ya existe");
				}
				//Reactivacion
				else {
							    
				    //Comprobamos que existe el departamento
				    ONDepartamento nuevoDepartamento = entityManager.find(ONDepartamento.class, e.getDepartamento_emp());
				    //Si no existe o no esta activo
				    if(nuevoDepartamento == null || !nuevoDepartamento.getActivo()) {
				    	throw new Excepciones("El departamento no existe o esta dado de baja");
				    }
				    //Si existe el departamento
				    else {
				    	
				    	entityManager.lock(nuevoDepartamento,LockModeType.OPTIMISTIC_FORCE_INCREMENT); 
				    	
				    	//Modifico los atributos del empleado reactivado
				    	nuevoEmpleado.setDepartamento_Emp(nuevoDepartamento);
						nuevoEmpleado.setActivo(true);
						nuevoEmpleado.setApellidos(e.getApellidos());
						nuevoEmpleado.setNombre(e.getNombre());
						
						//Si es empleado a tiempo completo
						if(e instanceof TransferEmpleadoTCompleto && nuevoEmpleado instanceof ONEmpleadoTCompleto) {
					
							//Asignamos salario e impuesto al nuevoEmpleado
							((ONEmpleadoTCompleto)nuevoEmpleado).setImpuesto(((TransferEmpleadoTCompleto)e).getImpuesto());
							((ONEmpleadoTCompleto)nuevoEmpleado).setSalario(((TransferEmpleadoTCompleto)e).getSalario());
							
							entityManager.merge(nuevoEmpleado);
						}
						//Si es empleado a tiempo parcial
						else if(e instanceof TransferEmpleadoTParcial && nuevoEmpleado instanceof ONEmpleadoTParcial) {
							
							//Asignamos horas y salario horas al nuevoEmpleado
							((ONEmpleadoTParcial)nuevoEmpleado).setHoras(((TransferEmpleadoTParcial)e).getHoras());
							((ONEmpleadoTParcial)nuevoEmpleado).setSalario_Hora(((TransferEmpleadoTParcial)e).getSalarioHoras());
							
							entityManager.merge(nuevoEmpleado);
						}
						//Si es cualquier otra combinacion
						else {
						
					    	throw new Excepciones("El empleado esta dado de baja y los datos de su nuevo contrato no coinciden\n"
					    			+ "con los datos de su contrato anterior.");
						}
						
						//Si no hay excepciones commit
						entityManager.getTransaction().commit();
						correcto = true;
				    }
				}
			}
		}
		//Si no existia el empleado
		catch (NoResultException exc) {
			
			//Comprobamos que existe el departamento
		    ONDepartamento nuevoDepartamento = entityManager.find(ONDepartamento.class, e.getDepartamento_emp());
		    //Si no existe o no esta activo
		    if(nuevoDepartamento == null || !nuevoDepartamento.getActivo()) {
		    	throw new Excepciones("El departamento no existe o esta dado de baja");
		    }
		    //Si existe el departamento
		    else {
		    	
		    	entityManager.lock(nuevoDepartamento,LockModeType.OPTIMISTIC_FORCE_INCREMENT);  

		    	//Si es empleado a tiempo completo
		    	if(e instanceof TransferEmpleadoTCompleto) {
			
					ONEmpleadoTCompleto nuevoEmpleadoTCompleto = new ONEmpleadoTCompleto();
					nuevoEmpleadoTCompleto.setDNI(e.getDNI());
					nuevoEmpleadoTCompleto.setActivo(true);
					nuevoEmpleadoTCompleto.setApellidos(e.getApellidos());
					nuevoEmpleadoTCompleto.setDepartamento_Emp(nuevoDepartamento);
					nuevoEmpleadoTCompleto.setNombre(e.getNombre());
					nuevoEmpleadoTCompleto.setImpuesto(((TransferEmpleadoTCompleto)e).getImpuesto());
					nuevoEmpleadoTCompleto.setSalario(((TransferEmpleadoTCompleto)e).getSalario());

					entityManager.persist(nuevoEmpleadoTCompleto);
				}
				//Si es empleado a tiempo parcial
		    	else if(e instanceof TransferEmpleadoTParcial) {
					
					ONEmpleadoTParcial nuevoEmpleadoTParcial = new ONEmpleadoTParcial();
					nuevoEmpleadoTParcial.setDNI(e.getDNI());
					nuevoEmpleadoTParcial.setActivo(true);
					nuevoEmpleadoTParcial.setApellidos(e.getApellidos());
					nuevoEmpleadoTParcial.setDepartamento_Emp(nuevoDepartamento);
					nuevoEmpleadoTParcial.setNombre(e.getNombre());
					nuevoEmpleadoTParcial.setHoras(((TransferEmpleadoTParcial)e).getHoras());
					nuevoEmpleadoTParcial.setSalario_Hora(((TransferEmpleadoTParcial)e).getSalarioHoras());

					entityManager.persist(nuevoEmpleadoTParcial);
				}
				//Si es cualquier otra combinacion
				else {
			    	throw new Excepciones("Es necesario introducir una de las siguientes opciones:"
			    			+ " salario por hora y horas (Tiempo parcial)"
			    			+ " o salario e impuesto (Tiempo completo)");
				}
		    	
		    	//Si no hay excepciones commit
		    	entityManager.getTransaction().commit();
				correcto = true;
		    }
		}
		catch (Excepciones exc){
			entityManager.getTransaction().rollback();
			throw exc;
		}
		finally {
			entityManager.close();
		}
			
		return correcto;
	}

	@Override
	public boolean bajaEmpleado(int IDEmpleado) throws Excepciones {

		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONEmpleado baja = null;
				
		try {		
			entityManager.getTransaction().begin();
				
			baja = entityManager.find(ONEmpleado.class, IDEmpleado);
		
			//Si no existe ese empleado o ya esta a false
			if(baja == null || !baja.getActivo()) {
				throw new Excepciones("No existe el empleado o ya esta dado de baja");
			}
			//Si existe
			else {
				baja.setActivo(false);
				
				//Desasignamos el departamento de ese empleado
				baja.setDepartamento_Emp(null);
				
				correcto = true;
				entityManager.getTransaction().commit();
			}
		}
		catch (Excepciones e){
			entityManager.getTransaction().rollback();
			throw e;
		}
		finally {
			entityManager.close();
		}
		return correcto;
	}

	@Override
	public boolean modificarEmpleado(TransferEmpleado e) throws Excepciones {
		
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONEmpleado modificar = null;
				
		try {		
			entityManager.getTransaction().begin();
			
			if(e == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else {
				modificar = entityManager.find(ONEmpleado.class, e.getIDEmpleado());
				
				//Si no existe
				if(modificar == null) {
					throw new Excepciones("No existe el empleado");
				}
				else if(e.getNombre().equals("") || e.getApellidos().equals("") ||
						e.getDNI().equals("") || e.getDepartamento_emp()==null){
					throw new Excepciones("Es necesario introducir un nombre, apellidos, dni y departamento");
				}
				//Si existe
				else {
				    
				    //Comprobamos que existe el departamento
				    ONDepartamento departamento = entityManager.find(ONDepartamento.class, e.getDepartamento_emp());
				    
				    //Si no existe o no esta activo
				    if(departamento == null || !departamento.getActivo()) {
				    	throw new Excepciones("El departamento no existe o esta dado de baja");
				    }
				    //Si existe el departamento
				    else {
				    	
				    	entityManager.lock(departamento,LockModeType.OPTIMISTIC_FORCE_INCREMENT);  

				    	modificar.setDNI(e.getDNI());
				    	modificar.setNombre(e.getNombre());
				    	modificar.setApellidos(e.getApellidos());
				    	modificar.setDepartamento_Emp(departamento);
				    	
				    	//Si es empleado a tiempo completo
						if(e instanceof TransferEmpleadoTCompleto && modificar instanceof ONEmpleadoTCompleto) {
					
							//Asignamos salario e impuesto al nuevoEmpleado
							((ONEmpleadoTCompleto)modificar).setImpuesto(((TransferEmpleadoTCompleto)e).getImpuesto());
							((ONEmpleadoTCompleto)modificar).setSalario(((TransferEmpleadoTCompleto)e).getSalario());
						}
						//Si es empleado a tiempo parcial
						else if(e instanceof TransferEmpleadoTParcial && modificar instanceof ONEmpleadoTParcial) {
							
							//Asignamos horas y salario horas al nuevoEmpleado
							((ONEmpleadoTParcial)modificar).setHoras(((TransferEmpleadoTParcial)e).getHoras());
							((ONEmpleadoTParcial)modificar).setSalario_Hora(((TransferEmpleadoTParcial)e).getSalarioHoras());
						}
						//Si es cualquier otra combinacion
						else {
					    	throw new Excepciones("El empleado no puede cambiar de contrato");
						}
						
						//Si no hay excepciones commit
						entityManager.getTransaction().commit();
						correcto = true;
				    }
				}
			}
		}
		catch (Excepciones exc){
			entityManager.getTransaction().rollback();
			throw exc;
		}
		finally {
			entityManager.close();
		}
			
		return correcto;
	}

	
	public TransferEmpleado consultarUnEmpleado(int IDEmpleado) throws Excepciones {
		
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONEmpleado consultar = null;
		
				
		try {		
			entityManager.getTransaction().begin();
			
			consultar = entityManager.find(ONEmpleado.class, IDEmpleado);

			//Si no existe
			if(consultar == null) {
				throw new Excepciones("No existe el empleado");
			}
			else {
				
				if(consultar instanceof ONEmpleadoTCompleto) {
					TransferEmpleado empleadoCompleto = new TransferEmpleadoTCompleto();
					
					empleadoCompleto.setIDEmpleado(consultar.getIDEmpleado());
					empleadoCompleto.setDNI(consultar.getDNI());
					empleadoCompleto.setNombre(consultar.getNombre());
					empleadoCompleto.setApellidos(consultar.getApellidos());
					empleadoCompleto.setActivo(consultar.getActivo());
					if(consultar.getActivo()) {
						empleadoCompleto.setDepartamento_emp(consultar.getDepartamento_emp().getIDDepartamento());
					}
					else {
						empleadoCompleto.setDepartamento_emp(null);
					}
						
					((TransferEmpleadoTCompleto)empleadoCompleto).setImpuesto(((ONEmpleadoTCompleto)consultar).getImpuesto());
					((TransferEmpleadoTCompleto)empleadoCompleto).setSalario(((ONEmpleadoTCompleto)consultar).getSalario());
					
					entityManager.getTransaction().commit();
					return empleadoCompleto;
				}
				else if (consultar instanceof ONEmpleadoTParcial) {
					TransferEmpleado empleadoParcial = new TransferEmpleadoTParcial();
					empleadoParcial.setIDEmpleado(consultar.getIDEmpleado());
					empleadoParcial.setDNI(consultar.getDNI());
					empleadoParcial.setNombre(consultar.getNombre());
					empleadoParcial.setApellidos(consultar.getApellidos());
					empleadoParcial.setActivo(consultar.getActivo());
					if(consultar.getActivo()) {
						empleadoParcial.setDepartamento_emp(consultar.getDepartamento_emp().getIDDepartamento());
					}
					else {
						empleadoParcial.setDepartamento_emp(null);
					}
					
					((TransferEmpleadoTParcial)empleadoParcial).setHoras(((ONEmpleadoTParcial)consultar).getHoras());
					((TransferEmpleadoTParcial)empleadoParcial).setSalarioHoras(((ONEmpleadoTParcial)consultar).getSalario_Hora());
				
					entityManager.getTransaction().commit();
					return empleadoParcial;
				}
			}
		}
		catch (Excepciones e){
			entityManager.getTransaction().rollback();
			throw e;
		}
		finally {
			entityManager.close();
		}
		return null;
	}
	


	@Override
	public ArrayList<TransferEmpleado> listarEmpleados() throws Excepciones {

		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		TypedQuery<ONEmpleado> query = null;
		List<ONEmpleado> listar = null;
		ArrayList<TransferEmpleado> listaEmpleados = new ArrayList<TransferEmpleado>();
		
		try {		
			entityManager.getTransaction().begin();
			
			query = entityManager.createNamedQuery("queryListarEmpl", ONEmpleado.class);
			listar = query.getResultList();
			
			for(int i = 0; i < listar.size(); i++) {

				//Consultamos cada empleado con las diferentes ID de la lista de ONEmpleado y lo añadimos a la lista de Transfers
				//Necesitamos añadir tambien la nomina para mostrarla en la lista en vez de mostrar todos los atributos de la especializada
				TransferEmpleado s = consultarUnEmpleado(listar.get(i).getIDEmpleado());
				s.setNomina(listar.get(i).calcularNomina());
				listaEmpleados.add(s);
			}
			entityManager.getTransaction().commit();
		}
		catch(NoResultException e) {
			entityManager.getTransaction().rollback();
			throw new Excepciones("No existe ningun empleado");
		}
		finally {
			
			entityManager.close();
		}
		
		return listaEmpleados;
	}

	@Override
	public float nominaEmpleado(int IDEmpleado) throws Excepciones {
		
		float nomina = 0;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONEmpleado empleado = null;
				
		try {		
			entityManager.getTransaction().begin();
				
			empleado = entityManager.find(ONEmpleado.class, IDEmpleado);
			
			//Si no existe ese empleado o ya esta a false
			if(empleado == null || !empleado.getActivo()) {
				throw new Excepciones("No existe el empleado o esta dado de baja");
			}
			//Si existe
			else {
				
		    	entityManager.lock(empleado,LockModeType.OPTIMISTIC_FORCE_INCREMENT);  
				nomina = empleado.calcularNomina();
				
				entityManager.getTransaction().commit();
			}
		}
		catch (Excepciones e){
			entityManager.getTransaction().rollback();
			throw e;
		}
		finally {
			entityManager.close();
		}
		
		return nomina;
		
	}
}
