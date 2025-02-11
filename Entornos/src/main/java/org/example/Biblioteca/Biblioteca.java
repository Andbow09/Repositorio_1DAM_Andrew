package org.example.Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuariosRegistrados;

    public Biblioteca() {
        this.catalogo = new ArrayList<>();
        this.usuariosRegistrados = new ArrayList<>();
    }

    public List<Libro> getCatalogo() {
        return this.catalogo;
    }

    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    public void buscarLibro(String titulo) {
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(titulo + " ha sido encontrado.");
                return;
            }
        }

        System.out.println(titulo + " no ha sido encontrado.");
    }

    public void mostrarCatalogo() {
        System.out.println(catalogo);
    }
}
