package org.example.Lambda.Pokemon_otravez;

public class Combate {
    public static void main(String[] args) {
        Pokedex squirtle = new Pokedex(Pokemon.Squirtle,Tipos.Agua,100,"Serena");
        Pokedex charmander = new Pokedex(Pokemon.Charmander,Tipos.Fuego,100,"Modesta");

        System.out.println(charmander);

//        Ataque pistola_agua = new Ataque(Tipos.Agua,"Pistola Agua",40,100,25,"Ninguno");
//        Ataque rayo = new Ataque(Tipos.Electrico,"Rayo",90,100,15,"10% de paralizar al objetivo");
//
//        squirtle.atacar(pistola_agua,pikachu);
//        pikachu.atacar(rayo,squirtle);
    }
}