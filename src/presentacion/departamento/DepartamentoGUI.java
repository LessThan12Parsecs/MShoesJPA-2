package presentacion.departamento;

import presentacion.comando.IDEventos;



public abstract class DepartamentoGUI {

	private static DepartamentoGUI DepartamentoGUIInstance;

	public abstract void update(IDEventos evento_actual, Object datos);

	public static synchronized DepartamentoGUI getInstance() {

		createEmpleadoGUI();

		return DepartamentoGUIInstance;
	}

	private static synchronized void createEmpleadoGUI() {

		if (DepartamentoGUIInstance == null) {
			DepartamentoGUIInstance = new DepartamentoGUIImp();
		}
	}
	
	public abstract PanelDepartamento getPanelDepartamento();

}
