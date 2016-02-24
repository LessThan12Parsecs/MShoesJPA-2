package integracion.producto;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

import negocio.producto.TransferProducto;

public interface DAOProducto {
	public boolean create(TransferProducto t) throws Excepciones;
	public boolean bajaProducto(int IDProducto) throws Excepciones;
	public boolean update(TransferProducto t) throws Excepciones;
	public TransferProducto readById_Producto(int IDProducto) throws Excepciones;
	public TransferProducto readByName(String marca, String tipo, String color) throws Excepciones;
	public ArrayList<TransferProducto> readAll() throws Excepciones;
}
