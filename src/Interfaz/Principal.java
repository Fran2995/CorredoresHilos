package Interfaz;

import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.Corredor;
import Logica.Equipo;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Principal extends JFrame {

	private static JPanel contentPane;

	public Equipo[] equipos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		crearEquipos();

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(47, 118, 46, 14);
		contentPane.add(lblNewLabel);
		
		
	}
	
	public static void anadirCorredor(JLabel corredor) {
		contentPane.add(corredor);
	}
	
	public void crearEquipos() {

		this.equipos = new Equipo[3];
		for (int i = 0; i < 3; i++) {
			Equipo eq = new Equipo(10+100 * i, i + 1);
			this.equipos[i] = eq;
		}

	}
}
