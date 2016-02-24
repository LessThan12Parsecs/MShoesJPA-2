package presentacion.comando.proveedor;

import integracion.transacciones.conexion.Excepciones;

import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class ConsultarUnProveedor implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSAProveedor().consultarUnProveedor((Integer) datos));
			cr.setEvento(IDEventos.EVENTO_CONSULTAR_UN_PROVEEDOR);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_CONSULTAR_UN_PROVEEDOR);
		}
		return cr;
	}
}
