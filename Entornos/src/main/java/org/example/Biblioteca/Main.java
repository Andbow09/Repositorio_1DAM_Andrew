package org.example.Biblioteca;

public class Main {
    public static void main(String[] args) {
        Libro lib = new Libro("Death Note","Tsugumi Ohba",2003);
        lib.prestarLibro();
        lib.mostrarInformacion();

        Usuario usu = new Usuario("Manuel",123);
        usu.prestarLibro(lib);

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(lib);
        biblioteca.buscarLibro("Death Note");
        biblioteca.mostrarCatalogo();
    }
}
