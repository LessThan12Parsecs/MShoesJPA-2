package negocio.proveedor;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

import negocio.departamento.TransferProvDept;

public interface SAProveedor {
	public boolean altaProveedor(TransferProveedor pv) throws Excepciones;
	public boolean bajaProveedor(int IDProveedor) throws Excepciones;
	public boolean modificarProveedor(TransferProveedor pv) throws Excepciones;
	public TransferProveedor consultarUnProveedor(int IDProveedor) throws Excepciones;
	public ArrayList<TransferProveedor> listarProveedores() throws Excepciones;
	//Hemos añadido estos dos metodos en esta clase porque la clase SADepartamento se nos hacia muy extensa a la hora de mostrar
	//el menu de sus posibles operaciones. Acordado con el profesor.
	public boolean anadirProvDept(TransferProvDept transferAnadir) throws Excepciones;
	public boolean eliminarProvDept(TransferProvDept transferEliminar) throws Excepciones;
}