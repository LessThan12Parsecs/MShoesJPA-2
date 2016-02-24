package negocio.proveedor;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import negocio.departamento.IdSuministra;
import negocio.departamento.ONDepartamento;
import negocio.departamento.Suministra;
import negocio.departamento.TransferProvDept;
import negocio.jpa.EntityManagerFactoryMShoes;

public class SAProveedorImp implements SAProveedor{

	@Override
	public boolean altaProveedor(TransferProveedor pv) throws Excepciones {
	
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		TypedQuery<ONProveedor> query = null;
		ONProveedor nuevoProveedor = null;
				
		try {		
			entityManager.getTransaction().begin();
			
			if(pv == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else if(pv.getNombre().equals("")){
				throw new Excepciones("Es necesario introducir un nombre");
			}
			else {
				query = entityManager.createNamedQuery("queryConsultarProvPorNombre", ONProveedor.class);
				query.setParameter("nombre", pv.getNombre());
				nuevoProveedor = query.getSingleResult();
				
				//Si existe y activo es true
				if(nuevoProveedor.getActivo()) {
					throw new Excepciones("El proveedor ya existe");
				}
				//Reactivacion
				else {
					nuevoProveedor.setActivo(true);
					entityManager.merge(nuevoProveedor);
					entityManager.getTransaction().commit();
					correcto = true;
				}
			}
		}
		//Si no existia
		catch (NoResultException e) {
			
			nuevoProveedor = new ONProveedor();
			nuevoProveedor.setIDProveedor(pv.getIDProveedor());
			nuevoProveedor.setNombre(pv.getNombre());
			nuevoProveedor.setActivo(true);
		    
			entityManager.persist(nuevoProveedor);
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
	public boolean bajaProveedor(int IDProveedor) throws Excepciones {

		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONProveedor baja = null;
				
		try {		
			entityManager.getTransaction().begin();
				
			baja = entityManager.find(ONProveedor.class, IDProveedor);
			
			//Si no existe ese proveedor o ya esta a false
			if(baja == null || !baja.getActivo()) {
				throw new Excepciones("No existe el proveedor o ya esta dado de baja");
			}
			//Si existe
			else {
				List<Suministra> listaDeDepartamentos = baja.getDepartamentos_prov();
			
				//Si aun tiene departamentos
				if(!listaDeDepartamentos.isEmpty()) {
					throw new Excepciones("El proveedor no se puede borrar debido a que proporciona servicios a algun departamento activo");
				}
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
	public boolean modificarProveedor(TransferProveedor pv) throws Excepciones {
		
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONProveedor modificar = null;
				
		try {		
			entityManager.getTransaction().begin();
			
			if(pv == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else {
				
				modificar = entityManager.find(ONProveedor.class, pv.getIDProveedor());
				
				//Si no existe
				if(modificar == null) {
					throw new Excepciones("No existe el proveedor");
				}
				else if(pv.getNombre().equals("")) {
					throw new Excepciones("Es necesario introducir un nombre");
				}
				else {
					modificar.setNombre(pv.getNombre());
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

	
	public TransferProveedor consultarUnProveedor(int IDProveedor) throws Excepciones {
		
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONProveedor consultar = null;
		TransferProveedor proveedor = new TransferProveedor();
				
		try {		
			entityManager.getTransaction().begin();
			
			consultar = entityManager.find(ONProveedor.class, IDProveedor);

			//Si no existe
			if(consultar == null) {
				throw new Excepciones("No existe el proveedor");
			}
			else {
				proveedor.setIDProveedor(consultar.getIDProveedor());
				proveedor.setNombre(consultar.getNombre());
				proveedor.setActivo(consultar.getActivo());
				
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
		
		return proveedor;
	}
	


	@Override
	public ArrayList<TransferProveedor> listarProveedores() throws Excepciones {

		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		TypedQuery<ONProveedor> query = null;
		List<ONProveedor> listar = null;
		ArrayList<TransferProveedor> listaProveedores = new ArrayList<TransferProveedor>();
				
		try {		
			entityManager.getTransaction().begin();
			
			query = entityManager.createNamedQuery("queryListarProv", ONProveedor.class);
			listar = query.getResultList();
			
			for(int i = 0; i < listar.size(); i++) {
				listaProveedores.add(listar.get(i).toTransfer());
			}
			
			entityManager.getTransaction().commit();
		}
		catch(NoResultException e) {
			entityManager.getTransaction().rollback();
			throw new Excepciones("No existe ningun proveedor");
		}
		finally {
			entityManager.close();
		}
		
		return listaProveedores;
	}
	
	
	@Override
	public boolean anadirProvDept(TransferProvDept transferAnadir) throws Excepciones {
		
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONDepartamento departamento = null;
		ONProveedor proveedor = null;
		
		
		try {		
			entityManager.getTransaction().begin();
			
			if(transferAnadir == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else {
				
				departamento = entityManager.find(ONDepartamento.class, transferAnadir.getID_Departamento());
				
				//Si no existe
				if(departamento == null) {
					throw new Excepciones("No existe el departamento");
				}
				else if(!departamento.getActivo()) {
					throw new Excepciones("El departamento esta dado de baja");
				}
				else {
					
					proveedor = entityManager.find(ONProveedor.class, transferAnadir.getID_Proveedor());
					
					//Si no existe
					if(proveedor == null) {
						throw new Excepciones("No existe el proveedor");
					}
					else if(!proveedor.getActivo()) {
						throw new Excepciones("El proveedor esta dado de baja");
					}
					else {
						
						entityManager.lock(departamento,LockModeType.OPTIMISTIC_FORCE_INCREMENT);   
						entityManager.lock(proveedor,LockModeType.OPTIMISTIC_FORCE_INCREMENT);
						
						//Buscamos por la clave compuesta en Suministra
						IdSuministra idCompuesta = new IdSuministra(transferAnadir.getID_Departamento(), transferAnadir.getID_Proveedor());
						Suministra fila = entityManager.find(Suministra.class, idCompuesta);
						
						//Si ya existia la fila
						if(fila != null) {
							throw new Excepciones("El proveedor ya esta asignado a ese departamento");
						}
						//Si no existia
						else {
							//Cargamos la fecha
							java.util.Date date = new Date();
							java.sql.Date fecha = new java.sql.Date(date.getTime());
							
							//Creamos la nueva fila y la persistimos
							fila = new Suministra(departamento, proveedor, fecha);
							
							entityManager.persist(fila);
							correcto = true;
							entityManager.getTransaction().commit();
						} 
					}
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
	public boolean eliminarProvDept(TransferProvDept transferEliminar) throws Excepciones {
	
		boolean correcto = false;
		EntityManagerFactory entityMF = EntityManagerFactoryMShoes.getEntityManagerFactory();
		EntityManager entityManager = entityMF.createEntityManager();
		ONDepartamento departamento = null;
		ONProveedor proveedor = null;
				
		try {		
			entityManager.getTransaction().begin();
			
			if(transferEliminar == null) {
				throw new Excepciones("El transfer esta vacio");
			}
			else {
				
				departamento = entityManager.find(ONDepartamento.class, transferEliminar.getID_Departamento());
				
				//Si no existe
				if(departamento == null) {
					throw new Excepciones("No existe el departamento");
				}
				else if(!departamento.getActivo()) {
					throw new Excepciones("El departamento esta dado de baja");
				}
				else {
					
					proveedor = entityManager.find(ONProveedor.class, transferEliminar.getID_Proveedor());
					
					//Si no existe
					if(proveedor == null) {
						throw new Excepciones("No existe el proveedor");
					}
					else if(!proveedor.getActivo()) {
						throw new Excepciones("El proveedor esta dado de baja");
					}
					else {
						
						entityManager.lock(departamento,LockModeType.OPTIMISTIC_FORCE_INCREMENT);   
						entityManager.lock(proveedor,LockModeType.OPTIMISTIC_FORCE_INCREMENT);
						
						//Buscamos por la clave compuesta en Suministra
						IdSuministra idCompuesta = new IdSuministra(transferEliminar.getID_Departamento(), transferEliminar.getID_Proveedor());
						Suministra fila = entityManager.find(Suministra.class, idCompuesta);
						
						//Si no existia la fila
						if(fila == null) {
							throw new Excepciones("El proveedor no esta asignado a ese departamento");
						}
						//Si existia la borramos
						else {
							entityManager.remove(fila);
							correcto = true;
							entityManager.getTransaction().commit();
						}
					}
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
}
