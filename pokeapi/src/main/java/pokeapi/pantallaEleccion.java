package pokeapi;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Window.Type;
import java.awt.Toolkit;

public class pantallaEleccion {
	private JFrame frmPokochi;
	private JLabel lbl_tipoPlanta;
	private JLabel lbl_tipoFuego;
	private JButton btn_tipoFuego;
	private JButton btn_tipoAgua;
	private JButton btn_tipoPlanta;
	private JPanel panel_planta;
	private JComboBox<String> cb_generaciones;

	private ArrayList<String> generaciones; // ArrayList para almacenar las generaciones
	private JLabel lbl_tipoAgua;
	private JPanel panel_agua;
	private JPanel panel_fuego;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantallaEleccion window = new pantallaEleccion();
					window.frmPokochi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pantallaEleccion() {

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
		frmPokochi = new JFrame();
		frmPokochi.setIconImage(Toolkit.getDefaultToolkit().getImage("images/pokebola.png"));
		frmPokochi.getContentPane().setForeground(Color.BLACK);
		frmPokochi.setType(Type.POPUP);
		frmPokochi.setFont(new Font("Consolas", Font.PLAIN, 12));
		frmPokochi.setTitle("Pokochi");
		frmPokochi.setForeground(Color.BLACK);
		frmPokochi.setBackground(Color.BLACK);
		frmPokochi.getContentPane().setBackground(new Color(255, 255, 255));
		frmPokochi.setBounds(100, 100, 593, 401);
		frmPokochi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPokochi.getContentPane().setLayout(null);

		// Etiquetas para mostrar los tipos de Pokémon
		lbl_tipoAgua = new JLabel("Agua");
		lbl_tipoAgua.setBounds(403, 200, 95, 15);
		lbl_tipoAgua.setForeground(new Color(0, 128, 255));
		lbl_tipoAgua.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipoAgua.setFont(new Font("Consolas", Font.BOLD, 12));
		frmPokochi.getContentPane().add(lbl_tipoAgua);

		lbl_tipoPlanta = new JLabel("Planta");
		lbl_tipoPlanta.setBounds(65, 200, 95, 15);
		lbl_tipoPlanta.setForeground(new Color(0, 128, 0));
		lbl_tipoPlanta.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipoPlanta.setFont(new Font("Consolas", Font.BOLD, 12));
		frmPokochi.getContentPane().add(lbl_tipoPlanta);

		lbl_tipoFuego = new JLabel("Fuego");
		lbl_tipoFuego.setBounds(230, 200, 95, 15);
		lbl_tipoFuego.setForeground(new Color(255, 0, 0));
		lbl_tipoFuego.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_tipoFuego.setFont(new Font("Consolas", Font.BOLD, 12));
		frmPokochi.getContentPane().add(lbl_tipoFuego);

		// ComboBox para seleccionar la generación de Pokémon
		cb_generaciones = new JComboBox<String>();
		cb_generaciones.setBounds(240, 33, 170, 21);
		cb_generaciones.setForeground(new Color(0, 0, 0));
		cb_generaciones.setFont(new Font("Consolas", Font.PLAIN, 11));
		cb_generaciones.setBackground(new Color(243, 243, 243));
		cb_generaciones.setToolTipText("Seleccione la generación...");
		frmPokochi.getContentPane().add(cb_generaciones);

		// Inicialización del ArrayList de generaciones y configuración del ComboBox
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
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(generaciones.toArray(new String[0]));
		cb_generaciones.setModel(comboBoxModel);

		cb_generaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedGeneration = (String) cb_generaciones.getSelectedItem();
				switch (selectedGeneration) {
				case "Generación 1":
                    lbl_tipoPlanta.setText("Bulbasaur");
                    lbl_tipoFuego.setText("Charmander");
                    lbl_tipoAgua.setText("Squirtle");
                    generacionesStarters.mostrarPokemonGeneracion1(panel_planta, panel_fuego, panel_agua);
					break;
				case "Generación 2":
					lbl_tipoFuego.setText("Cyndaquil");
					lbl_tipoAgua.setText("Totodile");
					lbl_tipoPlanta.setText("Chikorita");
					generacionesStarters.mostrarPokemonGeneracion2(panel_agua, panel_planta, panel_fuego);
					break;
				case "Generación 3":
					lbl_tipoPlanta.setText("Treecko");
					lbl_tipoFuego.setText("Torchic");
					lbl_tipoAgua.setText("Mudkip");
					generacionesStarters.mostrarPokemonGeneracion3(panel_agua, panel_planta, panel_fuego);
					break;
				case "Generación 4":
					lbl_tipoPlanta.setText("Turtwig");
					lbl_tipoFuego.setText("Chimchar");
					lbl_tipoAgua.setText("Piplup");
					generacionesStarters.mostrarPokemonGeneracion4(panel_agua, panel_planta, panel_fuego);
					break;
				case "Generación 5":
					lbl_tipoPlanta.setText("Snivy");
					lbl_tipoFuego.setText("Tepig");
					lbl_tipoAgua.setText("Oshawott");
					generacionesStarters.mostrarPokemonGeneracion5(panel_agua, panel_planta, panel_fuego);
					break;
				case "Generación 6":
					lbl_tipoPlanta.setText("Chespin");
					lbl_tipoFuego.setText("Fennekin");
					lbl_tipoAgua.setText("Froakie");
					generacionesStarters.mostrarPokemonGeneracion6(panel_agua, panel_planta, panel_fuego);
					break;
				case "Generación 7":
					lbl_tipoPlanta.setText("Rowlet");
					lbl_tipoFuego.setText("Litten");
					lbl_tipoAgua.setText("Popplio");
					generacionesStarters.mostrarPokemonGeneracion7(panel_agua, panel_planta, panel_fuego);
					break;
				case "Generación 8":
					lbl_tipoPlanta.setText("Grookey");
					lbl_tipoFuego.setText("Scorbunny");
					lbl_tipoAgua.setText("Sobble");
					generacionesStarters.mostrarPokemonGeneracion8(panel_agua, panel_planta, panel_fuego);
					break;
				case "Generación 9":
					lbl_tipoPlanta.setText("Sprigatito");
					lbl_tipoFuego.setText("Fuecoco");
					lbl_tipoAgua.setText("Quaxly");
					generacionesStarters.mostrarPokemonGeneracion9(panel_agua, panel_planta, panel_fuego);
					break;
				// Puedes agregar casos para otras generaciones aquí si es necesario
				default:
					// Manejo para generaciones no implementadas o no válidas
					break;
				}
			}
		});

		frmPokochi.getContentPane().add(cb_generaciones);

		panel_planta = new JPanel();
		panel_planta.setBounds(53, 102, 123, 90);
		panel_planta.setBackground(new Color(228, 240, 189));
		panel_planta.setForeground(new Color(255, 255, 255));
		panel_planta.setBorder(new LineBorder(new Color(255, 255, 255)));
		frmPokochi.getContentPane().add(panel_planta);

		btn_tipoFuego = new JButton("Elegir");
		btn_tipoFuego.setBounds(59, 292, 113, 32);
		btn_tipoFuego.setBackground(new Color(237, 247, 204));
		btn_tipoFuego.setFont(new Font("Consolas", Font.PLAIN, 11));
		btn_tipoFuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPokemon(lbl_tipoPlanta.getText());

			}
		});
		btn_tipoFuego.setForeground(Color.BLACK);
		frmPokochi.getContentPane().add(btn_tipoFuego);

		btn_tipoAgua = new JButton("Elegir");
		btn_tipoAgua.setBounds(225, 292, 113, 32);
		btn_tipoAgua.setBackground(new Color(253, 206, 207));
		btn_tipoAgua.setFont(new Font("Consolas", Font.PLAIN, 11));
		btn_tipoAgua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPokemon(lbl_tipoFuego.getText());

			}
		});
		btn_tipoAgua.setForeground(Color.BLACK);
		frmPokochi.getContentPane().add(btn_tipoAgua);

		btn_tipoPlanta = new JButton("Elegir");
		btn_tipoPlanta.setBounds(395, 292, 113, 32);
		btn_tipoPlanta.setBackground(new Color(223, 236, 255));
		btn_tipoPlanta.setFont(new Font("Consolas", Font.PLAIN, 11));
		btn_tipoPlanta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarPokemon(lbl_tipoAgua.getText());

			}
		});
		btn_tipoPlanta.setForeground(Color.BLACK);
		frmPokochi.getContentPane().add(btn_tipoPlanta);

		JLabel lblNewLabel = new JLabel("Generación:");
		lblNewLabel.setBackground(new Color(51, 51, 51));
		lblNewLabel.setBounds(160, 30, 123, 32);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 12));
		lblNewLabel.setLabelFor(cb_generaciones);
		frmPokochi.getContentPane().add(lblNewLabel);

		panel_fuego = new JPanel();
		panel_fuego.setBounds(219, 102, 123, 90);
		panel_fuego.setForeground(new Color(255, 255, 255));
		panel_fuego.setBackground(new Color(253, 206, 207));
		panel_fuego.setBorder(new LineBorder(new Color(255, 255, 255)));
		frmPokochi.getContentPane().add(panel_fuego);

		panel_agua = new JPanel();
		panel_agua.setBounds(385, 102, 123, 90);
		panel_agua.setForeground(Color.WHITE);
		panel_agua.setBackground(new Color(223, 236, 255));
		panel_agua.setBorder(new LineBorder(Color.WHITE));
		frmPokochi.getContentPane().add(panel_agua);

	}

	private void mostrarPokemon(String nombrePokemon) {
		// Crear una nueva ventana emergente (JOptionPane)
		final JFrame frame = new JFrame("Bienvenido!!!");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// Crear un JPanel para organizar los componentes
		JPanel panel = new JPanel(new BorderLayout());
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/pokebola.png"));


		// Crear un JLabel para mostrar el nombre del Pokémon
		JLabel lblNombrePokemon = new JLabel("¡Has elegido a " + nombrePokemon + "!");
		lblNombrePokemon.setFont(new Font("Consolas", Font.BOLD, 18));
		lblNombrePokemon.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNombrePokemon, BorderLayout.NORTH);

		// Obtener la URL del GIF del Pokémon elegido
		generacionesStarters starters = new generacionesStarters();
		URL gifURL = starters.obtenerGifPokemon(nombrePokemon);
		if (gifURL != null) {
			// Crear un JLabel para mostrar el GIF del Pokémon
			ImageIcon gifIcon = new ImageIcon(gifURL);
			JLabel lblGifPokemon = new JLabel(gifIcon);
			panel.add(lblGifPokemon, BorderLayout.CENTER);
		} else {
			// Si no se puede obtener el GIF, mostrar un mensaje de error
			JLabel lblError = new JLabel("No se pudo cargar el GIF del Pokémon.");
			lblError.setFont(new Font("Consolas", Font.PLAIN, 12));
			lblError.setHorizontalAlignment(SwingConstants.CENTER);
			panel.add(lblError, BorderLayout.CENTER);
		}

		// Crear un JPanel para contener los botones
		JPanel buttonPanel = new JPanel(new FlowLayout());

		// Botón para volver a elegir el Pokémon
		JButton btnElegirPokemon = new JButton("Volver a elegir");
		btnElegirPokemon.setBackground(new Color(204, 211, 222));
		btnElegirPokemon.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnElegirPokemon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Cerrar la ventana emergente
				frame.dispose();
			}
		});
		buttonPanel.add(btnElegirPokemon);

		// Botón para jugar
		JButton btnJugar = new JButton("Jugar");
		btnJugar.setBackground(new Color(204, 211, 222));
		btnJugar.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnJugar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		buttonPanel.add(btnJugar);

		// Agregar el panel de botones al panel principal
		panel.add(buttonPanel, BorderLayout.SOUTH);

		// Agregar el panel principal a la ventana
		frame.getContentPane().add(panel);

		// Ajustar el tamaño de la ventana y hacerla visible
		frame.pack();
		frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		frame.setVisible(true);
	}
}
