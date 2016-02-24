package presentacion.proveedor;

import presentacion.comando.IDEventos;

public class ProveedorGUIImp extends ProveedorGUI{

	private static PanelProveedor pProveedor;
	
	
	public void update(IDEventos evento_actual, Object datos) {
		
		switch (evento_actual) {

		case EVENTO_ALTA_PROVEEDOR:
		case ERROR_EVENTO_ALTA_PROVEEDOR:
			getPanelProveedor().actualizarVentanaAlta(evento_actual, datos);
			break;
			
		case EVENTO_BAJA_PROVEEDOR:
		case ERROR_EVENTO_BAJA_PROVEEDOR:
			getPanelProveedor().actualizarVentanaBorra(evento_actual, datos);
			break;
			
		case EVENTO_CONSULTAR_UN_PROVEEDOR:
		case ERROR_EVENTO_CONSULTAR_UN_PROVEEDOR:
			getPanelProveedor().actualizarVentanaConsulta(evento_actual, datos);
			break;
			
		case EVENTO_LISTAR_PROVEEDORES:
		case ERROR_EVENTO_LISTAR_PROVEEDORES:
			getPanelProveedor().actualizarVentanaListar(evento_actual, datos);
			break;
			
		case EVENTO_MODIFICAR_PROVEEDOR:
		case ERROR_EVENTO_MODIFICAR_PROVEEDOR:
			getPanelProveedor().actualizarVentanaModificar(evento_actual, datos);
			break;
			
		case EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO:
		case ERROR_EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO:
			getPanelProveedor().actualizarVentanaAnadir(evento_actual, datos);
			break;
			
		case EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO:
		case ERROR_EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO:
			getPanelProveedor().actualizarVentanaEliminar(evento_actual, datos);
			break;
			
		default:
			break;

		}
	}

	public PanelProveedor getPanelProveedor() {
		
		if(pProveedor == null)
			pProveedor = new PanelProveedor();
		
		return pProveedor;
	}

}
