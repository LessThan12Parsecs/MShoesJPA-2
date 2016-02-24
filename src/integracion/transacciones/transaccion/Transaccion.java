package integracion.transacciones.transaccion;

import integracion.transacciones.conexion.Excepciones;

public interface Transaccion {
	public void start() throws Excepciones;
	public void commit() throws Excepciones;
	public void rollback() throws Excepciones;
	public Object getResource();
}
