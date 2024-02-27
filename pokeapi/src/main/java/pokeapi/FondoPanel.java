package pokeapi;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class FondoPanel extends JPanel {
    private Image imagenFondo;

    public FondoPanel(String rutaImagen) {
        // Cargar la imagen de fondo
        imagenFondo = new ImageIcon(FondoPanel.class.getResource(rutaImagen)).getImage();
        // Establecer el tamaño del panel para que coincida con el tamaño de la imagen de fondo
        Dimension dimension = new Dimension(imagenFondo.getWidth(null), imagenFondo.getHeight(null));
        setPreferredSize(dimension);
        setMinimumSize(dimension);
        setMaximumSize(dimension);
        setSize(dimension);
        // Configurar el diseño del panel para nulo, para que la imagen de fondo se muestre correctamente
        setLayout(null);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibujar la imagen de fondo
        g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
    }
}
