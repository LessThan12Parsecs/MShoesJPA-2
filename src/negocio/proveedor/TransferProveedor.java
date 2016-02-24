package negocio.proveedor;


public class TransferProveedor {
	
	private int ID_Proveedor;
	private String nombre;
	private Boolean activo;
	
	public TransferProveedor() {
		ID_Proveedor = 0;
	}
	
	public int getIDProveedor() {
		return ID_Proveedor;
	}

	public void setIDProveedor(int IDProveedor) {
		ID_Proveedor = IDProveedor;
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

	
	public String toString() {
		return ID_Proveedor + " " + nombre + " " + " " + activo;
	}	
}
