package negocio.producto;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

import negocio.producto.TransferProducto;

public interface SAProducto {
	public boolean altaProducto(TransferProducto p) throws Excepciones;
	public boolean bajaProducto(int IDProducto) throws Excepciones;
	public boolean modificarProducto(TransferProducto p) throws Excepciones;
	public TransferProducto consultarUnProducto(int IDProducto) throws Excepciones;
	public ArrayList<TransferProducto> listarProductos() throws Excepciones;
	public TransferProducto topProducto() throws Excepciones;
}
