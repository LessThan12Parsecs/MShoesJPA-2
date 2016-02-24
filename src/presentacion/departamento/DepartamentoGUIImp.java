package presentacion.departamento;

import presentacion.comando.IDEventos;

public class DepartamentoGUIImp extends DepartamentoGUI{

	private static PanelDepartamento pDepartamento;
	
	
	public void update(IDEventos evento_actual, Object datos) {
		
		switch (evento_actual) {

		case EVENTO_ALTA_DEPARTAMENTO:
		case ERROR_EVENTO_ALTA_DEPARTAMENTO:
			getPanelDepartamento().actualizarVentanaAlta(evento_actual, datos);
			break;
			
		case EVENTO_BAJA_DEPARTAMENTO:
		case ERROR_EVENTO_BAJA_DEPARTAMENTO:
			getPanelDepartamento().actualizarVentanaBorra(evento_actual, datos);
			break;
			
		case EVENTO_CONSULTAR_UN_DEPARTAMENTO:
		case ERROR_EVENTO_CONSULTAR_UN_DEPARTAMENTO:
			getPanelDepartamento().actualizarVentanaConsulta(evento_actual, datos);
			break;
			
		case EVENTO_LISTAR_DEPARTAMENTOS:
		case ERROR_EVENTO_LISTAR_DEPARTAMENTOS:
			getPanelDepartamento().actualizarVentanaListar(evento_actual, datos);
			break;
			
		case EVENTO_MODIFICAR_DEPARTAMENTO:
		case ERROR_EVENTO_MODIFICAR_DEPARTAMENTO:
			getPanelDepartamento().actualizarVentanaModificar(evento_actual, datos);
			break;
			
		case EVENTO_NOMINA_DEPARTAMENTO:
		case ERROR_EVENTO_NOMINA_DEPARTAMENTO:
			getPanelDepartamento().actualizarVentanaNominaDepartamento(evento_actual, datos);
			break;
			
		case EVENTO_EMPLEADOS_DEPARTAMENTO:
		case ERROR_EVENTO_EMPLEADOS_DEPARTAMENTO:
			getPanelDepartamento().actualizarVentanaEmpleadosDept(evento_actual, datos);
			break;
			
		case EVENTO_PROVEEDORES_DEPARTAMENTO:
		case ERROR_EVENTO_PROVEEDORES_DEPARTAMENTO:
			getPanelDepartamento().actualizarVentanaProveedoresDept(evento_actual, datos);
			break;
		default:
			break;

		}
		
	}

	public PanelDepartamento getPanelDepartamento() {
		
		if(pDepartamento == null)
			pDepartamento = new PanelDepartamento();
		
		return pDepartamento;
	}

}
