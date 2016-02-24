package integracion.query.factoriaQuery;

import integracion.query.TopProducto;
import integracion.query.TopTenClientes;

public class FactoriaQueryImp extends FactoriaQuery{

	@Override
	public TopTenClientes getTopTenClientes() {
		return new TopTenClientes();
	}

	@Override
	public TopProducto getTopProducto() {
		return new TopProducto();
	}
}
