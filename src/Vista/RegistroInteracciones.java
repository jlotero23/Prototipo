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

import Modelo.ActualizacionEnDB;
import Modelo.RegistrosEnDB;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class RegistroInteracciones{

	private JPanel contentPane;
	private JTextField tfvendedor;
	private JTextField tfingeniero;
	private JTextField textID;
	

	
	public RegistroInteracciones(int decision) {
		
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
		
		JComboBox<String> cbpercepcio = new JComboBox<String>();
		cbpercepcio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cbpercepcio.setBounds(141, 429, 136, 40);
		String[] percepcion = {"","Neutral", "Muy Buena", "Buena", "Mala", "Muy mala"};
		for (String elemento : percepcion) {
		    cbpercepcio.addItem(elemento);
		}
		contentPane.add(cbpercepcio);
		
		JComboBox<String> cbtipo = new JComboBox<String>();
		cbtipo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cbtipo.setBounds(380, 429, 136, 40);
		String[]tipos = {"","Soporte", "Seguimiento", "Contacto"};
		for (String elemento : tipos) {
		    cbtipo.addItem(elemento);
		}
		
		contentPane.add(cbtipo);
		

		
		JTextArea texto = new JTextArea();
		texto.setFont(new Font("Monospaced", Font.PLAIN, 16));
		texto.setBounds(20, 290, 554, 128);
		
		JScrollPane scrollPane = new JScrollPane(texto);
		scrollPane.setBounds(20, 290, 554, 128);
		contentPane.add(scrollPane);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textID.setEnabled(false);
				if (decision==1) {
					Modelo.ConsultasEnDB consu = new Modelo.ConsultasEnDB();
					String[] res = consu.consultaCuentaDB(Integer.parseInt(textID.getText()));
					tfvendedor.setText(res[2]);
					tfingeniero.setText(res[3]);
					 
				}else {
					Modelo.ConsultasEnDB consu = new Modelo.ConsultasEnDB();
					String[] res = consu.consultaInteraccion(Integer.parseInt(textID.getText()));
					tfvendedor.setText(res[0]);
					tfingeniero.setText(res[1]);
					texto.setText(res[2]);
					cbpercepcio.setSelectedItem(res[4]);
					cbtipo.setSelectedItem(res[3]);
				}
			}
		});
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBuscar.setBounds(456, 100, 118, 39);
		contentPane.add(btnBuscar);
		
		JLabel ID;
		if (decision==1) {
			 ID = new JLabel("ID Cuenta");
			 
		}else {
			 ID = new JLabel("ID Interaccion");
		}
		ID.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ID.setHorizontalAlignment(SwingConstants.CENTER);
		ID.setBounds(10, 100, 200, 40);
		contentPane.add(ID);
		
		JLabel admin = new JLabel("Vendedor Asociado");
		admin.setHorizontalAlignment(SwingConstants.CENTER);
		admin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		admin.setBounds(10, 150, 200, 40);
		contentPane.add(admin);
		
		JLabel numadmin = new JLabel("Ingeniero Asociado");
		numadmin.setHorizontalAlignment(SwingConstants.CENTER);
		numadmin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numadmin.setBounds(10, 200, 200, 40);
		contentPane.add(numadmin);
		
		JLabel observaciones = new JLabel("Observaciones:");
		observaciones.setHorizontalAlignment(SwingConstants.CENTER);
		observaciones.setFont(new Font("Tahoma", Font.PLAIN, 20));
		observaciones.setBounds(10, 250, 200, 40);
		contentPane.add(observaciones);
		
		JLabel Estado = new JLabel("Tipo");
		Estado.setHorizontalAlignment(SwingConstants.CENTER);
		Estado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Estado.setBounds(287, 429, 112, 40);
		contentPane.add(Estado);
		
		JLabel ingeniero = new JLabel("Percepcion");
		ingeniero.setHorizontalAlignment(SwingConstants.CENTER);
		ingeniero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ingeniero.setBounds(20, 429, 127, 40);
		contentPane.add(ingeniero);
	
			
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
				int id = Integer.parseInt(textID.getText());
				String vendedor = tfvendedor.getText();
				String ingeniero = tfingeniero.getText();
				String observacion = texto.getText();
				String tipo = (String) cbtipo.getSelectedItem();
				String percepcion = (String) cbpercepcio.getSelectedItem();
				if (decision==1) {
					RegistrosEnDB reg = new RegistrosEnDB();
					reg.RegistroInteraccionEnDB(vendedor, ingeniero, observacion, tipo, percepcion, id, Inicio.name);
				}else {
					ActualizacionEnDB act = new ActualizacionEnDB();
					act.ActualizarInteraccionEnDB(vendedor, ingeniero, observacion, tipo, percepcion, id, Inicio.name);
				}
					
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
		
		
		tfvendedor = new JTextField();
		tfvendedor.setEditable(false);
		tfvendedor.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfvendedor.setHorizontalAlignment(SwingConstants.CENTER);
		tfvendedor.setColumns(10);
		tfvendedor.setBounds(220, 150, 354, 40);
		contentPane.add(tfvendedor);
		
		tfingeniero = new JTextField();
		tfingeniero.setEditable(false);
		tfingeniero.setFont(new Font("Tahoma", Font.PLAIN, 25));
		tfingeniero.setHorizontalAlignment(SwingConstants.CENTER);
		tfingeniero.setColumns(10);
		tfingeniero.setBounds(220, 200, 354, 40);
		contentPane.add(tfingeniero);
		
		textID = new JTextField();
		textID.setHorizontalAlignment(SwingConstants.CENTER);
		textID.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textID.setColumns(10);
		textID.setBounds(220, 100, 226, 40);
		contentPane.add(textID);
		
			
		frame.setVisible(true);
	}
}

