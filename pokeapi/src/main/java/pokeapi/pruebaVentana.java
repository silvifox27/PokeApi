package pokeapi;

import javax.swing.*;

import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class pruebaVentana {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pokemon Info");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un panel para mostrar la imagen
        JPanel imagePanel = new JPanel();
        frame.getContentPane().add(imagePanel, BorderLayout.NORTH);

        // Crear un panel para mostrar la información del Pokémon
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        frame.getContentPane().add(infoPanel, BorderLayout.CENTER);

        try {
            // Obtener información básica de Pikachu
            JSONObject basicInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/pikachu");
            if (basicInfo != null) {
                String name = basicInfo.getString("name");
                int height = basicInfo.getInt("height");
                int weight = basicInfo.getInt("weight");
                JSONArray types = basicInfo.getJSONArray("types");

                // Mostrar información del Pokémon en el panel de información
                JLabel nameLabel = new JLabel("Nombre: " + name);
                JLabel heightLabel = new JLabel("Altura: " + height);
                JLabel weightLabel = new JLabel("Peso: " + weight);
                JLabel typesLabel = new JLabel("Tipos: ");
                StringBuilder typesText = new StringBuilder();
                for (int i = 0; i < types.length(); i++) {
                    JSONObject type = types.getJSONObject(i).getJSONObject("type");
                    typesText.append(type.getString("name")).append(" ");
                }
                typesLabel.setText(typesText.toString());

                infoPanel.add(nameLabel);
                infoPanel.add(heightLabel);
                infoPanel.add(weightLabel);
                infoPanel.add(typesLabel);

                // Obtener la URL de la imagen del Pokémon
                String imageUrl = basicInfo.getJSONObject("sprites").getString("front_default");

                // Cargar la imagen desde la URL
                ImageIcon imageIcon = new ImageIcon(new URL(imageUrl));
                JLabel imageLabel = new JLabel(imageIcon);
                imagePanel.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        frame.pack();
        frame.setVisible(true);
    }

    private static JSONObject getPokemonInfo(String url) throws IOException {
        HttpURLConnection connection = null;
        try {
            URL apiUrl = new URL(url);
            connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");

            StringBuilder response = new StringBuilder();
            try (BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                while ((inputLine = inputReader.readLine()) != null) {
                    response.append(inputLine);
                }
            }
            return new JSONObject(response.toString());
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
