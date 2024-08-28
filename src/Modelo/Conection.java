package Modelo;
import java.sql.*;

public class Conection {
	
	private static Connection Conexion;
	
	private static final String URL = "jdbc:mysql://localhost/base_de_datos";
	private static final String USER = "root";
	private static final String PASSWORD = "contrasena";
	
	
	public Connection conectar() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Conexion = DriverManager.getConnection(URL, USER, PASSWORD);
			
			System.out.println("Si se conectó");
			
			return Conexion;
			
		}catch(Exception e) {
			
			System.out.println("Error : " + e);
		}
		return Conexion;
		
	}
	
	public void cerrarConexion() throws SQLException {
		try {
			
			Conexion.close();
			System.out.println("Se cierra la conexion");
			
		}catch(Exception e) {
			
			System.out.println("Error : " + e);
			
		}finally {
			Conexion.close();
		}
	}
	

	
}
