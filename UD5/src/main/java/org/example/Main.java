package org.example;

import org.example.equipos.Equipo;
import org.example.equipos.Persona;

public class Main {
    public static void main(String[] args) {

//        Persona persona1 = new Persona("momero", "chino", "12345678G", "100KG", 19, "papulandia", "horneador de momos");
//        Persona persona2 = new Persona();
//
//        persona1.imprimir();
//        persona2.imprimir();
//        System.out.println(" ");
//
//        System.out.println(persona1.concat());
//        System.out.println(" ");
//
//        System.out.println("antes: " + persona1.getNombre());
//        persona1.setNombre("messo");
//        System.out.println("despues: " + persona1.getNombre());

//        Televisor tv = new Televisor();
//        tv.setVolumen(4);
//        System.out.println("Volumen: " + tv.getVolumen());
//        tv.subirCanal();
//        System.out.println("Canal: " + tv.getCanal());

//        Estudiante est1 = new Estudiante("Andrew");
//        Estudiante est2 = new Estudiante("Andrew","1 DAM","andrew@mail.com");
//
//        System.out.println(est1);
//        System.out.println(est2);

//        Libro lib1 = new Libro("libro1","andy");
//        Libro lib2 = new Libro("libro2","andy");
//        Libro lib3 = new Libro("libro3","andy");
//        Libro lib4 = new Libro("libro4","andy");
//
//        System.out.println(lib1);
//        System.out.println(lib2);
//        System.out.println(lib3);
//        System.out.println(lib4);
//        System.out.println("Total de libros creados: " + lib1.getTotalLibros());
//        System.out.println("Total de libros disponibles: " + lib1.getLibrosDisponibles());
//        lib1.prestar();
//        lib2.prestar();
//        System.out.println("Total de libros disponibles tras prestación: " + lib1.getLibrosDisponibles());
//        lib1.prestar();
//        lib1.devolver();
//        System.out.println("Total de libros disponibles tras devolución: " + lib1.getLibrosDisponibles());
//        lib1.devolver();

        Persona per1 = new Persona("nombre", "apellido", "123456789G","80Kg", 30, "ciudad", "profesion");
        Equipo eq1 = new Equipo("equipo");
        System.out.println(eq1);


    }
}