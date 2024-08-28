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

public class Inicio{
	
	public static String user;
	public static String name;
	private JPanel contentPane;
	
	public Inicio() {
		JFrame frame =new JFrame();
		frame.setTitle("CMR Inicio");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVendedor = new JButton("Carolina Humanez (Vendedor)");
		btnVendedor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paso2("Vendedor","Carolina Humanez",frame);
				
			}
		});
		btnVendedor.setBounds(30, 200, 220, 50);
		contentPane.add(btnVendedor);
		
		JButton btnIngeniero = new JButton("Juan José Lotero (Ingeniero)");
		btnIngeniero.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paso2("Ingeniero","Juan José Lotero",frame);
				
			}
		});
		btnIngeniero.setBounds(30, 270, 220, 50);
		contentPane.add(btnIngeniero);
		
		JLabel cmr = new JLabel("CMR");
		cmr.setFont(new Font("Tahoma", Font.PLAIN, 60));
		cmr.setHorizontalAlignment(SwingConstants.CENTER);
		cmr.setBounds(30, 10, 220, 50);
		contentPane.add(cmr);
		
		JLabel ingreso = new JLabel("Ingresa Como:");
		ingreso.setVerticalAlignment(SwingConstants.TOP);
		ingreso.setFont(new Font("Tahoma", Font.PLAIN, 25));
		ingreso.setHorizontalAlignment(SwingConstants.CENTER);
		ingreso.setBounds(30, 130, 220, 50);
		contentPane.add(ingreso);
		
		JLabel bienvenido = new JLabel("Bienvenido");
		bienvenido.setVerticalAlignment(SwingConstants.BOTTOM);
		bienvenido.setFont(new Font("Tahoma", Font.PLAIN, 25));
		bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		bienvenido.setBounds(30, 70, 220, 50);
		contentPane.add(bienvenido);
		
		frame.setVisible(true);
	}
	
	void paso2(String usuario, String nombre, JFrame frame) {
		user=usuario;
		name=nombre;
		System.out.println(user);
		MenuPrincipal siguientef = new MenuPrincipal();
		frame.dispose();
	}
}
