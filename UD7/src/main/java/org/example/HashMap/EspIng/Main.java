package org.example.HashMap.EspIng;

public class Main {
    public static void main(String[] args) {
        Diccionario diccionario = new Diccionario();

        diccionario.nuevoPar("Verga","Dick");
        diccionario.nuevoPar("Raíz","Root");
        diccionario.nuevoPar("Ordenador","Computer");

        diccionario.palabraAleatoria();
    }
}
