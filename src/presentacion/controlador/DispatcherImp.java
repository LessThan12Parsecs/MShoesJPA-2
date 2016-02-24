package presentacion.controlador;

import presentacion.cliente.ClienteGUI;
import presentacion.comando.IDEventos;
import presentacion.comando.factoriaComando.CommandResponse;
import presentacion.departamento.DepartamentoGUI;
import presentacion.empleado.EmpleadoGUI;
import presentacion.producto.ProductoGUI;
import presentacion.proveedor.ProveedorGUI;
import presentacion.venta.VentaGUI;


public class DispatcherImp extends Dispatcher {
	
	
	public void redirect(CommandResponse respuestacomando) {

		IDEventos eventoActual = respuestacomando.getEvento();
		Object datos = respuestacomando.getDatos();

		//Cliente
		if (eventoActual == IDEventos.EVENTO_ALTA_CLIENTE
				|| eventoActual == IDEventos.EVENTO_BAJA_CLIENTE
				|| eventoActual == IDEventos.EVENTO_CONSULTAR_UN_CLIENTE
				|| eventoActual == IDEventos.EVENTO_LISTAR_CLIENTES
				|| eventoActual == IDEventos.EVENTO_MODIFICAR_CLIENTE
				|| eventoActual == IDEventos.EVENTO_TOP_TEN_CLIENTES
				|| eventoActual == IDEventos.ERROR_EVENTO_ALTA_CLIENTE
				|| eventoActual == IDEventos.ERROR_EVENTO_BAJA_CLIENTE
				|| eventoActual == IDEventos.ERROR_EVENTO_CONSULTAR_UN_CLIENTE
				|| eventoActual == IDEventos.ERROR_EVENTO_LISTAR_CLIENTES
				|| eventoActual == IDEventos.ERROR_EVENTO_MODIFICAR_CLIENTE
				|| eventoActual == IDEventos.ERROR_EVENTO_TOP_TEN_CLIENTES) {
			
			ClienteGUI.getInstance().update(eventoActual, datos);
		}
		//Producto
		else if(eventoActual == IDEventos.EVENTO_ALTA_PRODUCTO
			    || eventoActual == IDEventos.EVENTO_BAJA_PRODUCTO
			    || eventoActual == IDEventos.EVENTO_CONSULTAR_UN_PRODUCTO
			    || eventoActual == IDEventos.EVENTO_LISTAR_PRODUCTOS
			    || eventoActual == IDEventos.EVENTO_MODIFICAR_PRODUCTO
			    || eventoActual == IDEventos.EVENTO_TOP_PRODUCTO
				|| eventoActual == IDEventos.ERROR_EVENTO_ALTA_PRODUCTO
			    || eventoActual == IDEventos.ERROR_EVENTO_BAJA_PRODUCTO
			    || eventoActual == IDEventos.ERROR_EVENTO_CONSULTAR_UN_PRODUCTO
			    || eventoActual == IDEventos.ERROR_EVENTO_LISTAR_PRODUCTOS
	    		|| eventoActual == IDEventos.ERROR_EVENTO_MODIFICAR_PRODUCTO
	    		|| eventoActual == IDEventos.ERROR_EVENTO_TOP_PRODUCTO) {
			
			ProductoGUI.getInstance().update(eventoActual, datos);
		}
		//Venta
		else if(eventoActual == IDEventos.EVENTO_ABRIR_VENTA
			    || eventoActual == IDEventos.EVENTO_CERRAR_VENTA
			    || eventoActual == IDEventos.EVENTO_CONSULTAR_UNA_VENTA
			    || eventoActual == IDEventos.EVENTO_LISTAR_VENTAS
			    || eventoActual == IDEventos.EVENTO_DEVOLUCION_VENTA
			    || eventoActual == IDEventos.EVENTO_ANADIR_PRODUCTO_CARRITO
			    || eventoActual == IDEventos.EVENTO_ELIMINAR_PRODUCTO_CARRITO
				|| eventoActual == IDEventos.ERROR_EVENTO_ABRIR_VENTA
				|| eventoActual == IDEventos.ERROR_EVENTO_CERRAR_VENTA
			    || eventoActual == IDEventos.ERROR_EVENTO_CONSULTAR_UNA_VENTA
			    || eventoActual == IDEventos.ERROR_EVENTO_LISTAR_VENTAS
			    || eventoActual == IDEventos.ERROR_EVENTO_DEVOLUCION_VENTA
			    || eventoActual == IDEventos.ERROR_EVENTO_ANADIR_PRODUCTO_CARRITO
			    || eventoActual == IDEventos.ERROR_EVENTO_ELIMINAR_PRODUCTO_CARRITO) {
			
			VentaGUI.getInstance().update(eventoActual, datos);
		}
		//Empleado
		else if (eventoActual == IDEventos.EVENTO_ALTA_EMPLEADO
				|| eventoActual == IDEventos.EVENTO_BAJA_EMPLEADO
				|| eventoActual == IDEventos.EVENTO_CONSULTAR_UN_EMPLEADO
				|| eventoActual == IDEventos.EVENTO_LISTAR_EMPLEADOS
				|| eventoActual == IDEventos.EVENTO_MODIFICAR_EMPLEADO
				|| eventoActual == IDEventos.EVENTO_NOMINA_EMPLEADO
				|| eventoActual == IDEventos.ERROR_EVENTO_ALTA_EMPLEADO
				|| eventoActual == IDEventos.ERROR_EVENTO_BAJA_EMPLEADO
				|| eventoActual == IDEventos.ERROR_EVENTO_CONSULTAR_UN_EMPLEADO
				|| eventoActual == IDEventos.ERROR_EVENTO_LISTAR_EMPLEADOS
				|| eventoActual == IDEventos.ERROR_EVENTO_MODIFICAR_EMPLEADO
				|| eventoActual == IDEventos.ERROR_EVENTO_NOMINA_EMPLEADO) {
			
			EmpleadoGUI.getInstance().update(eventoActual, datos);
		}
		//Departamento
		else if (eventoActual == IDEventos.EVENTO_ALTA_DEPARTAMENTO
				|| eventoActual == IDEventos.EVENTO_BAJA_DEPARTAMENTO
				|| eventoActual == IDEventos.EVENTO_CONSULTAR_UN_DEPARTAMENTO
				|| eventoActual == IDEventos.EVENTO_LISTAR_DEPARTAMENTOS
				|| eventoActual == IDEventos.EVENTO_MODIFICAR_DEPARTAMENTO
				|| eventoActual == IDEventos.EVENTO_NOMINA_DEPARTAMENTO
				|| eventoActual == IDEventos.EVENTO_EMPLEADOS_DEPARTAMENTO
				|| eventoActual == IDEventos.EVENTO_PROVEEDORES_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_ALTA_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_BAJA_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_CONSULTAR_UN_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_LISTAR_DEPARTAMENTOS
				|| eventoActual == IDEventos.ERROR_EVENTO_MODIFICAR_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_NOMINA_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_EMPLEADOS_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_PROVEEDORES_DEPARTAMENTO) {
			
			DepartamentoGUI.getInstance().update(eventoActual, datos);
		}
		//Proveedor
		else if (eventoActual == IDEventos.EVENTO_ALTA_PROVEEDOR
				|| eventoActual == IDEventos.EVENTO_BAJA_PROVEEDOR
				|| eventoActual == IDEventos.EVENTO_CONSULTAR_UN_PROVEEDOR
				|| eventoActual == IDEventos.EVENTO_LISTAR_PROVEEDORES
				|| eventoActual == IDEventos.EVENTO_MODIFICAR_PROVEEDOR
				|| eventoActual == IDEventos.EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO
				|| eventoActual == IDEventos.EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_ALTA_PROVEEDOR
				|| eventoActual == IDEventos.ERROR_EVENTO_BAJA_PROVEEDOR
				|| eventoActual == IDEventos.ERROR_EVENTO_CONSULTAR_UN_PROVEEDOR
				|| eventoActual == IDEventos.ERROR_EVENTO_LISTAR_PROVEEDORES
				|| eventoActual == IDEventos.ERROR_EVENTO_MODIFICAR_PROVEEDOR
				|| eventoActual == IDEventos.ERROR_EVENTO_ANADIR_PROVEEDOR_DEPARTAMENTO
				|| eventoActual == IDEventos.ERROR_EVENTO_ELIMINAR_PROVEEDOR_DEPARTAMENTO) {
			
			ProveedorGUI.getInstance().update(eventoActual, datos);
		}
	}
}