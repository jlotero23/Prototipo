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

import Modelo.ConsultasEnDB;
import Modelo.RegistrosEnDB;

public class RegistroCuenta{

	private JPanel contentPane;
	private JTextField tflicencia;
	private JTextField tfadmin;
	private JTextField tfnumero;
	private JTextField tfemail;
	private JTextField tfingeniero;
	private JTextField tfvendedor;
	

	
	public RegistroCuenta() {
		
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
		
		JLabel nombre = new JLabel("Cliente");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setBounds(10, 100, 200, 40);
		contentPane.add(nombre);
		
		JLabel admin = new JLabel("Administrador");
		admin.setHorizontalAlignment(SwingConstants.CENTER);
		admin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		admin.setBounds(10, 150, 200, 40);
		contentPane.add(admin);
		
		JLabel numadmin = new JLabel("Teléfono Admin.");
		numadmin.setHorizontalAlignment(SwingConstants.CENTER);
		numadmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numadmin.setBounds(10, 200, 200, 40);
		contentPane.add(numadmin);
		
		JLabel emailadmin = new JLabel("E-mail Admin.");
		emailadmin.setHorizontalAlignment(SwingConstants.CENTER);
		emailadmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		emailadmin.setBounds(10, 250, 200, 40);
		contentPane.add(emailadmin);
		
		JLabel licencia = new JLabel("Tipo de Licencia");
		licencia.setHorizontalAlignment(SwingConstants.CENTER);
		licencia.setFont(new Font("Tahoma", Font.PLAIN, 20));
		licencia.setBounds(10, 300, 200, 40);
		contentPane.add(licencia);
		
		JLabel vendedor = new JLabel("Vendedor Asociado");
		vendedor.setHorizontalAlignment(SwingConstants.CENTER);
		vendedor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		vendedor.setBounds(10, 350, 200, 40);
		contentPane.add(vendedor);
		
		JLabel ingeniero = new JLabel("Ingeniero Asociado");
		ingeniero.setHorizontalAlignment(SwingConstants.CENTER);
		ingeniero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ingeniero.setBounds(10, 400, 200, 40);
		contentPane.add(ingeniero);
		
		JComboBox<String> cbcliente = new JComboBox<String>();
		cbcliente.setToolTipText("");
		Modelo.ConsultasEnDB intento = new ConsultasEnDB();
		String[] lista = intento.consultarListaClientes();
		for (String elemento : lista) {
			cbcliente.addItem(elemento);
		}
		cbcliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		cbcliente.setBounds(220, 100, 354, 40);
		contentPane.add(cbcliente);
			
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
				String cliente = (String)cbcliente.getSelectedItem();
				String admin = tfadmin.getText();
				String numero = tfnumero.getText();
				String email = tfemail.getText();
				String licencia = tflicencia.getText();
				String vendedor = tfvendedor.getText();
				String ingeniero = tfingeniero.getText();
				RegistrosEnDB reg = new RegistrosEnDB();
				reg.RegistroCuentaEnDB(cliente, admin, numero, email, licencia, vendedor, ingeniero);
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
		
		tflicencia = new JTextField();
		tflicencia.setHorizontalAlignment(SwingConstants.CENTER);
		tflicencia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tflicencia.setBounds(220, 300, 354, 40);
		contentPane.add(tflicencia);
		tflicencia.setColumns(10);
		
		
		tfadmin = new JTextField();
		tfadmin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfadmin.setHorizontalAlignment(SwingConstants.CENTER);
		tfadmin.setColumns(10);
		tfadmin.setBounds(220, 150, 354, 40);
		contentPane.add(tfadmin);
		
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
		tfemail.setBounds(220, 250, 354, 40);
		contentPane.add(tfemail);
		
		tfingeniero = new JTextField();
		tfingeniero.setHorizontalAlignment(SwingConstants.CENTER);
		tfingeniero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfingeniero.setColumns(10);
		tfingeniero.setBounds(220, 400, 354, 40);
		contentPane.add(tfingeniero);
		
		tfvendedor = new JTextField();
		tfvendedor.setHorizontalAlignment(SwingConstants.CENTER);
		tfvendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfvendedor.setColumns(10);
		tfvendedor.setBounds(220, 350, 354, 40);
		contentPane.add(tfvendedor);
		
		
		
		
		frame.setVisible(true);
	}
}

