package presentacion.comando.producto;

import integracion.transacciones.conexion.Excepciones;

import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class ListarProducto implements Comando{

	public CommandResponse ejecutar(Object datos) {

		CommandResponse cr = new CommandResponse();
		try {

			cr.setDatos(FactorySA.getInstance().getSAProducto().listarProductos());
			cr.setEvento(IDEventos.EVENTO_LISTAR_PRODUCTOS);

		} catch (Excepciones excep) {

			cr.setDatos(excep);
			cr.setEvento(IDEventos.ERROR_EVENTO_LISTAR_PRODUCTOS);
		} 

		return cr;
	}
}
