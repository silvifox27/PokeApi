package pokeapi;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MapaPokemon extends JFrame {

    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static final int TAMANO_CELDA = 32; // Tamaño de cada celda en píxeles

    private BufferedImage[][] mapa;

    public MapaPokemon() {
        setTitle("Mapa de Pokémon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(COLUMNAS * TAMANO_CELDA, FILAS * TAMANO_CELDA);
        setLocationRelativeTo(null);

        cargarImagenes(); // Cargar las imágenes del mapa

        // Añadir un JPanel personalizado para dibujar el mapa
        JPanel panelMapa = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                dibujarMapa(g);
            }
        };
        panelMapa.setPreferredSize(new Dimension(COLUMNAS * TAMANO_CELDA, FILAS * TAMANO_CELDA));
        add(panelMapa);

        setVisible(true);
    }

    private void cargarImagenes() {
        // Cargar las imágenes de los diferentes tipos de celdas del mapa
        mapa = new BufferedImage[FILAS][COLUMNAS];
        try {
            // Aquí se deben cargar las imágenes desde los archivos correspondientes
            BufferedImage imagen = ImageIO.read(new File("images/hierba.png")); // Ejemplo: Imagen de hierba
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    mapa[i][j] = imagen; // En este ejemplo, se asigna la misma imagen a todas las celdas
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void dibujarMapa(Graphics g) {
        // Dibujar el mapa utilizando las imágenes cargadas
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                g.drawImage(mapa[i][j], j * TAMANO_CELDA, i * TAMANO_CELDA, TAMANO_CELDA, TAMANO_CELDA, null);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MapaPokemon();
        });
    }
}
