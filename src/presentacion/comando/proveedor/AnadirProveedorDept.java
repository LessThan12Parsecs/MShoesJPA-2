package presentacion.comando.proveedor;

import integracion.transacciones.conexion.Excepciones;
import negocio.departamento.TransferProvDept;
import negocio.serviciosAplicacion.FactorySA;
import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;

public class AnadirProveedorDept implements Comando{

	@Override
	public CommandResponse ejecutar(Object datos) {
		
		CommandResponse cr = new CommandResponse();
		try {
			cr.setDatos(FactorySA.getInstance().getSAProveedor().anadirProvDept((TransferProvDept) datos));
			cr.setEvento(IDEventos.EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO);
		}
		catch (Excepciones e) {
			cr.setDatos(e);
			cr.setEvento(IDEventos.ERROR_EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO);
		}
		return cr;
	}
}
