package presentacion.comando.factoriaComando;

import presentacion.comando.Comando;
import presentacion.comando.IDEventos;
import presentacion.comando.cliente.AltaCliente;
import presentacion.comando.cliente.BajaCliente;
import presentacion.comando.cliente.ConsultarUnCliente;
import presentacion.comando.cliente.ListarClientes;
import presentacion.comando.cliente.ModificarCliente;
import presentacion.comando.cliente.TopTenClientes;
import presentacion.comando.departamento.AltaDepartamento;
import presentacion.comando.departamento.BajaDepartamento;
import presentacion.comando.departamento.ConsultarUnDepartamento;
import presentacion.comando.departamento.EmpleadosDepartamento;
import presentacion.comando.departamento.ListarDepartamentos;
import presentacion.comando.departamento.ModificarDepartamento;
import presentacion.comando.departamento.NominaDepartamento;
import presentacion.comando.departamento.ProveedoresDepartamento;
import presentacion.comando.empleado.AltaEmpleado;
import presentacion.comando.empleado.BajaEmpleado;
import presentacion.comando.empleado.ConsultarUnEmpleado;
import presentacion.comando.empleado.ListarEmpleados;
import presentacion.comando.empleado.ModificarEmpleado;
import presentacion.comando.empleado.NominaEmpleado;
import presentacion.comando.producto.AltaProducto;
import presentacion.comando.producto.BajaProducto;
import presentacion.comando.producto.ConsultarUnProducto;
import presentacion.comando.producto.ListarProducto;
import presentacion.comando.producto.ModificarProducto;
import presentacion.comando.producto.TopProducto;
import presentacion.comando.proveedor.AltaProveedor;
import presentacion.comando.proveedor.AnadirProveedorDept;
import presentacion.comando.proveedor.BajaProveedor;
import presentacion.comando.proveedor.ConsultarUnProveedor;
import presentacion.comando.proveedor.EliminarProveedorDept;
import presentacion.comando.proveedor.ListarProveedores;
import presentacion.comando.proveedor.ModificarProveedor;
import presentacion.comando.venta.AbrirVenta;
import presentacion.comando.venta.EliminarProductoCarrito;
import presentacion.comando.venta.CerrarVenta;
import presentacion.comando.venta.ConsultarUnaVenta;
import presentacion.comando.venta.Devolucion;
import presentacion.comando.venta.AnadirProductoCarrito;
import presentacion.comando.venta.ListarVentas;


public class CommandFactoryImp extends CommandFactory {

	@Override
	public Comando nuevoComando(IDEventos id_comando) {
		
		Comando comando = null;
		
		switch(id_comando){
			
			//Cliente
			case EVENTO_ALTA_CLIENTE:
				comando = new AltaCliente();
				break;
			case EVENTO_BAJA_CLIENTE:
				comando = new BajaCliente();
				break;
			case EVENTO_CONSULTAR_UN_CLIENTE:
				comando = new ConsultarUnCliente();
				break;
			case EVENTO_LISTAR_CLIENTES:
				comando = new ListarClientes();
				break;
			case EVENTO_MODIFICAR_CLIENTE:
				comando = new ModificarCliente();
				break;
			case EVENTO_TOP_TEN_CLIENTES:
				comando = new TopTenClientes();
				break;
	
				
			//Producto
			case EVENTO_ALTA_PRODUCTO:
				comando = new AltaProducto();
				break;
			case EVENTO_BAJA_PRODUCTO:
				comando = new BajaProducto();
				break;
			case EVENTO_CONSULTAR_UN_PRODUCTO:
				comando = new ConsultarUnProducto();
				break;
			case EVENTO_LISTAR_PRODUCTOS:
				comando = new ListarProducto();
				break;
			case EVENTO_MODIFICAR_PRODUCTO:
				comando = new ModificarProducto();
				break;
			case EVENTO_TOP_PRODUCTO:
				comando = new TopProducto();
				break;
				
				
			//Venta		
			case EVENTO_ABRIR_VENTA:
				comando = new AbrirVenta();
				break;
			case  EVENTO_CERRAR_VENTA:
				comando = new CerrarVenta();
				break;
			case EVENTO_CONSULTAR_UNA_VENTA:
				comando = new ConsultarUnaVenta();
				break;	
			case EVENTO_LISTAR_VENTAS:
				comando = new ListarVentas();
				break;	
			case EVENTO_DEVOLUCION_VENTA:
				comando = new Devolucion();
				break;	
			case EVENTO_ANADIR_PRODUCTO_CARRITO:
				comando = new AnadirProductoCarrito();
				break;
			case EVENTO_ELIMINAR_PRODUCTO_CARRITO:
				comando = new EliminarProductoCarrito();
				break;
				
				
			//Empleado
			case EVENTO_ALTA_EMPLEADO:
				comando = new AltaEmpleado();
				break;
			case EVENTO_BAJA_EMPLEADO:
				comando = new BajaEmpleado();
				break;
			case EVENTO_CONSULTAR_UN_EMPLEADO:
				comando = new ConsultarUnEmpleado();
				break;
			case EVENTO_LISTAR_EMPLEADOS:
				comando = new ListarEmpleados();
				break;
			case EVENTO_MODIFICAR_EMPLEADO:
				comando = new ModificarEmpleado();
				break;
			case EVENTO_NOMINA_EMPLEADO:
				comando = new NominaEmpleado();
				break;
				
				
			//Departamento
			case EVENTO_ALTA_DEPARTAMENTO:
				comando = new AltaDepartamento();
				break;
			case EVENTO_BAJA_DEPARTAMENTO:
				comando = new BajaDepartamento();
				break;
			case EVENTO_CONSULTAR_UN_DEPARTAMENTO:
				comando = new ConsultarUnDepartamento();
				break;
			case EVENTO_LISTAR_DEPARTAMENTOS:
				comando = new ListarDepartamentos();
				break;
			case EVENTO_MODIFICAR_DEPARTAMENTO:
				comando = new ModificarDepartamento();
				break;
			case EVENTO_NOMINA_DEPARTAMENTO:
				comando = new NominaDepartamento();
				break;
			case EVENTO_EMPLEADOS_DEPARTAMENTO:
				comando = new EmpleadosDepartamento();
				break;
			case EVENTO_PROVEEDORES_DEPARTAMENTO:
				comando = new ProveedoresDepartamento();
				break;
				
				
			//Proveedor
			case EVENTO_ALTA_PROVEEDOR:
				comando = new AltaProveedor();
				break;
			case EVENTO_BAJA_PROVEEDOR:
				comando = new BajaProveedor();
				break;
			case EVENTO_CONSULTAR_UN_PROVEEDOR:
				comando = new ConsultarUnProveedor();
				break;
			case EVENTO_LISTAR_PROVEEDORES:
				comando = new ListarProveedores();
				break;
			case EVENTO_MODIFICAR_PROVEEDOR:
				comando = new ModificarProveedor();
				break;
			case EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO:
				comando = new AnadirProveedorDept();
				break;
			case EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO:
				comando = new EliminarProveedorDept();
				break;
				
			default:
				break;
		}	
		return comando;
	}
	
}