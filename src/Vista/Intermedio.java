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

public class Intermedio{
	
	private JPanel contentPane;
	
	public Intermedio() {
		JFrame frame =new JFrame();
		frame.setTitle("CMR Inicio");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 300, 288);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnnuevo = new JButton("Nuevo Registro");
		btnnuevo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnnuevo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paso5(1,"Carolina Humanez",frame);
				
			}
		});
		btnnuevo.setBounds(30, 96, 220, 50);
		contentPane.add(btnnuevo);
		
		JButton btnactualizar = new JButton("Actualizar Registro");
		btnactualizar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnactualizar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				paso5(2,"Juan José Lotero",frame);
				
			}
		});
		btnactualizar.setBounds(30, 169, 220, 50);
		contentPane.add(btnactualizar);
		
		JLabel cmr = new JLabel("CMR");
		cmr.setFont(new Font("Tahoma", Font.PLAIN, 60));
		cmr.setHorizontalAlignment(SwingConstants.CENTER);
		cmr.setBounds(30, 10, 220, 50);
		contentPane.add(cmr);
		
		frame.setVisible(true);
	}
	
	void paso5(int decision, String nombre, JFrame frame) {
		RegistroInteracciones siguientef = new RegistroInteracciones(decision);
		frame.dispose();
	}
}