package negocio.empleado;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="Tiempo_Parcial")
@PrimaryKeyJoinColumn(referencedColumnName="ID_Empleado")
public class ONEmpleadoTParcial extends ONEmpleado{
	
	private Float horas;
	private Float salario_Hora;
	
	public ONEmpleadoTParcial () {
		super();
	}
	
	public Float getHoras() {
		return horas;
	}

	public void setHoras(Float horas) {
		this.horas = horas;
	}

	public Float getSalario_Hora() {
		return salario_Hora;
	}

	public void setSalario_Hora(Float salario_Hora) {
		this.salario_Hora = salario_Hora;
	}

	
	public Float calcularNomina() {
		float nominaParcial = 0;
		nominaParcial = this.getSalario_Hora()*this.getHoras();
		
		return nominaParcial;
	}	

	public String toString() {
		return super.toString() + " " + salario_Hora + " "
				+ horas;
	}

}
