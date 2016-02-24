package presentacion.comando.departamento;

import integracion.transacciones.conexion.Excepciones;
import negocio.departamento.TransferDepartamento;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class AltaDepartamento implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSADepartamento().altaDepartamento((TransferDepartamento) datos));
			cr.setEvento(IDEventos.EVENTO_ALTA_DEPARTAMENTO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_ALTA_DEPARTAMENTO);
		}
		return cr;
	}
}
