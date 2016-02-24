package negocio.empleado;


public class TransferEmpleadoTCompleto extends TransferEmpleado{
	
	private Float salario;
	private Float impuesto;
	

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public Float getImpuesto() {
		return impuesto;
	}

	public void setImpuesto(Float impuesto) {
		this.impuesto = impuesto;
	}


	public String toString() {
		return salario + " "
				+ impuesto;
	}	
}
