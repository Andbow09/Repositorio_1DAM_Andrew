package org.example.Lambda.Ejercicio2;

@FunctionalInterface
public interface VerificadorVoto {
    boolean puedeVotar(String nombre, int edad);
}
