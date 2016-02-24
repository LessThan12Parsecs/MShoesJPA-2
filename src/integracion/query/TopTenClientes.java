package integracion.query;

import integracion.transacciones.conexion.Excepciones;
import integracion.transacciones.conexion.JdbcUtils;
import integracion.transacciones.transaccion.Transaccion;
import integracion.transacciones.transactioManager.TransactionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.cliente.TransferCliente;
import negocio.cliente.TransferQuery;

public class TopTenClientes implements Query {

	private final String topTenClientes = "Select DISTINCT `mshoes`.`Cliente`.`ID_CLIENTE`, `mshoes`.`Cliente`.`DNI`,"
			+ "`mshoes`.`Cliente`.`NOMBRE`, `mshoes`.`Cliente`.`APELLIDOS` FROM `mshoes`.`Cliente` RIGHT OUTER JOIN " 
			+ "`mshoes`.`Venta` ON `mshoes`.`Cliente`.`ID_CLIENTE` = `mshoes`.`Venta`.`ID_CLIENTE` "
			+ "WHERE `mshoes`.`Venta`.`Total_Venta` > ? AND `mshoes`.`Venta`.`FECHA` BETWEEN ? AND ? AND `mshoes`.`Cliente`.`ACTIVO` = 1";
	
	public Object execute(Object topCli) throws Excepciones {
		
		TransferCliente c = null;
		ArrayList<TransferCliente> topClientes = new ArrayList<TransferCliente>();
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection)transaccion.getResource();

		TransferQuery q = (TransferQuery)topCli;
		
		try {
			PreparedStatement top = conexion.prepareStatement(topTenClientes);
			top.setFloat(1, q.getnEuros());
			top.setString(2, q.getFechaInicio());
			top.setString(3, q.getFechaFin());
			ResultSet resultado = top.executeQuery();
			
			
			while(resultado.next()) {
				
				c = new TransferCliente();
				c.setIDCliente(resultado.getInt("ID_Cliente"));
				c.setDNI(resultado.getString("DNI"));
				c.setNombre(resultado.getString("Nombre"));
				c.setApellidos(resultado.getString("Apellidos"));
				topClientes.add(c);
			}
			
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error al listar el top 10 de clientes");
		}
		
		return topClientes;
	
	}

}
