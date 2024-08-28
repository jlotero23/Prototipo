package Controlador;

import Modelo.Conection;
import Modelo.ConsultasEnDB;
import Vista.Inicio;

public class main {

	public static void main(String[] args) {
		
		Conection con = new Conection();
		
		con.conectar();
		
		
		Inicio frame1 = new Inicio();
		
		
		try {
			con.cerrarConexion();
		}catch(Exception e) {
			System.out.println("Error : " +e);
		}
		
		
		
		}
	
	}


