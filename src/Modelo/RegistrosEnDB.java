package Modelo;

import java.sql.*;
import javax.swing.JOptionPane;

public class RegistrosEnDB {

	public void RegistroClientesEnDB(String nombre, String direccion, String numero, String email, String sector, String estado, String vendedor) {
		
		try {
			
			Conection con = new Conection();
			Connection cone= con.conectar();
			
			
			PreparedStatement query = cone.prepareStatement("Insert into clientes values (?,?,?,?,?,?,?,?)");
			
			query.setString(1, "0");
			query.setString(2, nombre);
			query.setString(3, direccion);
			query.setString(4, numero);
			query.setString(5, email);
			query.setString(6, sector);
			query.setString(7, estado);
			query.setString(8, vendedor);
			
			
			
			query.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Se realizó con exito el registro de:  " + nombre + "\nCon los siguientes datos"
					+ "\\nDireccion: " + direccion 
					+ "\nNumer: o" + numero
					+ "\nEmail: " + email
					+ "\nSector : " + sector
					+ "\nEstado: " + estado
					+ "\nCon vendedor asociado: \n " + vendedor);
			
			con.cerrarConexion();
			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e);
			
		}
	}
		
		public void RegistroCuentaEnDB(String cliente, String admin, String numero, String email, String licencia, String vendedor, String ingeniero) {
			
			try {
				
				Conection con = new Conection();
				Connection cone= con.conectar();
				Date fecha = new Date(System.currentTimeMillis());
				
				ConsultasEnDB cons= new ConsultasEnDB();
				int client = cons.consultaIDcliente(cliente);
				
				PreparedStatement query = cone.prepareStatement("Insert into cuentas values (?,?,?,?,?,?,?,?,?)");
				
				query.setString(1, "0");
				query.setString(2, admin);
				query.setString(3, numero);
				query.setString(4, email);
				query.setString(5, licencia);
				query.setString(6, vendedor);
				query.setString(7, ingeniero);
				query.setDate(8, fecha);
				query.setInt(9, client);
				
				
				query.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Se realizó con exito el registro dela cuenta\nCon los siguientes datos"
						+ "\\nCliente:\t " + cliente
						+ "\\nAdmin:\t " + admin
						+ "\nNumero:\t " + numero
						+ "\nEmail:\t " + email
						+ "\nLicencia tipo:\t " + licencia
						+ "\nCon ingeniero asociado: \n" + ingeniero
						+ "\nCon vendedor asociado: \n " + vendedor);
				
				con.cerrarConexion();
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error: " + e);
				
			}
		
	}
		
		
			public void RegistroInteraccionEnDB(String vendedor, String ingeniero, String observacion, String tipo, String percepcion, int id_cuenta, String persona) {
			
			try {
				
				Conection con = new Conection();
				Connection cone= con.conectar();
				Date fecha = new Date(System.currentTimeMillis());
				
				PreparedStatement query = cone.prepareStatement("Insert into interacciones values (?,?,?,?,?,?,?,?,?)");
				
				query.setString(1, "0");
				query.setString(2, vendedor);
				query.setString(3, ingeniero);
				query.setString(4, observacion);
				query.setString(5, tipo);
				query.setString(6, percepcion);
				query.setInt(7, id_cuenta);
				query.setDate(8, fecha);
				query.setString(9, persona);
				
				
				query.executeUpdate();
				
				JOptionPane.showMessageDialog(null, "Se realizó con exito el registro dela interaccion\nCon los siguientes datos"
						+ "\nVendedor:\t " + vendedor
						+ "\nIngeniero:\t " + ingeniero
						+ "\nTipo:\t " + tipo
						+ "\nPercepcion:\t " + percepcion
						+ "\nFecha de Modificacion:\t " + fecha
						+ "\nModifica: \n" + persona
						+ "\nObservaciones: \n " + observacion);
				
				con.cerrarConexion();
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Error: " + e);
				
			}
	
			}

}
