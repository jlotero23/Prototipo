package Modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class ActualizacionEnDB {

	public void ActualizarInteraccionEnDB(String vendedor, String ingeniero, String observacion, String tipo, String percepcion, int id_interaccion, String persona) {
		
		try {
			
			Conection con = new Conection();
			Connection cone= con.conectar();
			Date fecha = new Date(System.currentTimeMillis());
			
			PreparedStatement query = cone.prepareStatement("UPDATE interacciones SET vendedor = ?, ingeniero = ?, observaciones = ?, tipo = ?, percepcion = ?, fecha_modifica = ?, persona_modifica = ? WHERE id_interaccion = ?");
			
			query.setString(1, vendedor);
			query.setString(2, ingeniero);
			query.setString(3, observacion);
			query.setString(4, tipo);
			query.setString(5, percepcion);
			query.setInt(8, id_interaccion);
			query.setDate(6, fecha);
			query.setString(7, persona);
			
			
			query.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "Se realizó con exito el registro dela interaccion\nCon los siguientes datos"
					+ "\nVendedor: " + vendedor
					+ "\nIngeniero: " + ingeniero
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
