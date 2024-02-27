package pokeapi;
public enum Starter {
 
    GENERACION1( "bulbasaur", "charmander", "squirtle"),
    GENERACION2( "chikorita", "cyndaquil", "totodile"),
    GENERACION3( "treecko", "torchic", "mudkip"),
    GENERACION4( "turtwig", "chimchar", "piplup"),
    GENERACION5("snivy", "tepig", "oshawott"),
    GENERACION6( "chespin", "fennekin", "froakie"),
    GENERACION7( "rowlett", "litten", "popplio"),
    GENERACION8("grookey", "scorbunny", "sobble"),
    GENERACION9( "sprigatito", "fuecoco", "quaxly");

    private String nombrePokemonFuego;
    private String nombrePokemonAgua;
    private String nombrePokemonPlanta;

    private  Starter( String nombrePokemonPlanta, String nombrePokemonFuego, String nombrePokemonAgua) {

        this.nombrePokemonFuego = nombrePokemonFuego;
        this.nombrePokemonAgua = nombrePokemonAgua;
        this.nombrePokemonPlanta = nombrePokemonPlanta;
    }

    
    public String getNombrePokemonFuego() {
        return nombrePokemonFuego;
    }

    public String getNombrePokemonAgua() {
        return nombrePokemonAgua;
    }

    public String getNombrePokemonPlanta() {
        return nombrePokemonPlanta;
    }

}
