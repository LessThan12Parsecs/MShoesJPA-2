package presentacion.empleado;

import presentacion.comando.IDEventos;



public abstract class EmpleadoGUI {

	private static EmpleadoGUI EmpleadoGUIInstance;

	public abstract void update(IDEventos evento_actual, Object datos);

	public static synchronized EmpleadoGUI getInstance() {

		createEmpleadoGUI();

		return EmpleadoGUIInstance;
	}

	private static synchronized void createEmpleadoGUI() {

		if (EmpleadoGUIInstance == null) {
			EmpleadoGUIInstance = new EmpleadoGUIImp();
		}
	}
	
	public abstract PanelEmpleado getPanelEmpleado();

}
