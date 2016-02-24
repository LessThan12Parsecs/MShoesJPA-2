package negocio.departamento;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import negocio.proveedor.ONProveedor;

@Entity
@Table(name="Suministra")
public class Suministra {

	@EmbeddedId private IdSuministra id;

	@ManyToOne
	@JoinColumn(name = "ID_DEPARTAMENTO")
	@MapsId private ONDepartamento ID_Departamento;
	
	@ManyToOne
	@JoinColumn(name = "ID_PROVEEDOR")
	@MapsId private ONProveedor ID_Proveedor;
	
	@Temporal(TemporalType.DATE)
	private Date fecha_Contratacion;

	public Suministra() {}
	
	public Suministra(ONDepartamento dept, ONProveedor prov, Date fecha) {
		this.ID_Departamento = dept;
		this.ID_Proveedor = prov;
		this.fecha_Contratacion = fecha;
	}
	
	
	public IdSuministra getId() {
		return id;
	}

	public void setId(IdSuministra id) {
		this.id = id;
	}

	public ONDepartamento getID_Departamento() {
		return ID_Departamento;
	}

	public ONProveedor getID_Proveedor() {
		return ID_Proveedor;
	}

	public Date get_Fecha_Contratacion() {
		return fecha_Contratacion;
	}
	
	public TransferProvDept toTransfer() {
		TransferProvDept pd = new TransferProvDept();
		
		pd.setID_Departamento(ID_Departamento.getIDDepartamento());
		pd.setID_Proveedor(ID_Proveedor.getIDProveedor());
		pd.setFecha_Contratacion(fecha_Contratacion);
		pd.setNombreDept(ID_Departamento.getNombre());
		pd.setNombreProv(ID_Proveedor.getNombre());
		
		return pd;
	}
	
	@Override
	public String toString() {
		return ID_Departamento
				+ " " + ID_Proveedor + " "
				+ fecha_Contratacion;
	}
	
}
