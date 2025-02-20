package org.example.Biblioteca;

import java.util.ArrayList;

/**
 * Clase Usuario, tiene un nombre, un id y una lista de libros prestados al usuario.
 * @author Andrew
 * @version 1.0
 * @see Libro
 */
public class Usuario {
    private String nombre;
    private int idUsuario;
    private ArrayList<Libro> librosPrestados;

    /**
     * Constructor de la clase Usuario donde se define un nombre y un id.
     * @param nombre
     * @param idUsuario
     * @since 1.0
     */
    public Usuario(String nombre, int idUsuario) {
        this.nombre = nombre;
        this.idUsuario = idUsuario;
        this.librosPrestados = new ArrayList<>();
    }

    /**
     * Metodo que devuelve el nombre del usuario.
     * @return nombre.
     * @since 1.0
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Metodo que devuelve la lista de libros prestados al usuario.
     * @return librosPrestados
     * @deprecated este metodo se actualizará o borrará más adelante.
     */
    public ArrayList<Libro> getLibrosPrestados() {
        return this.librosPrestados;
    }

    /**
     * Metodo que presta un libro a un usuario (lo añade a la lista) dadas las circunstancias.
     * @param libro (objeto de clase libro)
     * @since 1.0
     */
    public void prestarLibro(Libro libro) {
        if (!libro.getDisponible()) {
            System.out.println("No se ha prestado el libro a " + getNombre() + " porque " + libro.getTitulo() + " no está disponible.");
            // Si el libro no está disponible, no se añadirá a la lista pesto que ya ha sido prestado.
        } else {
            libro.prestarLibro();
            librosPrestados.add(libro);
            System.out.println(libro.getTitulo() + " prestado a " + getNombre() + ".");
            // Si no es así, el libro se añadirá a la lista y se asignará el libro como no disponible.
        }
    }

    /**
     * Metodo que devuelve un libro por parte de un usuario (lo quita de la lista)
     * @param libro (objeto de clase Libro)
     * @since 1.0
     */
    public void devolverLibro(Libro libro) {
        if (!librosPrestados.contains(libro)) {
            System.out.println("No se ha devuelto el libro por " + getNombre() + " porque " + libro.getTitulo() + " está disponible.");
            // Si la lista de libros no contiene el libro a devolver, no se devolverá.
        } else {
            libro.devolverLibro();
            librosPrestados.remove(libro);
            System.out.println(libro.getTitulo() + " devuelto por " + getNombre() + ".");
            // Si no es así, el libro se quitará de la lista de libros prestados y se asignará el libro como disponible.
        }
    }
}
