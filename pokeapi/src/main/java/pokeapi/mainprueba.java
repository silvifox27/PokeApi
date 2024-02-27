package pokeapi;
public class mainprueba {
    
    public static void main(String[] args) {

        Poke pokemon1 = new Poke("bulbasaur");
        Poke pokemon2 = new Poke("celebi");

        pokemon1.getPokemonInfoByNombre();
        pokemon2.getPokemonInfoByNombre();

        pokemon1.getPokemonInfoById();


        Starter[] continentes = Starter.values();
        for (int i = 0; i < continentes.length; i++) {
            System.out.println(continentes[i].getNombrePokemonAgua());
            System.out.println(continentes[i].getNombrePokemonFuego());
            System.out.println(continentes[i].getNombrePokemonPlanta());
        }
    }
}
