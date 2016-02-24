package presentacion.empleado;

import presentacion.comando.IDEventos;

public class EmpleadoGUIImp extends EmpleadoGUI{

	private static PanelEmpleado pEmpleado;
	
	
	public void update(IDEventos evento_actual, Object datos) {
		
		switch (evento_actual) {

		case EVENTO_ALTA_EMPLEADO:
		case ERROR_EVENTO_ALTA_EMPLEADO:
			getPanelEmpleado().actualizarVentanaAlta(evento_actual, datos);
			break;
			
		case EVENTO_BAJA_EMPLEADO:
		case ERROR_EVENTO_BAJA_EMPLEADO:
			getPanelEmpleado().actualizarVentanaBorra(evento_actual, datos);
			break;
			
		case EVENTO_CONSULTAR_UN_EMPLEADO:
		case ERROR_EVENTO_CONSULTAR_UN_EMPLEADO:
			getPanelEmpleado().actualizarVentanaConsulta(evento_actual, datos);
			break;
			
		case EVENTO_LISTAR_EMPLEADOS:
		case ERROR_EVENTO_LISTAR_EMPLEADOS:
			getPanelEmpleado().actualizarVentanaListar(evento_actual, datos);
			break;
			
		case EVENTO_MODIFICAR_EMPLEADO:
		case ERROR_EVENTO_MODIFICAR_EMPLEADO:
			getPanelEmpleado().actualizarVentanaModificar(evento_actual, datos);
			break;
			
		case EVENTO_NOMINA_EMPLEADO:
		case ERROR_EVENTO_NOMINA_EMPLEADO:
			getPanelEmpleado().actualizarVentanaNomina(evento_actual, datos);
			break;
			
		default:
			break;

		}
		
	}

	public PanelEmpleado getPanelEmpleado() {
		
		if(pEmpleado == null)
			pEmpleado = new PanelEmpleado();
		
		return pEmpleado;
	}

}
