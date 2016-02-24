package negocio.empleado;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

public interface SAEmpleado {
	public boolean altaEmpleado(TransferEmpleado e) throws Excepciones;
	public boolean bajaEmpleado(int IDEmpleado) throws Excepciones;
	public boolean modificarEmpleado(TransferEmpleado e) throws Excepciones;
	public TransferEmpleado consultarUnEmpleado(int IDEmpleado) throws Excepciones;
	public ArrayList<TransferEmpleado> listarEmpleados() throws Excepciones;
	public float nominaEmpleado(int IDEmpleado) throws Excepciones;
}