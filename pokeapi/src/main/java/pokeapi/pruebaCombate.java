package pokeapi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class pruebaCombate extends JFrame {
    private JComboBox<String> pokemon1ComboBox;
    private JComboBox<String> pokemon2ComboBox;
    private JButton startButton;
    private JTextArea resultTextArea;

    private static final String API_BASE_URL = "https://pokeapi.co/api/v2/";
    private static final String POKEMON_ENDPOINT = "pokemon/";

    public pruebaCombate() {
        setTitle("Pokemon Combat");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 1));

        pokemon1ComboBox = new JComboBox<>();
        pokemon2ComboBox = new JComboBox<>();
        startButton = new JButton("Start Combat");
        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);

        mainPanel.add(new JLabel("Select Pokemon 1:"));
        mainPanel.add(pokemon1ComboBox);
        mainPanel.add(new JLabel("Select Pokemon 2:"));
        mainPanel.add(pokemon2ComboBox);
        mainPanel.add(startButton);
        mainPanel.add(resultTextArea);

        add(mainPanel);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startCombat();
            }
        });

        loadPokemonNames();
    }

    private void loadPokemonNames() {
        try {
            URL url = new URL(API_BASE_URL + POKEMON_ENDPOINT);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(5000);
            con.setReadTimeout(5000);

            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            StringBuilder response = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            JSONObject jsonObject = new JSONObject(response.toString());
            JSONArray results = jsonObject.getJSONArray("results");
            for (int i = 0; i < results.length(); i++) {
                JSONObject pokemon = results.getJSONObject(i);
                String name = pokemon.getString("name");
                pokemon1ComboBox.addItem(name);
                pokemon2ComboBox.addItem(name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startCombat() {
        String pokemon1 = (String) pokemon1ComboBox.getSelectedItem();
        String pokemon2 = (String) pokemon2ComboBox.getSelectedItem();
        // Aquí puedes implementar la lógica de combate utilizando la PokeAPI
        resultTextArea.setText("Combate entre " + pokemon1 + " y " + pokemon2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new pruebaCombate().setVisible(true);
            }
        });
    }
}
