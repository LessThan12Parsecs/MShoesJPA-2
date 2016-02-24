package integracion.cliente;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

import negocio.cliente.TransferCliente;

public interface DAOCliente {
	public boolean create(TransferCliente c) throws Excepciones;
	public boolean bajaCliente(int IDCliente) throws Excepciones;
	public boolean update(TransferCliente c) throws Excepciones;
	public TransferCliente readById_Cliente(int IDCliente) throws Excepciones;
	public TransferCliente readByDNI(String DNI) throws Excepciones;
	public ArrayList<TransferCliente> readAll() throws Excepciones;
}
