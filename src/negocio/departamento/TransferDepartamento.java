package negocio.departamento;

import java.util.List;

import negocio.proveedor.TransferProveedor;


public class TransferDepartamento {
	
	private int ID_Departamento;
	private String nombre;
	private Boolean activo;
	private List<TransferProveedor> Proveedores_dep;
	
	public TransferDepartamento() {
		ID_Departamento = 0;
	}
	
	public int getID_Departamento() {
		return ID_Departamento;
	}

	public void setID_Departamento(int iD_Departamento) {
		ID_Departamento = iD_Departamento;
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
	
	public List<TransferProveedor> getProveedores_dep() {
		return Proveedores_dep;
	}

	public void setProveedores_dep(List<TransferProveedor> proveedores_dep) {
		Proveedores_dep = proveedores_dep;
	}

	public String toString() {
		return ID_Departamento + " " + nombre + " " + activo;
	}	
}
