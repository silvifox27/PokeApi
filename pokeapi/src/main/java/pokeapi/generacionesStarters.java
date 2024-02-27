package pokeapi;

import javax.swing.*;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class generacionesStarters {
    public static void mostrarPokemonGeneracion1(JPanel panel_1, JPanel panel_1_1, JPanel panel_1_2) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject bulbasaurInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/bulbasaur");
            JSONObject charmanderInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/charmander");
            JSONObject squirtleInfo = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/squirtle");

            if (bulbasaurInfo != null) {
                String image = bulbasaurInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (charmanderInfo != null) {
                String image = charmanderInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (squirtleInfo != null) {
                String image = squirtleInfo.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }

    public static void mostrarPokemonGeneracion2(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Chikorita = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/chikorita");
            JSONObject Cyndaquil = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/cyndaquil");
            JSONObject Totodile = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/totodile");

            if (Chikorita != null) {
                String image = Chikorita.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Cyndaquil != null) {
                String image = Cyndaquil.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Totodile != null) {
                String image = Totodile.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    public static void mostrarPokemonGeneracion3(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Treecko = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/treecko");
            JSONObject Torchic = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/torchic ");
            JSONObject Mudkip = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/mudkip ");

            if (Treecko != null) {
                String image = Treecko.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Torchic != null) {
                String image = Torchic.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Mudkip != null) {
                String image = Mudkip.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    public static void mostrarPokemonGeneracion4(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Turtwig = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/turtwig");
            JSONObject Chimchar = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/chimchar ");
            JSONObject Piplup = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/piplup ");

            if (Turtwig != null) {
                String image = Turtwig.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Chimchar != null) {
                String image = Chimchar.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Piplup != null) {
                String image = Piplup.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    public static void mostrarPokemonGeneracion5(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Snivy = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/snivy");
            JSONObject Tepig = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/tepig  ");
            JSONObject Oshawott = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/oshawott  ");

            if (Snivy != null) {
                String image = Snivy.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Tepig != null) {
                String image = Tepig.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Oshawott != null) {
                String image = Oshawott.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    public static void mostrarPokemonGeneracion6(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Chespin = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/chespin");
            JSONObject Fennekin = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/fennekin   ");
            JSONObject Froakie = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/froakie   ");

            if (Chespin != null) {
                String image = Chespin.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Fennekin != null) {
                String image = Fennekin.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Froakie != null) {
                String image = Froakie.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    public static void mostrarPokemonGeneracion7(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Rowlet = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/rowlet");
            JSONObject Litten = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/litten");
            JSONObject Popplio = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/popplio");

            if (Rowlet != null) {
                String image = Rowlet.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Litten != null) {
                String image = Litten.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Popplio != null) {
                String image = Popplio.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    public static void mostrarPokemonGeneracion8(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Grookey = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/grookey");
            JSONObject Scorbunny = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/scorbunny");
            JSONObject Sobble = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/sobble");

            if (Grookey != null) {
                String image = Grookey.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Scorbunny != null) {
                String image = Scorbunny.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Sobble != null) {
                String image = Sobble.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    public static void mostrarPokemonGeneracion9(JPanel panel_1_2, JPanel panel_1, JPanel panel_1_1) {
        panel_1_2.removeAll();
        panel_1.removeAll();
        panel_1_1.removeAll();

        try {
            JSONObject Sprigatito = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/sprigatito");
            JSONObject Fuecoco = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/fuecoco ");
            JSONObject Quaxly = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/quaxly");

            if (Sprigatito != null) {
                String image = Sprigatito.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1.add(imageLabel);
            }

            if (Fuecoco != null) {
                String image = Fuecoco.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_1.add(imageLabel);
            }

            if (Quaxly != null) {
                String image = Quaxly.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");

                ImageIcon imageIcon = new ImageIcon(new URL(image));
                JLabel imageLabel = new JLabel(imageIcon);
                panel_1_2.add(imageLabel);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        panel_1_2.revalidate();
        panel_1_2.repaint();
        panel_1.revalidate();
        panel_1.repaint();
        panel_1_1.revalidate();
        panel_1_1.repaint();
    }// fin metodo

    protected static JSONObject getPokemonInfo(String url) throws IOException {
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

    public URL obtenerGifPokemon(String nombrePokemon) {
        try {
            JSONObject pokemon = getPokemonInfo("https://pokeapi.co/api/v2/pokemon/" + nombrePokemon.toLowerCase());
            if (pokemon != null) {
                String gifUrl = pokemon.getJSONObject("sprites").getJSONObject("other").getJSONObject("showdown")
                        .getString("front_default");
                return new URL(gifUrl);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}