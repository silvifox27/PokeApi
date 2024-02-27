package pokeapi;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VentanaCombate extends JFrame {

    private JPanel contentPane;

    public VentanaCombate() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("pokeapi/src/main/java/pokeapi/images/fondoCombate.png"));
        lblNewLabel.setBounds(0, 0, 434, 261);
        contentPane.add(lblNewLabel);


        // Aquí puedes agregar los componentes que desees para la pantalla de combate
    }
}
