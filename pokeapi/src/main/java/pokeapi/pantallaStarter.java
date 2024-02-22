
package pokeapi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class pantallaStarter {

	private JFrame frame;
	private JLabel lbl_tipoFuego;
	private JLabel lbl_tipoAgua;
	private JButton btn_tipoFuego;
	private JButton btn_tipoAgua;
	private JButton btn_tipoPlanta;
	private JPanel panel_1;
	private JComboBox<String> cb_generaciones;

	private ArrayList<String> generaciones; // ArrayList para almacenar las generaciones
	private JLabel lbl_tipoPlanta;
	private JPanel panel_1_2;
	private JPanel panel_1_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantallaStarter window = new pantallaStarter();
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
	public pantallaStarter() {

		generaciones = new ArrayList<String>(); // Inicializa el ArrayList
		generaciones.add("Generación 1");
		generaciones.add("Generación 2");
		generaciones.add("Generación 3");
		generaciones.add("Generación 4");
		generaciones.add("Generación 5");
		generaciones.add("Generación 6");
		generaciones.add("Generación 7");
		generaciones.add("Generación 8");
		generaciones.add("Generación 9");

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 593, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lbl_tipoFuego = new JLabel("Charizard ");
		lbl_tipoFuego.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipoFuego.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		lbl_tipoFuego.setBounds(53, 254, 95, 13);
		frame.getContentPane().add(lbl_tipoFuego);

		lbl_tipoAgua = new JLabel("Squirtle");
		lbl_tipoAgua.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipoAgua.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		lbl_tipoAgua.setBounds(221, 254, 95, 13);
		frame.getContentPane().add(lbl_tipoAgua);

		lbl_tipoPlanta = new JLabel("Bulbasur");
		lbl_tipoPlanta.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipoPlanta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
		lbl_tipoPlanta.setBounds(403, 254, 95, 13);
		frame.getContentPane().add(lbl_tipoPlanta);

		cb_generaciones = new JComboBox<String>();
		cb_generaciones.setBounds(198, 33, 170, 21);
		frame.getContentPane().add(cb_generaciones);

		// Crea un modelo y agrega el ArrayList al modelo
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(generaciones.toArray(new String[0]));
		cb_generaciones.setModel(comboBoxModel);

		frame.getContentPane().add(cb_generaciones);

		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(53, 102, 123, 115);
		frame.getContentPane().add(panel_1);

		btn_tipoFuego = new JButton("Elegir");
		btn_tipoFuego.setForeground(Color.BLACK);
		btn_tipoFuego.setBounds(53, 292, 113, 32);
		frame.getContentPane().add(btn_tipoFuego);

		btn_tipoAgua = new JButton("Elegir");
		btn_tipoAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_tipoAgua.setForeground(Color.BLACK);
		btn_tipoAgua.setBounds(214, 292, 113, 32);
		frame.getContentPane().add(btn_tipoAgua);

		btn_tipoPlanta = new JButton("Elegir");
		btn_tipoPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_tipoPlanta.setForeground(Color.BLACK);
		btn_tipoPlanta.setBounds(395, 292, 113, 32);
		frame.getContentPane().add(btn_tipoPlanta);

		JLabel lblNewLabel = new JLabel("Generación:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setLabelFor(cb_generaciones);
		lblNewLabel.setBounds(78, 27, 123, 32);
		frame.getContentPane().add(lblNewLabel);

		panel_1_1 = new JPanel();
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_1.setBounds(219, 102, 123, 115);
		frame.getContentPane().add(panel_1_1);

		panel_1_2 = new JPanel();
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1_2.setBounds(385, 102, 123, 115);
		frame.getContentPane().add(panel_1_2);
	}
}
