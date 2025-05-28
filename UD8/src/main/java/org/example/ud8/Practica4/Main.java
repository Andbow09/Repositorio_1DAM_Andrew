package org.example.ud8.Practica4;

import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;
import java.io.FileWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Videojuego> listaVideojuegos = new ArrayList<>();

        for (int i = 1; i < 2; i++) {
            System.out.print("Introduce un nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("\nIntroduce un precio: ");
            double precio = scanner.nextDouble();

            System.out.print("\n¿Disponible?: ");
            String disp = scanner.next();

            Videojuego game = null;
            if (disp.equalsIgnoreCase("true")) {
                game = new Videojuego(nombre,precio,true);
            } else if (disp.equalsIgnoreCase("false")) {
                game = new Videojuego(nombre,precio,false);
            }

            boolean state = true;
            do {
                System.out.print("\nAñadir plataforma: ");
                scanner.nextLine();
                String plat = scanner.nextLine();
                game.anadirPlataforma(plat);

                System.out.print("\n¿Quieres añadir una nueva plataforma? (s/n): ");
                String op = scanner.next();
                if (op.equalsIgnoreCase("s")) {
                    state = true;
                } else if (op.equalsIgnoreCase("n")) {
                    state = false;
                }
            } while (state);

            state = true;
            do {
                System.out.print("\nAñadir género: ");
                scanner.nextLine();
                String gen = scanner.nextLine();
                game.anadirGenero(gen);

                System.out.print("\n¿Quieres añadir un nuevo género? (s/n): ");
                String op = scanner.next();
                if (op.equalsIgnoreCase("s")) {
                    state = true;
                } else if (op.equalsIgnoreCase("n")) {
                    state = false;
                }
            } while (state);

            scanner.nextLine();

            listaVideojuegos.add(game);
        }

        Gson gson = new Gson();
        String json = gson.toJson(listaVideojuegos);

        try (FileWriter writer = new FileWriter("src/main/resources/Videojuegos.json")) {
            gson.toJson(listaVideojuegos, writer);
            System.out.println("JSON guardado en Videojuegos.json");
            System.out.println("JSON: " + json);
        } catch (Exception e) {
            System.out.println("Algo salió mal.");
            e.printStackTrace();
        }

        Type tipoListaVideojuegos = new TypeToken<List<Videojuego>>() {}.getType();
        List<Videojuego> listaConvertida = gson.fromJson(json, tipoListaVideojuegos);

        System.out.println(listaConvertida);

        Videojuego game2 = new Videojuego("pacman",3,true);
        game2.anadirPlataforma("arcade");
        game2.anadirGenero("puzles");

        listaConvertida.add(game2);

        for (Videojuego juego : listaConvertida) {
            if (juego.getPrecio() < 30) {
                System.out.println(juego);
            }
        }

        String json2 = gson.toJson(listaConvertida);

        try (FileWriter writer = new FileWriter("src/main/resources/Videojuegos.json")) {
            gson.toJson(listaConvertida, writer);
            System.out.println("JSON guardado en Videojuegos.json");
            System.out.println("JSON: " + json2);
        } catch (Exception e) {
            System.out.println("Algo salió mal.");
            e.printStackTrace();
        }
    }
}