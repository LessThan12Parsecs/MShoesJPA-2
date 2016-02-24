package negocio.empleado;


public class TransferEmpleadoTParcial extends TransferEmpleado{
	
	private Float horas;
	private Float salarioHoras;
	

	public Float getHoras() {
		return horas;
	}

	public void setHoras(Float horas) {
		this.horas = horas;
	}

	public Float getSalarioHoras() {
		return salarioHoras;
	}

	public void setSalarioHoras(Float salarioHoras) {
		this.salarioHoras = salarioHoras;
	}	

	public String toString() {
		return horas + " " 
				+ salarioHoras;
	}	
}
