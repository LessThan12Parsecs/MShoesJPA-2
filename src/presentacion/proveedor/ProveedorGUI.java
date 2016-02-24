package presentacion.proveedor;

import presentacion.comando.IDEventos;



public abstract class ProveedorGUI {

	private static ProveedorGUI ProveedorGUIInstance;

	public abstract void update(IDEventos evento_actual, Object datos);

	public static synchronized ProveedorGUI getInstance() {

		createProveedorGUI();

		return ProveedorGUIInstance;
	}

	private static synchronized void createProveedorGUI() {

		if (ProveedorGUIInstance == null) {
			ProveedorGUIInstance = new ProveedorGUIImp();
		}
	}
	
	public abstract PanelProveedor getPanelProveedor();

}
