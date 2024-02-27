package pokeapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class pokemonPrueba {
    public static void main(String[] args) {
        getPikachuInfo();
    }

    public static void getPikachuInfo() {
        try {
            // Obtener información básica de Pikachu
            JSONObject basicInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/pikachu");
            if (basicInfo != null) {
                String name = basicInfo.getString("name");
                int height = basicInfo.getInt("height");
                int weight = basicInfo.getInt("weight");
                JSONArray types = basicInfo.getJSONArray("types");

                System.out.println("Nombre: " + name);
                System.out.println("Altura: " + height);
                System.out.println("Peso: " + weight);
                System.out.print("Tipos: ");
                for (int i = 0; i < types.length(); i++) {
                    JSONObject type = types.getJSONObject(i).getJSONObject("type");
                    System.out.print(type.getString("name") + " ");
                }
                System.out.println();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
