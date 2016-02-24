package negocio.empleado;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Tiempo_Completo")
@PrimaryKeyJoinColumn(referencedColumnName="ID_Empleado")
public class ONEmpleadoTCompleto extends ONEmpleado{
	
	
	private Float salario;
	private Float impuesto;
	
	public ONEmpleadoTCompleto () {
		super();
	}
	
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
	
	public Float calcularNomina() {
		float nominaCompleto = 0;
		float retencion = this.getSalario()*(this.getImpuesto()/100);
		
		nominaCompleto = this.getSalario() - retencion;
		
		return nominaCompleto;
	}	
	
	public String toString() {
		return super.toString() + " " + salario + " "
				+ impuesto;
	}

}
