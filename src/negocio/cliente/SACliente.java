package negocio.cliente;

import integracion.transacciones.conexion.Excepciones;

import java.util.ArrayList;

public interface SACliente {
	public boolean altaCliente(TransferCliente c) throws Excepciones;
	public boolean bajaCliente(int IDCliente) throws Excepciones;
	public boolean modificarCliente(TransferCliente c) throws Excepciones;
	public TransferCliente consultarUnCliente(int IDCliente) throws Excepciones;
	public ArrayList<TransferCliente> listarClientes() throws Excepciones;
	public ArrayList<TransferCliente> topTenClientes(TransferQuery topCli) throws Excepciones;
}