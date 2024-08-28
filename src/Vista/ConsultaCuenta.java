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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import Modelo.ConsultasEnDB;

public class ConsultaCuenta{

	private JPanel contentPane;
	private JTextField tfantiguedad;
	private JTextField tfcliente;
	private JTextField tflicencia;
	private JTextField tffecha;
	private JTextField tfingeniero;
	private JTextField tfvendedor;
	private JTextField tfID;

	
	public ConsultaCuenta() {
		
		JFrame frame =new JFrame();
		ConsultaCliente cc =new ConsultaCliente();
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
		
		JLabel nombre = new JLabel("ID");
		nombre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setBounds(10, 100, 200, 40);
		contentPane.add(nombre);
		
		JLabel admin = new JLabel("Cliente");
		admin.setHorizontalAlignment(SwingConstants.CENTER);
		admin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		admin.setBounds(10, 150, 200, 40);
		contentPane.add(admin);
		
		JLabel numadmin = new JLabel("Tipo Licencia");
		numadmin.setHorizontalAlignment(SwingConstants.CENTER);
		numadmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numadmin.setBounds(10, 200, 200, 40);
		contentPane.add(numadmin);
		
		JLabel emailadmin = new JLabel("Fecha de Registro");
		emailadmin.setHorizontalAlignment(SwingConstants.CENTER);
		emailadmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		emailadmin.setBounds(10, 250, 200, 40);
		contentPane.add(emailadmin);
		
		JLabel licencia = new JLabel("Antiguedad");
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

			
		JButton cancelar = new JButton("Volver");
		cancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				cc.frame.dispose();
				MenuPrincipal mp =new MenuPrincipal();
			}
		});
		cancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cancelar.setBounds(396, 500, 150, 40);
		contentPane.add(cancelar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 480, 606, 2);
		contentPane.add(separator_1);
		
		tfantiguedad = new JTextField();
		tfantiguedad.setEditable(false);
		tfantiguedad.setHorizontalAlignment(SwingConstants.CENTER);
		tfantiguedad.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfantiguedad.setBounds(220, 299, 354, 40);
		contentPane.add(tfantiguedad);
		tfantiguedad.setColumns(10);
		
		
		tfcliente = new JTextField();
		tfcliente.setEditable(false);
		tfcliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfcliente.setHorizontalAlignment(SwingConstants.CENTER);
		tfcliente.setColumns(10);
		tfcliente.setBounds(220, 150, 204, 40);
		contentPane.add(tfcliente);
		
		tflicencia = new JTextField();
		tflicencia.setEditable(false);
		tflicencia.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tflicencia.setHorizontalAlignment(SwingConstants.CENTER);
		tflicencia.setColumns(10);
		tflicencia.setBounds(220, 200, 354, 40);
		contentPane.add(tflicencia);
		
		tffecha = new JTextField();
		tffecha.setEditable(false);
		tffecha.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tffecha.setHorizontalAlignment(SwingConstants.CENTER);
		tffecha.setColumns(10);
		tffecha.setBounds(220, 250, 354, 40);
		contentPane.add(tffecha);
		
		tfingeniero = new JTextField();
		tfingeniero.setEditable(false);
		tfingeniero.setHorizontalAlignment(SwingConstants.CENTER);
		tfingeniero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfingeniero.setColumns(10);
		tfingeniero.setBounds(220, 400, 354, 40);
		contentPane.add(tfingeniero);
		
		tfvendedor = new JTextField();
		tfvendedor.setEditable(false);
		tfvendedor.setHorizontalAlignment(SwingConstants.CENTER);
		tfvendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfvendedor.setColumns(10);
		tfvendedor.setBounds(220, 350, 354, 40);
		contentPane.add(tfvendedor);
		
		tfID = new JTextField();
		tfID.setHorizontalAlignment(SwingConstants.CENTER);
		tfID.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfID.setColumns(10);
		tfID.setBounds(220, 100, 249, 40);
		contentPane.add(tfID);
		
		JButton btninteraccion = new JButton("Interacciones");
		btninteraccion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConsultaInteracciones consulta = new ConsultaInteracciones(Integer.parseInt(tfID.getText()));
			}
			
		});
		btninteraccion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btninteraccion.setBounds(33, 500, 166, 40);
		contentPane.add(btninteraccion);
		
		JButton btnbuscar = new JButton("Buscar");
		btnbuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Modelo.ConsultasEnDB cons = new ConsultasEnDB();
				String[] results = cons.consultaCuentaDB(Integer.parseInt(tfID.getText()));
				tffecha.setText(results[1]);
				tflicencia.setText(results[0]);
				tfvendedor.setText(results[2]);
				tfingeniero.setText(results[3]);
				tfcliente.setText(results[4]);
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				LocalDate fecha = LocalDate.parse(results[1], formatter);
				LocalDate hoy = LocalDate.now();
				long dias = ChronoUnit.DAYS.between(fecha, hoy);
				tfantiguedad.setText(dias + " Días");
				cc.tfdireccion.setText(results[5]);
				cc.tfnumero.setText(results[6]);
				cc.tfemail.setText(results[7]);
				cc.tfsector.setText(results[8]);
				cc.tfestado.setText(results[9]);
				cc.tfnombre.setText(results[4]);
				
				//nombre,direccion,numero,correo,sector,estado
				
			}
		});
		btnbuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnbuscar.setBounds(479, 100, 95, 40);
		contentPane.add(btnbuscar);
		
		JButton btncliente = new JButton("Ver Cliente");
		btncliente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cc.frame.setVisible(true);
			}
		});
		btncliente.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btncliente.setBounds(434, 150, 140, 40);
		contentPane.add(btncliente);
		
		
		
		
		frame.setVisible(true);
	}
}

