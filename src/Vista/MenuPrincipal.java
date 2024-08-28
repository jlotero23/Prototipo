package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuPrincipal{
	
	public static String user;
	public static String name;
	private JPanel contentPane;
	
	public MenuPrincipal() {
		JFrame frame =new JFrame();
		frame.setTitle("CMR Inicio");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnregistroclientes = new JButton("Registro Clientes");
		btnregistroclientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				registroCliente regcl =new registroCliente();
				frame.dispose();
				
			}
		});
		btnregistroclientes.setBounds(30, 80, 220, 50);
		contentPane.add(btnregistroclientes);
		
		JButton btnregistrocuentas = new JButton("Registro de cuentas");
		btnregistrocuentas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				RegistroCuenta regcu =new RegistroCuenta();
				frame.dispose();
			}
		});
		btnregistrocuentas.setBounds(30, 150, 220, 50);
		contentPane.add(btnregistrocuentas);
		
		JButton btnconsultacuentas = new JButton("Consulta de cuentas");
		btnconsultacuentas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ConsultaCuenta regcu =new ConsultaCuenta();
				frame.dispose();
				
			}
		});
		btnconsultacuentas.setBounds(30, 220, 220, 50);
		contentPane.add(btnconsultacuentas);
		
		JButton btnIngenieros = new JButton("Registro de Interacciones");
		btnIngenieros.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Intermedio regcu =new Intermedio();
				frame.dispose();
			}
		});
		btnIngenieros.setBounds(30, 290, 220, 50);
		contentPane.add(btnIngenieros);
		
		JLabel cmr = new JLabel("CMR");
		cmr.setFont(new Font("Tahoma", Font.PLAIN, 60));
		cmr.setHorizontalAlignment(SwingConstants.CENTER);
		cmr.setBounds(30, 10, 220, 50);
		contentPane.add(cmr);
		
		
		frame.setVisible(true);
	}
	
}
