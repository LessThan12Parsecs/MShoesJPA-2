package presentacion.comando.proveedor;

import integracion.transacciones.conexion.Excepciones;
import negocio.proveedor.TransferProveedor;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class ModificarProveedor implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSAProveedor().modificarProveedor((TransferProveedor) datos));
			cr.setEvento(IDEventos.EVENTO_MODIFICAR_PROVEEDOR);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_MODIFICAR_PROVEEDOR);
		}
		return cr;
	}
}
