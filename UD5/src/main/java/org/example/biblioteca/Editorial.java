package org.example.biblioteca;

import java.util.ArrayList;

public class Editorial {
    private String nombre;
    private String pais;
    private ArrayList<Libro> listaLibros;
    private Libro libro;

    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        listaLibros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Editorial [Nombre: " + nombre + ", Pais: " + pais + ", Lista de Libros: " + listaLibros + "]";
    }
}
