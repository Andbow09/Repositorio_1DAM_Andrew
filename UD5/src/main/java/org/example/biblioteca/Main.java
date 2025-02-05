package org.example.biblioteca;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("nom","1dam","email@gmail.com");
        Libro lib1 = new Libro("libro1","aut");
        Libro lib2 = new Libro("libro2","aut");
        Editorial ed1 = new Editorial("edi","esp");

        lib1.prestar(est1,lib1);
        lib1.prestar(est1,lib1);
        lib2.prestar(est1,lib2);
        System.out.println(lib1.estaDisp());
        lib1.devolver();
        System.out.println(lib1.estaDisp());
        System.out.println(ed1);
        ed1.agregarLibro(lib1);
    }
}
