package Vista;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConsultaCliente{

	 JPanel contentPane;
	 JTextField tfnombre;
	 JTextField tfdireccion;
	 JTextField tfnumero;
	 JTextField tfemail;
	 JTextField tfsector;
	 JTextField tfestado;
	
	JFrame frame =new JFrame();
	
	public ConsultaCliente() {
		frame.setTitle("Registro de Cliente");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 600, 510);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel nombre = new JLabel("Nombre");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setBounds(10, 100, 200, 40);
		contentPane.add(nombre);
		
		JLabel direccion = new JLabel("Dirección");
		direccion.setHorizontalAlignment(SwingConstants.CENTER);
		direccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		direccion.setBounds(10, 150, 200, 40);
		contentPane.add(direccion);
		
		JLabel numero = new JLabel("Número Teléfonico");
		numero.setHorizontalAlignment(SwingConstants.CENTER);
		numero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numero.setBounds(10, 200, 200, 40);
		contentPane.add(numero);
		
		JLabel email = new JLabel("Correo Electrónico");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		email.setBounds(10, 250, 200, 40);
		contentPane.add(email);
		
		JLabel sector = new JLabel("Sector");
		sector.setHorizontalAlignment(SwingConstants.CENTER);
		sector.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sector.setBounds(10, 300, 200, 40);
		contentPane.add(sector);
		
		JLabel estado = new JLabel("Estado");
		estado.setHorizontalAlignment(SwingConstants.CENTER);
		estado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		estado.setBounds(10, 350, 200, 40);
		contentPane.add(estado);
		
		JButton cancelar = new JButton("Volver");
		cancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setVisible(false);
			}
		});
		cancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancelar.setBounds(215, 419, 150, 40);
		contentPane.add(cancelar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(-22, 406, 606, 2);
		contentPane.add(separator_1);
		
		tfnombre = new JTextField();
		tfnombre.setEditable(false);
		tfnombre.setHorizontalAlignment(SwingConstants.CENTER);
		tfnombre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfnombre.setBounds(220, 100, 354, 40);
		contentPane.add(tfnombre);
		tfnombre.setColumns(10);
		
		tfdireccion = new JTextField();
		tfdireccion.setEditable(false);
		tfdireccion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfdireccion.setHorizontalAlignment(SwingConstants.CENTER);
		tfdireccion.setColumns(10);
		tfdireccion.setBounds(220, 149, 354, 40);
		contentPane.add(tfdireccion);
		
		tfnumero = new JTextField();
		tfnumero.setEditable(false);
		tfnumero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfnumero.setHorizontalAlignment(SwingConstants.CENTER);
		tfnumero.setColumns(10);
		tfnumero.setBounds(220, 200, 354, 40);
		contentPane.add(tfnumero);
		
		tfemail = new JTextField();
		tfemail.setEditable(false);
		tfemail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfemail.setHorizontalAlignment(SwingConstants.CENTER);
		tfemail.setColumns(10);
		tfemail.setBounds(220, 250, 354, 40);
		contentPane.add(tfemail);
		
		tfsector = new JTextField();
		tfsector.setEditable(false);
		tfsector.setHorizontalAlignment(SwingConstants.CENTER);
		tfsector.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfsector.setColumns(10);
		tfsector.setBounds(220, 300, 354, 40);
		contentPane.add(tfsector);
		
		tfestado = new JTextField();
		tfestado.setEditable(false);
		tfestado.setHorizontalAlignment(SwingConstants.CENTER);
		tfestado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfestado.setColumns(10);
		tfestado.setBounds(220, 350, 354, 40);
		contentPane.add(tfestado);
		
	}
}
