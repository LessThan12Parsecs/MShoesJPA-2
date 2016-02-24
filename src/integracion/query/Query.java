package integracion.query;

import integracion.transacciones.conexion.Excepciones;

public interface Query {

	public Object execute(Object o) throws Excepciones;
}
