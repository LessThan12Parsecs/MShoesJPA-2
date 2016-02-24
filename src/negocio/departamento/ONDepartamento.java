package negocio.departamento;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import negocio.empleado.ONEmpleado;

@Entity
@Table(name="Departamento")
@NamedQueries({
	@NamedQuery(name = "queryConsultarDeptPorNombre", query = "SELECT d FROM ONDepartamento d WHERE d.nombre = :nombre"),
	@NamedQuery(name = "queryListarDept", query = "SELECT d FROM ONDepartamento d"),
})

public class ONDepartamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int ID_Departamento;
	private String nombre;
	private Boolean activo;
	
	@Version
	private int version;
	
	public int getIDDepartamento() {
		return ID_Departamento;
	}

	public void setIDDepartamento(int iDDepartamento) {
		ID_Departamento = iDDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	
	@OneToMany(targetEntity=ONEmpleado.class, mappedBy = "Departamento_emp")
	private List<ONEmpleado> Empleados_dep;
	public List<ONEmpleado> getEmpleados_dep() {
		return Empleados_dep;
	}

	public void setEmpleados_dep(List<ONEmpleado> empleadosPorDep) {
		this.Empleados_dep = empleadosPorDep;
	}
	
	//Relacion M - N
	@OneToMany(mappedBy ="ID_Departamento")
	private List<Suministra> Proveedores_dep;
	
	
	
	public List<Suministra> getProveedores_dep() {
		return Proveedores_dep;
	}

	public void setProveedores_dep(List<Suministra> proveedores_dep) {
		Proveedores_dep = proveedores_dep;
	}
	
	public TransferDepartamento toTransfer() {
		TransferDepartamento d = new TransferDepartamento();
		
		d.setID_Departamento(this.ID_Departamento);
		d.setNombre(this.nombre);
		d.setActivo(this.activo);
		
		return d;
	}

	public String toString() {
		return ID_Departamento + " " + nombre + " " + activo;
	}	
}
