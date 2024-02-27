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


public class pantallaEleccion {
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
                    pantallaEleccion window = new pantallaEleccion();
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
        frame = new JFrame();
        frame.setBounds(100, 100, 593, 401);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
    
        // Etiquetas para mostrar los tipos de Pokémon
        lbl_tipoPlanta = new JLabel("Planta");
        lbl_tipoPlanta.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_tipoPlanta.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
        lbl_tipoPlanta.setBounds(403, 254, 95, 13);
        frame.getContentPane().add(lbl_tipoPlanta);
    
        lbl_tipoFuego = new JLabel("Fuego");
        lbl_tipoFuego.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_tipoFuego.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
        lbl_tipoFuego.setBounds(53, 254, 95, 13);
        frame.getContentPane().add(lbl_tipoFuego);
    
        lbl_tipoAgua = new JLabel("Agua");
        lbl_tipoAgua.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_tipoAgua.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 13));
        lbl_tipoAgua.setBounds(221, 254, 95, 13);
        frame.getContentPane().add(lbl_tipoAgua);
    
        // ComboBox para seleccionar la generación de Pokémon
        cb_generaciones = new JComboBox<String>();
        cb_generaciones.setBounds(198, 33, 170, 21);
        frame.getContentPane().add(cb_generaciones);
    
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
                        lbl_tipoFuego.setText("Charizard");
                        lbl_tipoAgua.setText("Squirtle");
                        lbl_tipoPlanta.setText("Bulbasaur");
                        generacionesStarters.mostrarPokemonGeneracion1(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 2":
                        lbl_tipoAgua.setText("Cyndaquil");
                        lbl_tipoPlanta.setText("Totodile");
                        lbl_tipoFuego.setText("Chikorita");
                        generacionesStarters.mostrarPokemonGeneracion2(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 3":
                        lbl_tipoFuego.setText("Treecko");
                        lbl_tipoAgua.setText("Torchic");
                        lbl_tipoPlanta.setText("Mudkip");
                        generacionesStarters.mostrarPokemonGeneracion3(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 4":
                        lbl_tipoFuego.setText("Turtwig");
                        lbl_tipoAgua.setText("Chimchar");
                        lbl_tipoPlanta.setText("Piplup");
                        generacionesStarters.mostrarPokemonGeneracion4(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 5":
                        lbl_tipoFuego.setText("Snivy");
                        lbl_tipoAgua.setText("Tepig");
                        lbl_tipoPlanta.setText("Oshawott");
                        generacionesStarters.mostrarPokemonGeneracion5(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 6":
                        lbl_tipoFuego.setText("Chespin");
                        lbl_tipoAgua.setText("Fennekin");
                        lbl_tipoPlanta.setText("Froakie");
                        generacionesStarters.mostrarPokemonGeneracion6(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 7":
                        lbl_tipoFuego.setText("Rowlet");
                        lbl_tipoAgua.setText("Litten");
                        lbl_tipoPlanta.setText("Popplio");
                        generacionesStarters.mostrarPokemonGeneracion7(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 8":
                        lbl_tipoFuego.setText("Grookey");
                        lbl_tipoAgua.setText("Scorbunny");
                        lbl_tipoPlanta.setText("Sobble");
                        generacionesStarters.mostrarPokemonGeneracion8(panel_1_2, panel_1, panel_1_1);
                        break;
                    case "Generación 9":
                        lbl_tipoFuego.setText("Sprigatito");
                        lbl_tipoAgua.setText("Fuecoco");
                        lbl_tipoPlanta.setText("Quaxly");
                        generacionesStarters.mostrarPokemonGeneracion9(panel_1_2, panel_1, panel_1_1);
                        break;
                    // Puedes agregar casos para otras generaciones aquí si es necesario
                    default:
                        // Manejo para generaciones no implementadas o no válidas
                        break;
                }
            }
        });
        
        

        frame.getContentPane().add(cb_generaciones);

        panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_1.setBounds(53, 102, 123, 115);
        frame.getContentPane().add(panel_1);

        btn_tipoFuego = new JButton("Elegir");
        btn_tipoFuego.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemon(lbl_tipoFuego.getText());

            }
        });
        btn_tipoFuego.setForeground(Color.BLACK);
        btn_tipoFuego.setBounds(53, 292, 113, 32);
        frame.getContentPane().add(btn_tipoFuego);


        btn_tipoAgua = new JButton("Elegir");
        btn_tipoAgua.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemon(lbl_tipoAgua.getText());

            }
        });
        btn_tipoAgua.setForeground(Color.BLACK);
        btn_tipoAgua.setBounds(214, 292, 113, 32);
        frame.getContentPane().add(btn_tipoAgua);


        btn_tipoPlanta = new JButton("Elegir");
        btn_tipoPlanta.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarPokemon(lbl_tipoPlanta.getText());

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

    private void mostrarPokemon(String nombrePokemon) {
        // Crear una nueva ventana emergente (JOptionPane)
        JFrame frame = new JFrame("Pokémon Elegido");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        // Crear un JPanel para organizar los componentes
        JPanel panel = new JPanel(new BorderLayout());
        
        // Crear un JLabel para mostrar el nombre del Pokémon
        JLabel lblNombrePokemon = new JLabel("¡Has elegido a " + nombrePokemon + "!");
        lblNombrePokemon.setFont(new Font("Tahoma", Font.BOLD, 18));
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
            lblError.setFont(new Font("Tahoma", Font.PLAIN, 12));
            lblError.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(lblError, BorderLayout.CENTER);
        }
        
        // Crear un JPanel para contener los botones
        JPanel buttonPanel = new JPanel(new FlowLayout());
        
        // Botón para volver a elegir el Pokémon
        JButton btnElegirPokemon = new JButton("Volver a elegir");
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
        btnJugar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar la lógica para comenzar el juego
                // Por ejemplo, abrir una nueva ventana para el juego, etc.
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
