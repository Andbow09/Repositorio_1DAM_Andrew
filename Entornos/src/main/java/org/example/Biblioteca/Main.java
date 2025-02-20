package org.example.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Libro lib = new Libro("Death Note", "Tsugumi Ohba", 2003);
        Usuario usu = new Usuario("Manuel", 123);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(lib);
        usu.prestarLibro(lib);
        System.out.println(usu.getLibrosPrestados());
        usu.devolverLibro(lib);
        System.out.println(usu.getLibrosPrestados());
    }
}
