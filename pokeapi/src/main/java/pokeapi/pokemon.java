package pokeapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class Pokemon {	
	
	private int id;
    private String name;
    private int level;
    private String url;
    private JSONObject pokemonInfo;
    private String imageUrl;
    private JSONArray types;
    private int max_hp;
    private int cur_hp;
    private int atk;
    private int def;
    private int sp_atk;
    private int sp_def;
    private int speed;


    // Constructor que recibe id y nivel
    public Pokemon(int id, int level) throws IOException {
        this.id = id;
        this.level = level;
        this.url = "https://pokeapi.co/api/v2/pokemon/" + this.id;
        this.pokemonInfo = getPokemonInfo(this.url);
        this.imageUrl = pokemonInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown").getString("front_default");
        this.types = pokemonInfo.getJSONArray("types");
        JSONArray stats = pokemonInfo.getJSONArray("stats");
        this.max_hp = 10 + (this.level / 100 * (stats.getJSONObject(0).getInt("base_stat") * 2)) + this.level;
        this.cur_hp = max_hp;
        this.atk = 5 + (this.level / 100 * (stats.getJSONObject(1).getInt("base_stat") * 2));
        this.def = 5 + (this.level / 100 * (stats.getJSONObject(2).getInt("base_stat") * 2));
        this.sp_atk = 5 + (this.level / 100 * (stats.getJSONObject(3).getInt("base_stat") * 2));
        this.sp_def = 5 + (this.level / 100 * (stats.getJSONObject(4).getInt("base_stat") * 2));
        this.speed = 5 + (this.level / 100 * (stats.getJSONObject(5).getInt("base_stat") * 2));
        
    }

    // Constructor que recibe nombre y nivel
    public Pokemon(String name, int level) throws IOException {
        this.name = name;
        this.level = level;
        this.url = "https://pokeapi.co/api/v2/pokemon/" + this.name;
        this.pokemonInfo = getPokemonInfo(this.url);
        this.imageUrl = pokemonInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown").getString("front_default");
        this.types = pokemonInfo.getJSONArray("types");
        JSONArray stats = pokemonInfo.getJSONArray("stats");
        this.max_hp = 10 + (this.level / 100 * (stats.getJSONObject(0).getInt("base_stat") * 2)) + this.level;
        this.cur_hp = max_hp;
        this.atk = 5 + (this.level / 100 * (stats.getJSONObject(1).getInt("base_stat") * 2));
        this.def = 5 + (this.level / 100 * (stats.getJSONObject(2).getInt("base_stat") * 2));
        this.sp_atk = 5 + (this.level / 100 * (stats.getJSONObject(3).getInt("base_stat") * 2));
        this.sp_def = 5 + (this.level / 100 * (stats.getJSONObject(4).getInt("base_stat") * 2));
        this.speed = 5 + (this.level / 100 * (stats.getJSONObject(5).getInt("base_stat") * 2));

    }
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
    
    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public JSONObject getPokemonInfo() {
		return pokemonInfo;
	}

	public void setPokemonInfo(JSONObject pokemonInfo) {
		this.pokemonInfo = pokemonInfo;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public JSONArray getTypes() {
		return types;
	}

	public void setTypes(JSONArray types) {
		this.types = types;
	}

	public int getMax_hp() {
		return max_hp;
	}

	public void setMax_hp(int max_hp) {
		this.max_hp = max_hp;
	}

	public int getCur_hp() {
		return cur_hp;
	}

	public void setCur_hp(int cur_hp) {
		this.cur_hp = cur_hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSp_atk() {
		return sp_atk;
	}

	public void setSp_atk(int sp_atk) {
		this.sp_atk = sp_atk;
	}

	public int getSp_def() {
		return sp_def;
	}

	public void setSp_def(int sp_def) {
		this.sp_def = sp_def;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
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
