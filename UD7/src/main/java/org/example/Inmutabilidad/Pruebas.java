package org.example.Inmutabilidad;

import java.util.List;

public class Pruebas {
    public static void main(String[] args) {
        Juego pokemon = new Juego("Pokémon Plata",50);

        List<String> listaPokemon = pokemon.getListaPersonajes();
        System.out.println(pokemon.getListaPersonajes());
    }
}
