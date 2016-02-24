package integracion.venta;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

import negocio.producto.TransferProducto;
import negocio.venta.TransferLineaVenta;
import negocio.venta.TransferVenta;

public interface DAOVenta { 
	public boolean devolucion(TransferLineaVenta lv, TransferProducto p, TransferVenta v) throws Excepciones;
	public TransferVenta readById_Venta(int IDVenta) throws Excepciones;
	public TransferLineaVenta consultarLineaVenta(int IDVenta, int IDProducto) throws Excepciones;
	public ArrayList<TransferVenta> readAll() throws Excepciones;
	public boolean cerrarVenta(TransferVenta v) throws Excepciones;
}
