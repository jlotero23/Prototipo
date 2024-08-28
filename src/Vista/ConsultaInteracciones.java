package Vista;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Modelo.ConsultasEnDB;

import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ConsultaInteracciones{

	 JPanel contentPane;
	
	JFrame frame =new JFrame();
	
	public ConsultaInteracciones(int id) {
		frame.setTitle("Registro de Cliente");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 600, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea texto = new JTextArea();
		texto.setBounds(10, 107, 564, 302);
		
		JScrollPane scrollPane = new JScrollPane(texto);
		scrollPane.setBounds(10, 107, 564, 302);
		contentPane.add(scrollPane);
		
		ConsultasEnDB consu= new ConsultasEnDB();
		ArrayList<String> interacciones = consu.consulltaTodasInteracciones(id);
		for (String string : interacciones) {
			
			texto.append(string);
			
		}
		
		
		JLabel cmr = new JLabel("CMR");
		cmr.setFont(new Font("Tahoma", Font.PLAIN, 60));
		cmr.setHorizontalAlignment(SwingConstants.CENTER);
		cmr.setBounds(190, 40, 220, 50);
		contentPane.add(cmr);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 30, 606, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel(Inicio.user + ":      " + Inicio.name);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 5, 600, 10);
		contentPane.add(lblNewLabel);
		
		JLabel estado = new JLabel("...");
		estado.setHorizontalAlignment(SwingConstants.CENTER);
		estado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		estado.setBounds(190, 420, 200, 40);
		contentPane.add(estado);
		
		JLabel Salud = new JLabel("Estado");
		Salud.setBackground(new Color(255, 255, 255));
		Salud.setHorizontalAlignment(SwingConstants.CENTER);
		Salud.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Salud.setBounds(10, 420, 200, 40);
		contentPane.add(Salud);
		
		JButton cancelar = new JButton("Volver");
		cancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		cancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancelar.setBounds(424, 420, 150, 40);
		contentPane.add(cancelar);
		
		
		frame.setVisible(true);

		
	}
}
