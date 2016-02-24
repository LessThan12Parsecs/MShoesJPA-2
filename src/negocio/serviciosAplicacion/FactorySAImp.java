package negocio.serviciosAplicacion;

import negocio.cliente.SACliente;
import negocio.cliente.SAClienteImp;
import negocio.departamento.SADepartamento;
import negocio.departamento.SADepartamentoImp;
import negocio.empleado.SAEmpleado;
import negocio.empleado.SAEmpleadoImp;
import negocio.producto.SAProducto;
import negocio.producto.SAProductoImp;
import negocio.proveedor.SAProveedor;
import negocio.proveedor.SAProveedorImp;
import negocio.venta.SAVenta;
import negocio.venta.SAVentaImp;


public class FactorySAImp extends FactorySA {

	@Override
	public SACliente getSACliente() {
		return new SAClienteImp();
	}

	@Override
	public SAVenta getSAVenta() {
		return new SAVentaImp();
	}

	@Override
	public SAProducto getSAProducto() {
		return new SAProductoImp();
	}

	@Override
	public SAEmpleado getSAEmpleado() {
		return new SAEmpleadoImp();
	}
	
	@Override
	public SADepartamento getSADepartamento() {
		return new SADepartamentoImp();
	}
	
	@Override
	public SAProveedor getSAProveedor() {
		return new SAProveedorImp();
	}
}
