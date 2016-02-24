package integracion.query.factoriaQuery;

import integracion.query.TopProducto;
import integracion.query.TopTenClientes;

public abstract class FactoriaQuery {
	
	private static FactoriaQuery instance;
	
	private synchronized static void createQueryFactory()
	{
		if(instance == null)
			instance = new FactoriaQueryImp();
	}
	
	public static synchronized FactoriaQuery getInstance()
	{
		createQueryFactory();
		return instance;
	}
	
	public abstract TopTenClientes getTopTenClientes();
	public abstract TopProducto getTopProducto();

}
