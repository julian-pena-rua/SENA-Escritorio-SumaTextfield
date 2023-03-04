package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio {

	private JFrame frame;
	private JTextField txtHolaMateo;
	private JTextField txtHolaJulian;
	private JLabel lblResultado;
	private JButton btnResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio window = new Inicio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Inicio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Calculadora de suma");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		txtHolaMateo = new JTextField();
		panel.add(txtHolaMateo);
		txtHolaMateo.setText("Hola Mateo");
		txtHolaMateo.setColumns(10);
		
		txtHolaJulian = new JTextField();
		panel.add(txtHolaJulian);
		txtHolaJulian.setText("Hola Julian");
		txtHolaJulian.setColumns(8);
		
		lblResultado = new JLabel("New label");
		panel.add(lblResultado);
		
		btnResultado = new JButton("Resultado");
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resultado = Integer.parseInt(txtHolaMateo.getText()) + Integer.parseInt(txtHolaJulian.getText());
				lblResultado.setText(""+resultado);
			}
		});
		panel.add(btnResultado);
	}

}
