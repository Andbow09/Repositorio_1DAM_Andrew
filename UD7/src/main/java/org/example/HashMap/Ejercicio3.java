package org.example.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String> temperaturas = new HashMap<>();

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        boolean estado = true;

        while(estado) {
            System.out.print("\nElige una opción [insertar, actualizar, consultar, ver todas, salir]: ");
            String opcion = scanner.nextLine();

            switch (opcion.toLowerCase()) {
                case "insertar":
                    System.out.print("Introduce los nuevos datos (Ciudad-Temperatura): ");
                    String ct = scanner.nextLine();

                    String[] array = ct.split("-");
                    String clave = array[0];
                    String valor = array[1];

                    temperaturas.put(clave,valor);

                    break;
                case "actualizar":
                    if (temperaturas.isEmpty()) {
                        System.out.println("El registro de temperaturas está vacío.");
                    } else {
                        System.out.print("Introduce la ciudad a actualizar: ");
                        clave = scanner.nextLine();

                        if (temperaturas.containsKey(clave)) {
                            System.out.print("Introduce la nueva temperatura: ");
                            valor = scanner.next();

                            temperaturas.put(clave,valor);
                        } else {
                            System.out.println("La ciudad a actualizar no existe.");
                        }
                    }

                    break;
                case "consultar":
                    if (temperaturas.isEmpty()) {
                        System.out.println("El registro de temperaturas está vacío.");
                    } else {
                        System.out.print("Introduce la ciudad a consultar: ");
                        clave = scanner.nextLine();

                        if (temperaturas.containsKey(clave)) {
                            System.out.println("Temperatura de " + clave + ": " + temperaturas.get(clave) + "º");
                        } else {
                            System.out.println("La ciudad " + clave + " no tiene temperaturas registradas.");
                        }
                    }

                    break;
                case "ver todas":
                    if (temperaturas.isEmpty()) {
                        System.out.println("El registro de temperaturas está vacío.");
                    } else {
                        System.out.println("Registro de temperaturas:");

                        for (Map.Entry<String,String> temp : temperaturas.entrySet()) {
                            System.out.println(temp.getKey() + ": " + temp.getValue() + "º");
                        }
                    }

                    break;
                case "salir":
                    System.out.println("Saliendo...");
                    estado = false;
                    break;
                default:
                    System.out.println("No existe la opción seleccionada.");

                    break;
            }
        }
    }
}