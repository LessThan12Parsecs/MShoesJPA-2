package negocio.departamento;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import negocio.empleado.ONEmpleado;
import negocio.empleado.TransferEmpleado;
import negocio.jpa.EntityManagerFactoryMShoes;

public class SADepartamentoImp implements SADepartamento{

	@Override
	public boolean altaDepartamento(TransferDepartamento d) throws Excepciones {
	
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		TypedQuery<ONDepartamento> query = null;
		ONDepartamento nuevoDepartamento = null;
				
		try {		
			entityManager.getTransaction().begin();
			
			if(d == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else if(d.getNombre().equals("")){
				throw new Excepciones("Es necesario introducir un nombre");
			}
			else {
				query = entityManager.createNamedQuery("queryConsultarDeptPorNombre", ONDepartamento.class);
				query.setParameter("nombre", d.getNombre());
				nuevoDepartamento = query.getSingleResult();
				
				//Si existe y activo es true
				if(nuevoDepartamento.getActivo()) {
					throw new Excepciones("El departamento ya existe");
				}
				//Reactivacion
				else {
					nuevoDepartamento.setActivo(true);
					entityManager.merge(nuevoDepartamento);
					correcto = true;
					entityManager.getTransaction().commit();
				}
			}
		}
		//Si no existia
		catch (NoResultException e) {
			
			nuevoDepartamento = new ONDepartamento();
		    nuevoDepartamento.setIDDepartamento(d.getID_Departamento());
		    nuevoDepartamento.setNombre(d.getNombre());
		    nuevoDepartamento.setActivo(true);
			entityManager.persist(nuevoDepartamento);
		    entityManager.getTransaction().commit();
		    correcto = true;
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
	public boolean bajaDepartamento(int IDDepartamento) throws Excepciones {

		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONDepartamento baja = null;
				
		try {		
			entityManager.getTransaction().begin();
				
			baja = entityManager.find(ONDepartamento.class, IDDepartamento);
			
			//Si no existe ese departamento o ya esta a false
			if(baja == null || !baja.getActivo()) {
				throw new Excepciones("No existe el departamento o ya esta dado de baja");
			}
			//Si existe
			else {
				List<ONEmpleado> listaDeEmpleados = baja.getEmpleados_dep();
				
				//Si hay empleados en ese departamento
				if(!listaDeEmpleados.isEmpty()) {
					throw new Excepciones("El departamento no se puede borrar debido a que existen empleados activos en el");
				}
				//Si no hay empleados
				else {
					baja.setActivo(false);
					correcto = true;
					entityManager.getTransaction().commit();
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
		return correcto;
	}

	@Override
	public boolean modificarDepartamento(TransferDepartamento d) throws Excepciones {
		
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONDepartamento modificar = null;
				
		try {		
			entityManager.getTransaction().begin();
			
			if(d == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else {
				
				modificar = entityManager.find(ONDepartamento.class, d.getID_Departamento());
				
				//Si no existe
				if(modificar == null) {
					throw new Excepciones("No existe el departamento");
				}
				else if(d.getNombre().equals("")) {
					throw new Excepciones("Es necesario introducir un nombre");
				}
				else { 
					modificar.setNombre(d.getNombre());
					correcto = true;
					entityManager.getTransaction().commit();
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
		return correcto;
	}

	
	public TransferDepartamento consultarUnDepartamento(int IDDepartamento) throws Excepciones {
		
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONDepartamento consultar = null;
		TransferDepartamento departamento = new TransferDepartamento();
				
		try {		
			entityManager.getTransaction().begin();
			
			consultar = entityManager.find(ONDepartamento.class, IDDepartamento);

			//Si no existe
			if(consultar == null) {
				throw new Excepciones("No existe el departamento");
			}
			else {
				departamento.setID_Departamento(consultar.getIDDepartamento());
				departamento.setNombre(consultar.getNombre());
				departamento.setActivo(consultar.getActivo());
				
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
		return departamento;
	}
	

	@Override
	public ArrayList<TransferDepartamento> listarDepartamentos() throws Excepciones {

		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		TypedQuery<ONDepartamento> query = null;
		List<ONDepartamento> listar = null;
		ArrayList<TransferDepartamento> listaDepartamentos = new ArrayList<TransferDepartamento>();
		
				
		try {		
			entityManager.getTransaction().begin();
			
			query = entityManager.createNamedQuery("queryListarDept", ONDepartamento.class);
			listar = query.getResultList();

			for(int i = 0; i < listar.size(); i++) {
				listaDepartamentos.add(listar.get(i).toTransfer());
			}
			
			entityManager.getTransaction().commit();
		}
		catch(NoResultException e) {
			entityManager.getTransaction().rollback();
			throw new Excepciones("No existe ningun departamento");
		}
		finally {
			entityManager.close();
		}
		
		return listaDepartamentos;
	}

	@Override
	public Float nominaDepartamento(int IDDepartamento) throws Excepciones {

		float nomina = 0;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONDepartamento departamento = null;
				
		try {		
			entityManager.getTransaction().begin();
				
			departamento = entityManager.find(ONDepartamento.class, IDDepartamento);
			
			//Si no existe ese departamento o ya esta a false
			if(departamento == null || !departamento.getActivo()) {
				throw new Excepciones("No existe el departamento o esta dado de baja");
			}
			//Si existe
			else {
				 
				List<ONEmpleado> listaDeEmpleados = departamento.getEmpleados_dep();
				
				//La nomina es la suma de las nominas de los empleados
				for(int i = 0; i < listaDeEmpleados.size(); i++) {
					entityManager.lock(listaDeEmpleados.get(i),LockModeType.OPTIMISTIC_FORCE_INCREMENT); 
					nomina += listaDeEmpleados.get(i).calcularNomina();
				}
				
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

	@Override
	public ArrayList<TransferEmpleado> listarEmpleadosDept(int IDDepartamento) throws Excepciones {
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		
		List<ONEmpleado> listar = null;
		ONDepartamento consultar = null;
		ArrayList<TransferEmpleado> listaEmpleados = new ArrayList<TransferEmpleado>();
		
				
		try {		
			entityManager.getTransaction().begin();
			
			consultar = entityManager.find(ONDepartamento.class, IDDepartamento);
			
			if(consultar == null){
				throw new Excepciones("No existe el departamento");
			}
			else {
				
				if(consultar.getActivo()) {
					
					
					
					listar = consultar.getEmpleados_dep();
					
					if(listar.isEmpty()) {
						throw new Excepciones("No existen empleados para dicho departamento");
					}
					else {

						for(int i = 0; i< listar.size(); i++) {
							listaEmpleados.add(listar.get(i).toTransfer());
						}
						
						entityManager.getTransaction().commit();
					}
				
					
				}
				else {
					throw new Excepciones("El departamento esta dado de baja");
				}
				
			}
			
		}
		catch(Excepciones e) {
			entityManager.getTransaction().rollback();
			throw e;
		}
		finally {
			entityManager.close();
		}
		
		return listaEmpleados;
	}

	@Override
	public ArrayList<TransferProvDept> listarProveedoresDept(int IDDepartamento) throws Excepciones {
		
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		List<Suministra> listar = null;
		ONDepartamento consultar = null;
		ArrayList<TransferProvDept> listaProvDept = new ArrayList<TransferProvDept>();
		
		try {		
			entityManager.getTransaction().begin();
			
			consultar = entityManager.find(ONDepartamento.class, IDDepartamento);
			
			if(consultar == null){
				throw new Excepciones("No existe el departamento");
			}
			else {
				
				if(consultar.getActivo()) {
					
					listar = consultar.getProveedores_dep();
					
					if(listar.isEmpty()) {
						throw new Excepciones("No existen proveedores para dicho departamento");
					}
					else {
						
						for(int i = 0; i < listar.size(); i++) {
							listaProvDept.add(listar.get(i).toTransfer());
						}
						
						entityManager.getTransaction().commit();
					}
					
				}
				else {
					throw new Excepciones("El departamento esta dado de baja");
				}
			}
		}
		catch(Excepciones e) {
			entityManager.getTransaction().rollback();
			throw e;
		}
		finally {
			entityManager.close();
		}
		
		return listaProvDept;
	}
}
