package org.example.Biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList getLibrosPrestados() {
        return this.librosPrestados;
    }

    public void prestarLibro(Libro libro) {
        if (!libro.getDisponible()) {
            System.out.println("No se ha prestado el libro a " + getNombre() + " porque " + libro.getTitulo() + " no está disponible.");
        } else {
            librosPrestados.add(libro);
            System.out.println(libro.getTitulo() + " prestado a " + getNombre() + ".");
        }
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
        libro.setDisponible(true);
        System.out.println(libro.getTitulo() + " devuelto por " + getNombre() + ".");
    }
}
