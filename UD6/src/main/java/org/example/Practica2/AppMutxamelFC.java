package org.example.Practica2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa la aplicación principal para gestionar el equipo Mutxamel FC.
 * Permite gestionar jugadores, entrenadores, masajistas, acompañantes y más.
 */
public class AppMutxamelFC {
    static ArrayList<Jugador> jugadores = new ArrayList<>(); // Lista de jugadores del equipo.

    /**
     * Método principal que ejecuta la aplicación, permite gestionar varias opciones
     * a través de un menú interactivo.
     * @param args Argumentos de la línea de comandos (no utilizados).
     * @throws MismoDorsal Si se intenta asignar un dorsal que ya está en uso.
     * @throws formacionErronea Si la formación del entrenador no es válida.
     */
    public static void main(String[] args) throws MismoDorsal, formacionErronea {
        Scanner scanner = new Scanner(System.in);

        // Crear algunos jugadores iniciales y agregarlos a la lista
        Jugador jugador1 = new Jugador("Juan", 30, Equipos.SENIOR, 8, Posiciones.PORTERO);
        jugadores.add(jugador1);
        Jugador jugador2 = new Jugador("Pedro", 34, Equipos.SENIOR, 4, Posiciones.CENTROCAMPISTA);
        jugadores.add(jugador2);
        Jugador jugador3 = new Jugador("Silvia", 27, Equipos.SENIOR, 7, Posiciones.DELANTERO);
        jugadores.add(jugador3);
        Jugador jugador4 = new Jugador("Matias", 25, Equipos.JUVENIL, 1, Posiciones.DEFENSA);
        jugadores.add(jugador4);

        // Crear el entrenador con su formación preferida
        Entrenador entrenador = new Entrenador("Sergio", 41, Equipos.SENIOR, "9-3-4");

        // Crear algunos masajistas
        Masajista masajista1 = new Masajista("Nerea", 39, "Masajista especializada.", 10);
        Masajista masajista2 = new Masajista("Mario", 25, "Masajista principiante.", 2);

        // Crear algunos acompañantes
        Acompañante acompanante1 = new Acompañante("Alberto", 33, (Jugador) jugador2, "Pareja");
        Acompañante acompanante2 = new Acompañante("María", 35, (Jugador) jugador1, "Amiga");

        jugador1.concentrarse();
        jugador2.concentrarse();
        jugador3.concentrarse();
        entrenador.concentrarse();
        masajista1.concentrarse();
        masajista2.concentrarse();
        acompanante1.concentrarse();
        acompanante2.concentrarse();

        jugador1.entrenar();
        jugador2.entrenar();
        jugador3.entrenar();
        entrenador.entrenar();

        masajista2.darMasaje(jugador3);

        jugador1.viajar("Madrid");
        jugador2.viajar("Madrid");
        jugador3.viajar("Madrid");
        entrenador.viajar("Madrid");
        masajista1.viajar("Madrid");
        masajista2.viajar("Madrid");

        // Bucle principal de la aplicación donde se muestran opciones al usuario
        while (true) {
            AppMantenimiento.menu(); // Mostrar el menú principal
            System.out.print("\nSelecciona una opción --> ");
            String opcion = scanner.next();

            switch (opcion.toLowerCase()) {
                case "1":
                    boolean salir = false;
                    // Bucle para gestionar el mantenimiento de jugadores
                    while (!salir) {
                        AppMantenimiento.menuJugadores(); // Mostrar el submenú de jugadores
                        System.out.print("\nSelecciona una opción --> ");
                        String opcion2 = scanner.next();

                        switch (opcion2) {
                            case "1":
                                System.out.println("\n=== Mantenimiento de Jugadores. Añadir un nuevo jugador ===");
                                // Solicitar datos para añadir un nuevo jugador
                                System.out.print("\nAñade un nombre: ");
                                String nombre = scanner.next();

                                System.out.print("Añade una edad: ");
                                int edad = scanner.nextInt();

                                System.out.print("Añade una categoría: ");
                                String categoria = scanner.next();

                                System.out.print("Añade un dorsal: ");
                                int dorsal = scanner.nextInt();

                                System.out.print("Añade una posición: ");
                                String posicion = scanner.next();

                                // Crear y añadir un nuevo jugador a la lista
                                Jugador jugador = new Jugador(nombre, edad, Equipos.valueOf(categoria.toUpperCase()), dorsal, Posiciones.valueOf(posicion.toUpperCase()));
                                jugadores.add(jugador);
                                System.out.println("\nJugador creado: [Nombre: " + jugador.getNombre() + ", Edad: " + jugador.getEdad() + ", Categoría: " + jugador.getCategoria() + ", Dorsal: " + jugador.getDorsal() + ", Posicion: " + jugador.getPosicion() + "]");
                                System.out.println("\n===========================================================");
                                break;
                            case "2":
                                AppMantenimiento.menuJugadoresModificar(); // Mostrar el submenú para modificar jugadores
                                System.out.print("\nSelecciona una opción --> ");
                                int opcion3 = scanner.nextInt();

                                System.out.println("=== Mantenimiento de Jugadores. Modificar datos de jugador existente ===");
                                // Buscar el jugador a modificar
                                for (Jugador jug : jugadores) {
                                    if (jugadores.indexOf(jug) == opcion3) {
                                        System.out.println("\nModificando jugador: Nombre: " + jug.getNombre() + ", Edad: " + jug.getEdad() + ", Categoría: " + jug.getCategoria() + ", Dorsal: " + jug.getDorsal() + ", Posicion: " + jug.getPosicion() + "]");
                                        System.out.println("\n¿Qué quieres modificar? [Nombre, Edad, Categoría, Dorsal, Posicion]");
                                        System.out.println("\n========================================================================");

                                        // Modificar los datos del jugador
                                        System.out.print("\nSelecciona una opción --> ");
                                        String opcion4 = scanner.next();

                                        switch (opcion4.toLowerCase()) {
                                            case "nombre":
                                                System.out.print("Introduce un nuevo nombre: ");
                                                nombre = scanner.next();
                                                jug.setNombre(nombre);
                                                break;

                                            case "edad":
                                                System.out.print("\nIntroduce una nueva edad: ");
                                                edad = scanner.nextInt();
                                                jug.setEdad(edad);
                                                break;

                                            case "categoria":
                                                System.out.print("\nIntroduce una nueva categoría: ");
                                                categoria = scanner.next();
                                                jug.setCategoria(categoria);
                                                break;

                                            case "dorsal":
                                                System.out.println("\nIntroduce un nuevo dorsal: ");
                                                dorsal = scanner.nextInt();

                                                try {
                                                    jug.setDorsal(dorsal);
                                                } catch (MismoDorsal err) {
                                                    err.getMessage();
                                                }
                                                break;
                                            case "posicion":
                                                System.out.println("Introduce una nueva posición:");
                                                posicion = scanner.next();
                                                jug.setPosicion(posicion);
                                                break;
                                            default:
                                                System.out.println("Opción no disponible.");
                                                break;
                                        }
                                    }
                                }
                                break;
                            case "3":
                                System.out.println("=== Mantenimiento de Jugadores. Añade acompañantes para jugadores SENIOR ===");
                                // Solicitar datos para añadir un acompañante
                                System.out.print("\nAñade un nombre: ");
                                nombre = scanner.next();

                                System.out.print("Añade una edad: ");
                                edad = scanner.nextInt();

                                System.out.print("Añade un integrante: ");
                                String integrante = scanner.next();

                                System.out.print("Añade un parentesco: ");
                                String parentesco = scanner.next();

                                // Crear y asociar acompañante a un jugador
                                for (Jugador jug : jugadores) {
                                    if (jug.getNombre().equals(integrante) && jug.getCategoria().equals(Equipos.valueOf("SENIOR"))) {
                                        Acompañante acompanante = new Acompañante(nombre, edad, jug, parentesco);
                                        System.out.println("\nAcompañante creado: [Nombre: " + acompanante.getNombre() + ", Edad: " + acompanante.getEdad() + ", Integrante: " + jug.getNombre() + ", Parentesco: " + acompanante.getParentesco() + "]");
                                    }
                                }

                                System.out.println("\n===========================================================");
                                break;
                            case "x":
                                System.out.println("Saliendo al menú principal...");
                                salir = true;
                                continue;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    }
                    break;

                //Si se escogen el resto de opciones, estas no estarán disponibles
                case "2", "3", "4":
                    System.out.println("Próximamente:");
                    break;
                case "x":
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}