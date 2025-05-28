package org.example.ud8.Practica4;

import java.util.ArrayList;

public class Videojuego {
    private String nombre;
    private ArrayList<String> plataformas;
    private double precio;
    private boolean disponible;
    private ArrayList<String> generos;

    public Videojuego() {}

    public Videojuego(String nombre, double precio, boolean disponible) {
        this.nombre = nombre;
        this.plataformas = new ArrayList<>();
        this.precio = precio;
        this.disponible = disponible;
        this.generos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getPlataformas() {
        return plataformas;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public ArrayList<String> getGeneros() {
        return generos;
    }

    public void anadirPlataforma(String plataforma) {
        plataformas.add(plataforma);
    }

    public void anadirGenero(String genero) {
        generos.add(genero);
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "nombre='" + nombre + '\'' +
                ", plataformas=" + plataformas +
                ", precio=" + precio +
                ", disponible=" + disponible +
                ", generos=" + generos +
                '}';
    }
}