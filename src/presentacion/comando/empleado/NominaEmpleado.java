package presentacion.comando.empleado;

import integracion.transacciones.conexion.Excepciones;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class NominaEmpleado implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSAEmpleado().nominaEmpleado((Integer) datos));
			cr.setEvento(IDEventos.EVENTO_NOMINA_EMPLEADO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_NOMINA_EMPLEADO);
		}
		return cr;
	}
}
