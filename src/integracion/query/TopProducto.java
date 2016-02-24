package integracion.query;

import integracion.transacciones.conexion.Excepciones;
import integracion.transacciones.conexion.JdbcUtils;
import integracion.transacciones.transaccion.Transaccion;
import integracion.transacciones.transactioManager.TransactionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import negocio.producto.TransferProducto;

public class TopProducto implements Query{

	private final String topProducto = "Select `mshoes`.`Producto`.`ID_PRODUCTO`, `mshoes`.`Producto`.`MARCA`, `mshoes`.`Producto`.`TIPO`,"
			+ "`mshoes`.`Producto`.`COLOR`, `mshoes`.`Producto`.`STOCK`, `mshoes`.`Producto`.`PRECIO`, `mshoes`.`Producto`.`ACTIVO`, SUM(CANTIDAD) AS `NUM_VENTAS` "
			+ "FROM `mshoes`.`linea_de_venta`, `mshoes`.`Producto` WHERE `mshoes`.`linea_de_venta`.`ID_PRODUCTO` = `mshoes`.`Producto`.`ID_PRODUCTO` "
			+ "AND `mshoes`.`Producto`.`ACTIVO` = 1 GROUP BY `ID_PRODUCTO` ORDER BY `NUM_VENTAS` DESC LIMIT 1";
	
	
	public Object execute(Object a) throws Excepciones { 
		TransferProducto p = null;
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection)transaccion.getResource();
		
		try {
			PreparedStatement consulta = conexion.prepareStatement(topProducto);
			ResultSet resultado = consulta.executeQuery();
			
			while(resultado.next()) { 
				p = new TransferProducto();
				p.setIDProducto(resultado.getInt("ID_Producto"));
				p.setMarca(resultado.getString("Marca"));
				p.setTipo(resultado.getString("Tipo"));
				p.setColor(resultado.getString("Color"));
				p.setStock(resultado.getInt("Stock"));
				p.setPrecio(resultado.getFloat("Precio"));
				p.setActivo(resultado.getBoolean("Activo"));
			}
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error en la consulta del topProducto");
			
		}
		
		return p;
	}
}
