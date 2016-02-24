package presentacion.comando.departamento;

import integracion.transacciones.conexion.Excepciones;
import negocio.departamento.TransferDepartamento;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class ModificarDepartamento implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSADepartamento().modificarDepartamento((TransferDepartamento) datos));
			cr.setEvento(IDEventos.EVENTO_MODIFICAR_DEPARTAMENTO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_MODIFICAR_DEPARTAMENTO);
		}
		return cr;
	}
}
