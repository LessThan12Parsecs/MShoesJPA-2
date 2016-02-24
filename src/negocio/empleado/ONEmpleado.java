package negocio.empleado;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Version;

import negocio.departamento.ONDepartamento;


@Entity
@Table(name="Empleado")
@Inheritance( strategy = InheritanceType.JOINED )
@NamedQueries({
	@NamedQuery(name = "queryConsultarEmplPorDNI", query = "SELECT e FROM ONEmpleado e WHERE e.DNI = :DNI"),
	@NamedQuery(name = "queryListarEmpl", query = "SELECT e FROM ONEmpleado e ORDER BY e.ID_Empleado"),
})


public abstract class ONEmpleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int ID_Empleado;
	private String DNI;
	private String nombre;
	private String apellidos;
	private Boolean activo;
	
	
	@Version
	private int version;
	
	
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

	//Relacion entre departamento y empleado 
	@ManyToOne(targetEntity=ONDepartamento.class, cascade = CascadeType.REFRESH, optional = true)
	@JoinColumn(name = "ID_DEPARTAMENTO")
	private ONDepartamento Departamento_emp;
	public ONDepartamento getDepartamento_emp() {
		return Departamento_emp;
	}

	public void setDepartamento_Emp(ONDepartamento departamentoEmpleado) {
		this.Departamento_emp = departamentoEmpleado;
	}
	
	public TransferEmpleado toTransfer() {
		TransferEmpleado e = new TransferEmpleado();
		
		e.setIDEmpleado(this.ID_Empleado);
		e.setNombre(this.nombre);
		e.setApellidos(apellidos);
		//e.setDepartamento_emp(Departamento_emp.getIDDepartamento());
		e.setDNI(DNI);
		e.setActivo(this.activo);
		
		return e;
	}
	
	public abstract Float calcularNomina();
	
	public String toString() {
		return ID_Empleado + " " + DNI + " "
				+ nombre + " " + apellidos + " "
				+ activo;
	}
	
}
