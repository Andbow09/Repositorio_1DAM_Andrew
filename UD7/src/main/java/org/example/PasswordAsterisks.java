package org.example;

import java.io.Console;

public class PasswordAsterisks {
    public static void main(String[] args) throws Exception {
        Console console = System.console();
        if (console == null) {
            System.out.println("La consola no está disponible.");
            return;
        }

        System.out.print("Escribe tu contraseña: ");
        StringBuilder password = new StringBuilder();

        // Thread para lectura de caracteres y reemplazo en tiempo real
        Thread passwordThread = new Thread(() -> {
            try {
                while (true) {
                    char ch = (char) System.in.read();
                    if (ch == '\n' || ch == '\r') {
                        break;
                    }
                    password.append(ch);
                    System.out.print("\b*"); // Borra el carácter y muestra '*'
                }
            } catch (Exception e) {
                System.out.println("Error al capturar la contraseña.");
            }
        });

        passwordThread.start();
        passwordThread.join(); // Espera a que el thread termine

        System.out.println("\nContraseña guardada.");
        // La contraseña completa está disponible en 'password'
    }
}