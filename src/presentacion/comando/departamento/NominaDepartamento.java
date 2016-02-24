package presentacion.comando.departamento;

import integracion.transacciones.conexion.Excepciones;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class NominaDepartamento implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSADepartamento().nominaDepartamento((Integer) datos));
			cr.setEvento(IDEventos.EVENTO_NOMINA_DEPARTAMENTO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_NOMINA_DEPARTAMENTO);
		}
		return cr;
	}
}
