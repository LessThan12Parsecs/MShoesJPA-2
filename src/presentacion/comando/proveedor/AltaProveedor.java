package presentacion.comando.proveedor;

import integracion.transacciones.conexion.Excepciones;
import negocio.proveedor.TransferProveedor;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class AltaProveedor implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSAProveedor().altaProveedor((TransferProveedor) datos));
			cr.setEvento(IDEventos.EVENTO_ALTA_PROVEEDOR);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_ALTA_PROVEEDOR);
		}
		return cr;
	}
}
