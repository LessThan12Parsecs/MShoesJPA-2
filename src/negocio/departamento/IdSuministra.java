package negocio.departamento;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class IdSuministra implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int ID_Departamento;
	private int ID_Proveedor;
	
	public IdSuministra() {}
	public IdSuministra(int ID_Departamento, int ID_Proveedor) {
		this.ID_Departamento = ID_Departamento;
		this.ID_Proveedor = ID_Proveedor;
	}
	
	public int getID_Departamento() {
		return ID_Departamento;
	}
	
	public int getID_Proveedor() {
		return ID_Proveedor;
	}
	
	public boolean equals(Object o) {
		
		return(o instanceof IdSuministra) &&
				ID_Departamento == ((IdSuministra)o).getID_Departamento() &&
				ID_Proveedor == ((IdSuministra)o).getID_Proveedor();
	}

	public int hashCode() {
		return ID_Departamento + ID_Proveedor;
	}

}
