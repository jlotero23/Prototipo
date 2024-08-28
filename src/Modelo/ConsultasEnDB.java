package Modelo;

import java.sql.*;
import java.util.ArrayList;

public class ConsultasEnDB {

	public String[] consultarListaClientes() {
		String nombres = " ,";
		String[] lista;
		try {
			Conection con = new Conection();
			Connection cone = con.conectar();
			
			PreparedStatement query = cone.prepareStatement("SELECT nombre FROM clientes");
			
			ResultSet consulta = query.executeQuery();
			
			
			while (consulta.next()) {
				nombres += (consulta.getString(1) + ",");
				
			}
			lista = nombres.split(",");
			con.cerrarConexion();
			return lista;
		}catch(Exception e) {
			System.out.println("Error : " + e);
			return null;
		}
		
		
		
	}
	
	public int consultaIDcliente(String nombre) {
		int id = -1;
		try {
			Conection con = new Conection();
			Connection cone = con.conectar();
			
			PreparedStatement query = cone.prepareStatement("SELECT id_cliente FROM clientes WHERE nombre = \'"+nombre+"\'");
			
			ResultSet consulta = query.executeQuery();
			if( consulta.next()) {
				id = Integer.parseInt(consulta.getString(1));
			}

			System.out.println(id);
				
			con.cerrarConexion();
			return id;
		}catch(Exception e) {
			System.out.println("Error : " + e);
			return id;
		}
	}
	
	public String[] consultaCuentaDB(int id) {
		String[] result =new String[10];
		try {
			String nombre ="-1";
			Conection con = new Conection();
			Connection cone = con.conectar();
			
			PreparedStatement query = cone.prepareStatement("SELECT licencia,fecha_registro,vendedor,ingeniero,id_cliente FROM cuentas WHERE id_cuenta = " + id);
			
			ResultSet consulta = query.executeQuery();
			while( consulta.next()) {
				result[0]=consulta.getString(1);
				result[1]=consulta.getString(2);
				result[2]=consulta.getString(3);
				result[3]=consulta.getString(4);
				nombre=consulta.getString(5);
			}
			
			PreparedStatement query2 = cone.prepareStatement("SELECT nombre,direccion,numero,email,sector,estado FROM clientes WHERE id_cliente = " + Integer.parseInt(nombre));
			ResultSet consulta2 = query2.executeQuery();
			
			while (consulta2.next()) {
				result[4]=consulta2.getString(1);
				result[5]=consulta2.getString(2);
				result[6]=consulta2.getString(3);
				result[7]=consulta2.getString(4);
				result[8]=consulta2.getString(5);
				result[9]=consulta2.getString(6);
			}
				
			con.cerrarConexion();
			return result;
		}catch(Exception e) {
			System.out.println("Error : " + e);
			return result;
		}
	}
	
	public ArrayList<String> consulltaTodasInteracciones(int id){
		ArrayList<String> valores = new ArrayList<String>();
		try {
			Conection con = new Conection();
			Connection cone = con.conectar();
			
			PreparedStatement query = cone.prepareStatement("SELECT * FROM interacciones WHERE id_cuenta = "+ id);
			
			ResultSet consulta = query.executeQuery();
			
			
			while (consulta.next()) {
				valores.add("ID de Interaccion: "+ consulta.getString(1) + "\n");
				valores.add("Vendedor Encargado: "+ consulta.getString(2) + "\n");
				valores.add("Ingeniero Encargado: "+ consulta.getString(3) + "\n");
				valores.add("\nObservaciones: \n");
				valores.add(consulta.getString(4) + "\n\n");
				valores.add("Tipo de Interaccion: "+ consulta.getString(5) + "\n");
				valores.add("Percepcion: "+ consulta.getString(6) + "\n");
				valores.add("Ultima modificacion hecha el: "+ consulta.getString(8) + " por " + consulta.getString(9) + "\n\n\n\n\n");
				
			}
			
			
			return valores;
		}catch(Exception e) {
			System.out.println("Error : " + e);
			return null;
		}
		
	}
	
	public String[] consultaInteraccion(int id) {
		String[] result =new String[9];
		try {
			String nombre ="-1";
			Conection con = new Conection();
			Connection cone = con.conectar();
			
			PreparedStatement query = cone.prepareStatement("SELECT * FROM interacciones WHERE id_interaccion = " + id);
			
			ResultSet consulta = query.executeQuery();
			while( consulta.next()) {
				result[0]=consulta.getString(2);
				result[1]=consulta.getString(3);
				result[2]=consulta.getString(4);
				result[3]=consulta.getString(5);
				result[4]=consulta.getString(6);
			}

				
			con.cerrarConexion();
			return result;
		}catch(Exception e) {
			System.out.println("Error : " + e);
			return result;
		}
	}
	
}
