package org.example.biblioteca;

import java.time.LocalDateTime;

public class Libro {
    private String titulo;
    private String autor;
    public static int cont_id = 0;
    private String id;
    private boolean disp;
    private static int lib_cant;
    private static int lib_disp;
    private Estudiante estudiantePrestado;
    private Editorial editorial;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        id = calcularID();
        this.disp = true;
        cont_id++;
        lib_cant++;
        lib_disp++;
        estudiantePrestado = null;

    }

    public String calcularID() {
        return String.format("LIB%03d", cont_id);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void prestar(Estudiante estudiante, Libro libro) {
        if (!disp) {
            System.out.println("El libro ya está prestado a " + estudiantePrestado.getNombre());
        } else if (estudiante.getLibroPrestado() != null) {
            System.out.println("El estudiante ya tiene un libro prestado.");
        } else {
            this.disp = false;
            this.estudiantePrestado = estudiante;
            estudiante.setLibroPrestado(this);
            System.out.println("El libro '" + titulo + "' ha sido prestado a " + estudiante.getNombre());
            Prestamo pres = new Prestamo(estudiante, libro, LocalDateTime.now());
        }
    }

    public void devolver() {
        if (!disp) {
            disp = true;
            System.out.println("El libro '" + getTitulo() + "' ha sido devuelto por " + estudiantePrestado.getNombre());
            lib_disp++;
            estudiantePrestado = null;
        } else {
            System.out.println("El libro '" + getTitulo() + "' ya ha sido devuelto.");
        }
    }

    public boolean estaDisp() {
        return disp;
    }

    public static int getTotalLibros() {
        return lib_cant;
    }

    public static int getLibrosDisponibles() {
        return lib_disp;
    }

    @Override
    public String toString() {
        return "Libro[Titulo: " + titulo + ", Autor: " + autor + ", ID: " + id + ", Disponible: " + disp +"]";
    }
}
