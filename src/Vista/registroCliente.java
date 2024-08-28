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
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Modelo.RegistrosEnDB;

public class registroCliente{

	private JPanel contentPane;
	private JTextField tfnombre;
	private JTextField tfdireccion;
	private JTextField tfnumero;
	private JTextField tfemail;
	private JTextField tfvendedor;
	

	
	public registroCliente() {
		JFrame frame =new JFrame();
		frame.setTitle("Registro de Cliente");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 600, 600);
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
		
		JLabel vendedor = new JLabel("Vendedor Asociado");
		vendedor.setHorizontalAlignment(SwingConstants.CENTER);
		vendedor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vendedor.setBounds(10, 400, 200, 40);
		contentPane.add(vendedor);
		
		JComboBox<String> cbestado = new JComboBox<String>();
		cbestado.setToolTipText("");
		String[] estados = {"", "Potencial", "Asociado", "Ex-Asociado"};
		for (String elemento :estados) {
		    cbestado.addItem(elemento);
		}
		cbestado.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbestado.setBounds(220, 354, 354, 40);
		contentPane.add(cbestado);
		
		JComboBox<String> cbsectort = new JComboBox<String>();
		String[] sectores = {"","Industrial", "Educativo"};
		for (String elemento : sectores) {
		    cbsectort.addItem(elemento);
		}

		cbsectort.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbsectort.setBounds(220, 304, 354, 40);
		contentPane.add(cbsectort);
		
		JButton cancelar = new JButton("Cancelar");
		cancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				MenuPrincipal mp =new MenuPrincipal();
			}
		});
		cancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancelar.setBounds(260, 500, 150, 40);
		contentPane.add(cancelar);
		
		JButton aceptar = new JButton("Aceptar");
		aceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String nombre = tfnombre.getText();
				String direccion = tfdireccion.getText();
				String numero = tfnumero.getText();
				String email = tfemail.getText();
				String sector = (String) cbsectort.getSelectedItem();
				String estado = (String) cbestado.getSelectedItem();
				RegistrosEnDB reg = new RegistrosEnDB();
				reg.RegistroClientesEnDB(nombre, direccion, numero, email, sector, estado, Inicio.name);
				frame.dispose();
				MenuPrincipal mp =new MenuPrincipal();
				
			}
		});
		aceptar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		aceptar.setBounds(424, 500, 150, 40);
		contentPane.add(aceptar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 480, 606, 2);
		contentPane.add(separator_1);
		
		tfnombre = new JTextField();
		tfnombre.setHorizontalAlignment(SwingConstants.CENTER);
		tfnombre.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfnombre.setBounds(220, 100, 354, 40);
		contentPane.add(tfnombre);
		tfnombre.setColumns(10);
		
		tfdireccion = new JTextField();
		tfdireccion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfdireccion.setHorizontalAlignment(SwingConstants.CENTER);
		tfdireccion.setColumns(10);
		tfdireccion.setBounds(220, 150, 354, 40);
		contentPane.add(tfdireccion);
		
		tfnumero = new JTextField();
		tfnumero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfnumero.setHorizontalAlignment(SwingConstants.CENTER);
		tfnumero.setColumns(10);
		tfnumero.setBounds(220, 200, 354, 40);
		contentPane.add(tfnumero);
		
		tfemail = new JTextField();
		tfemail.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfemail.setHorizontalAlignment(SwingConstants.CENTER);
		tfemail.setColumns(10);
		tfemail.setBounds(220, 249, 354, 40);
		contentPane.add(tfemail);
		
		tfvendedor = new JTextField();
		tfvendedor.setEditable(false);
		tfvendedor.setHorizontalAlignment(SwingConstants.CENTER);
		tfvendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfvendedor.setColumns(10);
		tfvendedor.setBounds(220, 400, 354, 40);
		tfvendedor.setText(Inicio.name);
		contentPane.add(tfvendedor);
		
		
		frame.setVisible(true);
	}
}
