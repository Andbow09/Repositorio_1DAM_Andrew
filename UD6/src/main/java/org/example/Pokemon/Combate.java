package org.example.Pokemon;

import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {
        // Crear Pokémon
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 100, 55, 40, 50, 50, 90);
        Pokemon charmander = new Pokemon("Charmander", "Fuego", 100, 52, 43, 60, 50, 65);

        // Crear Movimientos
        Movimiento impactrueno = new Movimiento("Impactrueno", "Eléctrico", 40, false);
        Movimiento ascuas = new Movimiento("Ascuas", "Fuego", 40, false);

        Scanner scanner = new Scanner(System.in);

        // Turnos
        while (pikachu.estaVivo() && charmander.estaVivo()) {
            System.out.println("\nTurno de Pikachu");
            int dano = pikachu.calcularDano(impactrueno, charmander);
            charmander.recibirDano(dano);
            System.out.println("Pikachu usó " + impactrueno.getNombre() + " e hizo " + dano + " de daño.");
            System.out.println("Charmander tiene " + charmander.getPs() + " PS restantes.");

            if (!charmander.estaVivo()) {
                System.out.println("¡Charmander ha sido derrotado!");
                break;
            }

            System.out.println("\nTurno de Charmander");
            dano = charmander.calcularDano(ascuas, pikachu);
            pikachu.recibirDano(dano);
            System.out.println("Charmander usó " + ascuas.getNombre() + " e hizo " + dano + " de daño.");
            System.out.println("Pikachu tiene " + pikachu.getPs() + " PS restantes.");

            if (!pikachu.estaVivo()) {
                System.out.println("¡Pikachu ha sido derrotado!");
            }
        }

        scanner.close();
    }
}

