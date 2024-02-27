package pokeapi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

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
					frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/pokebola.png"));
					frame.setTitle("Menú");
					//FondoPanel fondo=new FondoPanel("images/fondoPokeball.jpg");
					//fondo.setSize(frame.getWidth(), frame.getHeight());
					//frame.getContentPane().add(fondo);
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
	    setBounds(100, 100, 300, 400);
	    contentPane = new JPanel();
	    contentPane.setBackground(new Color(255, 255, 255));
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
		
		
		
		JButton btn_verPokemon = new JButton(" Ver Pokemon");
		btn_verPokemon.setFont(new Font("Consolas", Font.PLAIN, 11));
		btn_verPokemon.setBackground(new Color(255, 255, 255));
		//ImageIcon iconVerPokemon=new ImageIcon(getClass().getResource("images/telefono-inteligente.png"));
		//btn_verPokemon.setIcon(iconVerPokemon);
		btn_verPokemon.setBounds(40, 80, 200, 34);
		btn_verPokemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Añadir ventana de Samuel para ver el pokemon
				
			}
		});
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(124, 215, 82, 32);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("pokeapi/src/main/java/pokeapi/images/pokebola (1).png"));
		contentPane.add(btn_verPokemon);
		
		JButton btn_batalla = new JButton("Luchar");
		btn_batalla.setFont(new Font("Consolas", Font.PLAIN, 11));
		btn_batalla.setBackground(new Color(255, 255, 255));
		//ImageIcon iconBatalla=new ImageIcon(getClass().getResource("images/lucha.png"));
		//btn_batalla.setIcon(iconBatalla);
		btn_batalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaCombate ventanaCombate = new VentanaCombate();
				ventanaCombate.setVisible(true);
			}
		});
		btn_batalla.setBounds(40, 125, 200, 34);
		contentPane.add(btn_batalla);
		
		JButton btn_pokedex = new JButton("Pokedex");
		btn_pokedex.setFont(new Font("Consolas", Font.PLAIN, 11));
		btn_pokedex.setBackground(new Color(255, 255, 255));
		btn_pokedex.setBounds(40, 170, 200, 34);
		//ImageIcon iconPokedex=new ImageIcon(getClass().getResource("images/pokedex.png"));
		//btn_pokedex.setIcon(iconPokedex);
		btn_pokedex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//Añadir ventana de pokedex
			}
		});
		contentPane.add(btn_pokedex);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("pokeapi/src/main/java/pokeapi/images/bienvenido.png"));
		lblNewLabel.setBounds(86, -4, 98, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("pokeapi/src/main/java/pokeapi/images/info.png"));
		lblNewLabel_1.setBounds(40, 37, 200, 32);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(238, 82, 129));
		panel.setBounds(0, 229, 284, 132);
		contentPane.add(panel);
	}
}
