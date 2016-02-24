package presentacion.comando.empleado;

import integracion.transacciones.conexion.Excepciones;
import negocio.empleado.TransferEmpleado;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class AltaEmpleado implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSAEmpleado().altaEmpleado((TransferEmpleado) datos));
			cr.setEvento(IDEventos.EVENTO_ALTA_EMPLEADO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_ALTA_EMPLEADO);
		}
		return cr;
	}
}
