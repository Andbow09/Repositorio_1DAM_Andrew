package org.example.Herencia1;

public class Artista extends Persona{
    private String genero;

    public Artista(String nombre, int edad, String genero) {
        super(nombre, edad);
        this.genero = genero;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Género musical: " + genero);
    }

    @Override
    public void accederEvento() {
        System.out.println("Accediendo como Artista: Preparando el show...");
    }
}
