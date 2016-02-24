package negocio.serviciosAplicacion;

import negocio.cliente.SACliente;
import negocio.departamento.SADepartamento;
import negocio.empleado.SAEmpleado;
import negocio.producto.SAProducto;
import negocio.proveedor.SAProveedor;
import negocio.venta.SAVenta;


public abstract class FactorySA 
{
	private static FactorySA factorySAInstance;
	
	private synchronized static void createFactorySA()
	{
		if(factorySAInstance == null)
			factorySAInstance = new FactorySAImp();
	}
	
	public static synchronized FactorySA getInstance()
	{
		createFactorySA();
		return factorySAInstance;
	}
	
	public abstract SACliente getSACliente();
	public abstract SAProducto getSAProducto();
	public abstract SAVenta getSAVenta();
	public abstract SAEmpleado getSAEmpleado();
	public abstract SADepartamento getSADepartamento();
	public abstract SAProveedor getSAProveedor();
}
