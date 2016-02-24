package presentacion.comando.empleado;

import integracion.transacciones.conexion.Excepciones;
import negocio.empleado.TransferEmpleado;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class ModificarEmpleado implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSAEmpleado().modificarEmpleado((TransferEmpleado) datos));
			cr.setEvento(IDEventos.EVENTO_MODIFICAR_EMPLEADO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_MODIFICAR_EMPLEADO);
		}
		return cr;
	}
}
