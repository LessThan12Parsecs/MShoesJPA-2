package negocio.venta;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

public interface SAVenta {
	public TransferVenta abrirVenta(int IDCliente) throws Excepciones;
	public boolean devolucion(TransferLineaVenta lv) throws Excepciones;
	public TransferVenta consultarUnaVenta(int IDVenta) throws Excepciones;
	public ArrayList<TransferVenta> listarVentas() throws Excepciones;
	public boolean cerrarVenta(TransferVenta v) throws Excepciones;
	public TransferCarrito anadirProductoCarrito(TransferCarrito cr) throws Excepciones;
	public TransferCarrito eliminarProductoCarrito(TransferCarrito cr) throws Excepciones;
}
