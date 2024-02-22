package pokeapi;

import javax.swing.*;

import org.json.JSONObject;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class generacionesStarters {
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
            // Obtener información básica de los starters
            JSONObject bulbasaurInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/bulbasaur");
            JSONObject charmanderInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/charmander");
            JSONObject squirtleInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/squirtle");

            //bulbasaur
            if (bulbasaurInfo != null) {
                String name = bulbasaurInfo.getString("name");
        
                // Mostrar información del Pokémon en el panel de información
                JLabel nameLabel = new JLabel("Nombre: " + name);
            
                infoPanel.add(nameLabel);
                

                // Obtener la URL de la imagen del Pokémon
                String image = bulbasaurInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown").getString("front_default");

                // Cargar la imagen desde la URL
                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(100,100,600,400);
                imagePanel.add(imageLabel);
            }

            //charmander
            if (charmanderInfo != null) {
                String name = charmanderInfo.getString("name");
        
                // Mostrar información del Pokémon en el panel de información
                JLabel nameLabel = new JLabel("Nombre: " + name);
            
                infoPanel.add(nameLabel);
                
                // Obtener la URL de la imagen del Pokémon
                String image = charmanderInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown").getString("front_default");

                // Cargar la imagen desde la URL
                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                imagePanel.add(imageLabel);
            }

            //squirtle
            if (squirtleInfo != null) {
                String name = squirtleInfo.getString("name");
        
                // Mostrar información del Pokémon en el panel de información
                JLabel nameLabel = new JLabel("Nombre: " + name);
            
                infoPanel.add(nameLabel);
                

                // Obtener la URL de la imagen del Pokémon
                String image = squirtleInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown").getString("front_default");

                // Cargar la imagen desde la URL
                ImageIcon imageIcon = new ImageIcon(new URL(image));
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
