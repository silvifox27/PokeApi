package pokeapi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
					frame.setVisible(true);
					FondoPanel fondo=new FondoPanel("images/fondoPokeball.jpg");
					fondo.setSize(frame.getWidth(), frame.getHeight());
					frame.add(fondo);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 400, 500);
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    contentPane.setLayout(new BorderLayout()); // Configurar BorderLayout
	    setContentPane(contentPane);
		
		
		JButton btn_verPokemon = new JButton("   Ver Pokemon");
		ImageIcon iconVerPokemon=new ImageIcon(getClass().getResource("images/telefono-inteligente.png"));
		btn_verPokemon.setIcon(iconVerPokemon);
		btn_verPokemon.setBounds(71, 49, 200, 66);
		btn_verPokemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//añadir ventana de Samuel para ver el pokemon
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btn_verPokemon);
		
		JButton btn_batalla = new JButton("   Luchar");
		ImageIcon iconBatalla=new ImageIcon(getClass().getResource("images/lucha.png"));
		btn_batalla.setIcon(iconBatalla);
		btn_batalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Añadir ventana de lucha
			}
		});
		btn_batalla.setBounds(71, 125, 200, 66);
		contentPane.add(btn_batalla);
		
		JButton btn_pokedex = new JButton("   Pokedex");
		btn_pokedex.setBounds(71, 201, 200, 66);
		ImageIcon iconPokedex=new ImageIcon(getClass().getResource("images/pokedex.png"));
		btn_pokedex.setIcon(iconPokedex);
		btn_pokedex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Añadir ventana de pokedex
			}
		});
		contentPane.add(btn_pokedex);
	}
}
