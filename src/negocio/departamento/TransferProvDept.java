package negocio.departamento;

import java.util.Date;

public class TransferProvDept {

	private Integer ID_Departamento;
	private Integer ID_Proveedor;
	private Date fecha_Contratacion;
	private String nombreProv;
	private String nombreDept;
	
	public Integer getID_Departamento() {
		return ID_Departamento;
	}
	public void setID_Departamento(Integer iD_Departamento) {
		ID_Departamento = iD_Departamento;
	}
	public Integer getID_Proveedor() {
		return ID_Proveedor;
	}
	public void setID_Proveedor(Integer iD_Proveedor) {
		ID_Proveedor = iD_Proveedor;
	}
	
	public Date getFecha_Contratacion() {
		return fecha_Contratacion;
	}
	public void setFecha_Contratacion(Date fecha_Contratacion) {
		this.fecha_Contratacion = fecha_Contratacion;
	}
	
	public String getNombreProv() {
		return nombreProv;
	}
	public void setNombreProv(String nombreProv) {
		this.nombreProv = nombreProv;
	}
	public String getNombreDept() {
		return nombreDept;
	}
	public void setNombreDept(String nombreDept) {
		this.nombreDept = nombreDept;
	}
	@Override
	public String toString() {
		return ID_Departamento + " " + ID_Proveedor;
	}
}
