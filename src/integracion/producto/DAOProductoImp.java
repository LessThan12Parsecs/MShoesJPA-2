package integracion.producto;

import integracion.transacciones.conexion.Excepciones;
import integracion.transacciones.conexion.JdbcUtils;
import integracion.transacciones.transaccion.Transaccion;
import integracion.transacciones.transactioManager.TransactionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import negocio.producto.TransferProducto;


public class DAOProductoImp implements DAOProducto{
	
	private final String altaProducto = "INSERT INTO `mshoes`.`Producto` (`MARCA`,`TIPO`,`COLOR`,`STOCK`,"
			+ "`ACTIVO`,`PRECIO`) VALUES (?,?,?,?,?,?)";
	
	private final String consultaProductoID = "Select * from `mshoes`.`Producto` where `ID_PRODUCTO` = ? FOR UPDATE";
	
	private final String consultaProductoOtros = "Select * from `mshoes`.`Producto` where `MARCA` = ? AND `TIPO` = ? AND `COLOR` = ? FOR UPDATE";
	
	private final String listarProductos = "Select * from `mshoes`.`Producto` FOR UPDATE";
	
	private final String bajaProducto = "Update `mshoes`.`Producto` set `ACTIVO`=0 WHERE `ID_PRODUCTO`=?";
	
	private final String modificaProducto = "Update `mshoes`.`Producto` set `MARCA` = ?, `TIPO` = ?, `COLOR` = ?, "
			+ "`STOCK` = ?, `ACTIVO` = 1, `PRECIO`= ? WHERE `ID_PRODUCTO` = ? ";
	

	@Override
	public boolean create(TransferProducto t) throws Excepciones {
		boolean correcto = false;
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection) transaccion.getResource();
		
		try {
			PreparedStatement alta = conexion.prepareStatement(altaProducto);
			alta.setString(1, t.getMarca());
			alta.setString(2, t.getTipo());
			alta.setString(3, t.getColor());
			alta.setInt(4, t.getStock());
			alta.setBoolean(5, true);
			alta.setFloat(6, t.getPrecio());
			
			if(alta.executeUpdate() == 1) {
				correcto = true;
			}
			else
				throw new SQLException();
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error en alta del Producto");
		}
		
		return correcto;
	}


	@Override
	public boolean bajaProducto(int IDProducto) throws Excepciones {
		boolean correcto = false;
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection)transaccion.getResource();
		
		try {
			PreparedStatement baja = conexion.prepareStatement(bajaProducto);
			baja.setInt(1, IDProducto);
		
			if(baja.executeUpdate() == 1) {
				correcto = true;
			}
			else
				throw new SQLException();
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error en baja Producto");
		}
		
		return correcto;
	}


	@Override
	public boolean update(TransferProducto p) throws Excepciones {
		boolean correcto = false;
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection)transaccion.getResource();
		
		try {
			
			PreparedStatement modifica = conexion.prepareStatement(modificaProducto); 
			modifica.setString(1, p.getMarca());
			modifica.setString(2, p.getTipo());
			modifica.setString(3, p.getColor());
			modifica.setInt(4, p.getStock());
			modifica.setFloat(5, p.getPrecio());
			modifica.setInt(6, p.getIDProducto());
		
			
			if(modifica.executeUpdate() == 1) {
				correcto = true;
			}
			else
				throw new SQLException();
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error en modificacion del Producto");
		}
		
		return correcto;
	}


	@Override
	public TransferProducto readById_Producto(int IDProducto) throws Excepciones {
		TransferProducto p = null;
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection)transaccion.getResource();
		
		try {
			PreparedStatement consulta = conexion.prepareStatement(consultaProductoID);
			consulta.setInt(1, IDProducto);
			ResultSet resultado = consulta.executeQuery();
			
			while(resultado.next()) {
				
				p = new TransferProducto();
				p.setIDProducto(resultado.getInt("ID_Producto"));
				p.setMarca(resultado.getString("Marca"));
				p.setTipo(resultado.getString("Tipo"));
				p.setColor(resultado.getString("Color"));
				p.setActivo(resultado.getBoolean("Activo"));
				p.setStock(resultado.getInt("Stock"));
				p.setPrecio(resultado.getFloat("Precio"));
			}
		
			
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error en la consulta del Producto");
			
		}
		
		return p;
	}
	
	@Override
	public TransferProducto readByName(String marca, String tipo, String color) throws Excepciones {
		TransferProducto p = null;
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection)transaccion.getResource();
		
		try {
			PreparedStatement consulta = conexion.prepareStatement(consultaProductoOtros);
			consulta.setString(1, marca);
			consulta.setString(2, tipo);
			consulta.setString(3, color);
			ResultSet resultado = consulta.executeQuery();
			
			while(resultado.next()) {
				
				p = new TransferProducto();
				p.setIDProducto(resultado.getInt("ID_Producto"));
				p.setMarca(resultado.getString("Marca"));
				p.setTipo(resultado.getString("Tipo"));
				p.setColor(resultado.getString("Color"));
				p.setActivo(resultado.getBoolean("Activo"));
				p.setStock(resultado.getInt("Stock"));
				p.setPrecio(resultado.getFloat("Precio"));
			}

		
			
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error en la consulta del Producto");
			
		}
		
		return p;
	}


	@Override
	public ArrayList<TransferProducto> readAll() throws Excepciones {
		TransferProducto p = null;
		ArrayList<TransferProducto> productos = new ArrayList<TransferProducto>();
		Transaccion transaccion = TransactionManager.getInstance().getTransaction();
		Connection conexion = (Connection)transaccion.getResource();
		
		try {
			PreparedStatement lista = conexion.prepareStatement(listarProductos);
			ResultSet resultado = lista.executeQuery();
			
			
			while(resultado.next()) {
				
				p = new TransferProducto();
				p.setIDProducto(resultado.getInt("ID_Producto"));
				p.setMarca(resultado.getString("Marca"));
				p.setTipo(resultado.getString("Tipo"));
				p.setColor(resultado.getString("Color"));
				p.setActivo(resultado.getBoolean("Activo"));
				p.setStock(resultado.getInt("Stock"));
				p.setPrecio(resultado.getFloat("Precio"));
				
				productos.add(p); 
			}
			
		}
		catch (SQLException e){
			
			JdbcUtils.printSQLException(e);
			throw new Excepciones("Error al listar los productos");
		}
		
		return productos;
	}

}
