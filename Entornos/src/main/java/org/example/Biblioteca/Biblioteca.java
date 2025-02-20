package org.example.Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Biblioteca, gestiona el catálogo de libros y los usuarios registrados.
 * @author Andrew
 * @version 1.0
 */
public class Biblioteca {
    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuariosRegistrados;

    /**
     * Constructor de la clase Biblioteca, inicializa el catálogo de libros y los usuarios registrados.
     * @since 1.0
     */
    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    /**
     * Metodo que devuelve el catálogo de libros de la biblioteca.
     * @return catalogo
     * @since 1.0
     */
    public ArrayList<Libro> getCatalogo() {
        return this.catalogo;
    }

    /**
     * Metodo que agrega un libro al catálogo de la biblioteca.
     * @param libro (objeto de clase Libro)
     * @since 1.0
     */
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    /**
     * Metodo que registra un usuario en la biblioteca.
     * @param usuario (objeto de clase Usuario)
     * @since 1.0
     */
    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    /**
     * Metodo que busca un libro en el catálogo por su título.
     * @param titulo (título del libro a buscar)
     * @since 1.0
     */
    public void buscarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(titulo + " ha sido encontrado.");
                return;
            }
        }
        System.out.println(titulo + " no ha sido encontrado.");
    }

    /**
     * Metodo que muestra el catálogo de la biblioteca.
     * @since 1.0
     */
    public void mostrarCatalogo() {
        System.out.println(catalogo);
    }
}