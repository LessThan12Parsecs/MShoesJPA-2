package negocio.empleado;


public class TransferEmpleado {
	
	private int ID_Empleado;
	private String DNI;
	private String nombre;
	private String apellidos;
	private Boolean activo;
	//Foreign key
	private Integer Departamento_emp;
	private Float nomina;
	
	
	public TransferEmpleado() {
		ID_Empleado = 0;
	}
	
	public int getIDEmpleado() {
		return ID_Empleado;
	}

	public void setIDEmpleado(int iDEmpleado) {
		ID_Empleado = iDEmpleado;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Integer getDepartamento_emp() {
		return Departamento_emp;
	}

	public void setDepartamento_emp(Integer departamentoEmpleado) {
		this.Departamento_emp = departamentoEmpleado;
	}
	
	//Solo lo utilizamos para mostrarlo en la lista
	public Float getNomina() {
		return nomina;
	}

	public void setNomina(Float nomina) {
		this.nomina = nomina;
	}

	public String toString() {
		return ID_Empleado + " " + DNI + " "
				+ nombre + " " + apellidos + " "
				+ activo;
	}
}
