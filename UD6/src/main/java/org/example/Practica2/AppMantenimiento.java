package org.example.Practica2;

import static org.example.Practica2.AppMutxamelFC.jugadores;

/**
 * Clase que gestiona los menús de la aplicación de mantenimiento de jugadores, entrenadores, masajistas y equipos.
 */
public class AppMantenimiento {

    /**
     * Muestra el menú principal de la aplicación de mantenimiento.
     */
    public static void menu() {
        // Menú principal con las opciones de mantenimiento
        System.out.println("=== App de Mantenimiento del Mutxamel FC ===");

        // Opción 1: Mantenimiento de jugadores
        System.out.println("\n\t[1]. Mantenimiento de jugadores");
        System.out.println("\t\t\tDentro podremos añadir jugadores, modificar datos y añadir acompañantes (sólo seniors).");

        // Opción 2: Mantenimiento de entrenadores
        System.out.println("\t[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("\t\t\tDentro podremos añadir entrenadores y modificar sus datos.");

        // Opción 3: Mantenimiento de masajistas
        System.out.println("\t[3]. Mantenimiento de masajistas (añadir-modificar-salir).");
        System.out.println("\t\t\tDentro podremos añadir masajistas y modificar sus datos.");

        // Opción 4: Consultar equipos
        System.out.println("\t[4]. Consultar equipos");
        System.out.println("\t\t\tDentro se deben listar los tipos de equipos del club y elegir uno.");

        // Opción para salir
        System.out.println("\t[X]. Salir");
        System.out.println("\n============================================");
    }

    /**
     * Muestra el menú de opciones relacionadas con el mantenimiento de jugadores.
     */
    public static void menuJugadores() {
        // Menú para gestionar jugadores
        System.out.println("=== Mantenimiento de Jugadores ===");

        // Opción 1: Añadir un nuevo jugador
        System.out.println("\n\t[1]. Añadir nuevo jugador");

        // Opción 2: Modificar los datos de un jugador existente
        System.out.println("\t[2]. Modificar datos de jugador existente");

        // Opción 3: Crear acompañantes para jugadores senior
        System.out.println("\t[3]. Crear acompañantes (sólo seniors)");

        // Opción para volver al menú principal
        System.out.println("\t[X]. Volver al menú principal");

        // Separador
        System.out.println("\n==================================");
    }

    /**
     * Muestra el menú para modificar los datos de jugadores existentes.
     */
    public static void menuJugadoresModificar() {
        // Menú para modificar los datos de un jugador
        System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");
        System.out.println("\n¿De qué jugador quieres hacer cambios?");

        // Mostrar la lista de jugadores para elegir
        System.out.println("\n");
        for (Jugador jug : jugadores) {
            // Mostrar los datos de cada jugador con su índice en la lista
            System.out.println("[" + jugadores.indexOf(jug) + ", Nombre: " + jug.getNombre() + ", Edad: " + jug.getEdad() + ", Categoría: " + jug.getCategoria() + ", Dorsal: " + jug.getDorsal() + ", Posicion: " + jug.getPosicion() + "]");
        }

        // Separador
        System.out.println("\n========================================================================");
    }
}