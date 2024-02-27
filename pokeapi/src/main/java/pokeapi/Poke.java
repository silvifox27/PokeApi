package pokeapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;


public class Poke {
    int id;
	String nombre;
    int lvl;
    int experiencia;
    int vida;
    char sexo;

	private Random azar = new Random();

    	// constructores
	public Poke() {
        super();
	}

	public Poke(int id, String nombre, int lvl, int vida, char sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.lvl = lvl;
		this.vida = vida;
		this.sexo = sexo;
	}

	public Poke(int id) {
		this.id = id;
	}
	public Poke(String nombre) {
		this.nombre = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public void subirNivel(){
        lvl += 1;
    }

    public void getPokemonInfoByNombre() {
        try {
            // Obtener información básica de un pokemon
            JSONObject basicInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/" + nombre);
            if (basicInfo != null) {
                String name = basicInfo.getString("name");
                int idp = basicInfo.getInt("id");
                int height = basicInfo.getInt("height");
                int weight = basicInfo.getInt("weight");
                JSONArray types = basicInfo.getJSONArray("types");

                setId(idp);
                System.out.println("Nombre: " + name + " Id: " + idp);
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


    public void getPokemonInfoById() {
        try {
            // Obtener información básica de un pokemon
            JSONObject basicInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/" + id);
            if (basicInfo != null) {
                String name = basicInfo.getString("name");
                int idp = basicInfo.getInt("id");
                int height = basicInfo.getInt("height");
                int weight = basicInfo.getInt("weight");
                JSONArray types = basicInfo.getJSONArray("types");

                System.out.println("Nombre: " + name + "Id: " + idp);
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


    public int atacar() {
		
		int ataque = azar.nextInt(11) + 10;
		
		if (esCritico()) {
			System.out.println("¡" + nombre + " ha conseguido un ataque crítico!");
			ataque =  (int)(ataque * 1.5);
		}
		
		System.out.println("Daño conseguido: " + ataque + " puntos");
		return ataque;
	}
	
	public void perderVida(int ataque) {
		vida -= ataque;
	}
	
	private boolean esCritico() {
		int valor = azar.nextInt(100);
		/*
		 * Entre 0 y 100 hay diez valores que son
		 * múltiplos de 10.
		 * Es decir, hay un 10% de posibilidades
		 * de obtener un valor múltiplo de 10.
		 */
		
		return valor%10 == 0;
	}
	
}
