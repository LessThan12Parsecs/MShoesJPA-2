package presentacion.comando.departamento;

import integracion.transacciones.conexion.Excepciones;

import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class BajaDepartamento implements Comando {

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSADepartamento().bajaDepartamento((Integer) datos));
			cr.setEvento(IDEventos.EVENTO_BAJA_DEPARTAMENTO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_BAJA_DEPARTAMENTO);
		}
		return cr;
	}
}
