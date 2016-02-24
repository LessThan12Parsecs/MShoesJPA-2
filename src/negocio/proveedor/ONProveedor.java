package negocio.proveedor;

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

import negocio.departamento.Suministra;

@Entity
@Table(name="Proveedor")
@NamedQueries({
	@NamedQuery(name = "queryConsultarProvPorNombre", query = "SELECT pv FROM ONProveedor pv WHERE pv.nombre = :nombre"),
	@NamedQuery(name = "queryListarProv", query = "SELECT pv FROM ONProveedor pv"),
})


public class ONProveedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Proveedor;
	private String nombre;
	private Boolean activo;
	
	@Version
	private int version;

	
	public int getIDProveedor() {
		return ID_Proveedor;
	}

	public void setIDProveedor(int iDProveedor) {
		ID_Proveedor = iDProveedor;
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
	
	//Relacion M - N
	@OneToMany(mappedBy ="ID_Proveedor")
	private List<Suministra> Departamentos_prov;
	
	
	public List<Suministra> getDepartamentos_prov() {
		return Departamentos_prov;
	}

	public void setDepartamentos_prov(List<Suministra> departamentos_prov) {
		Departamentos_prov = departamentos_prov;
	}
	
	public TransferProveedor toTransfer() {
		TransferProveedor p = new TransferProveedor();
		
		p.setIDProveedor(ID_Proveedor);
		p.setNombre(nombre);
		p.setActivo(activo);
		
		return p;
	}

	public String toString() {
		return ID_Proveedor + " " + nombre + " " + " " + activo;
	}	
}
