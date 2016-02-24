package negocio.departamento;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;
import negocio.empleado.TransferEmpleado;

public interface SADepartamento {
	public boolean altaDepartamento(TransferDepartamento d) throws Excepciones;
	public boolean bajaDepartamento(int IDDepartamento) throws Excepciones;
	public boolean modificarDepartamento(TransferDepartamento d) throws Excepciones;
	public TransferDepartamento consultarUnDepartamento(int IDDepartamento) throws Excepciones;
	public ArrayList<TransferDepartamento> listarDepartamentos() throws Excepciones;
	public Float nominaDepartamento(int IDDepartamento) throws Excepciones;
	public ArrayList<TransferEmpleado> listarEmpleadosDept(int IDDepartamento) throws Excepciones;
	public ArrayList<TransferProvDept> listarProveedoresDept(int IDDepartamento) throws Excepciones;
}