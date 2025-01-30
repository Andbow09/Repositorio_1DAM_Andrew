package org.example.biblioteca;

import java.util.ArrayList;

public class Estudiante {
    public static int cont_est = 0;
    public static final String email_form = "^[A-Za-z09+_.-]@gmail.com";
    private String nombre;
    private String curso;
    private int nia;
    private String email;
    private ArrayList<Libro> librosPrestados;

//    public Estudiante estudiantePrestado() {
//
//    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
        cont_est++;
        this.nia = cont_est;
        librosPrestados = new ArrayList<>();
    }

    public Estudiante(String nombre, String curso, String email) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        cont_est++;
        this.nia = cont_est;
        librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurso() {
        return curso;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void anadirLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    @Override
    public String toString() {
        if (!librosPrestados.isEmpty()) {
            return "Estudiante[Nombre: " + nombre + ", Curso: " + curso + ", NIA: " + nia + ", Email:" + email + ", Libro prestado: " + librosPrestados + "]";
        } else {
            return "Estudiante[Nombre: " + nombre + ", Curso: " + curso + ", NIA: " + nia + ", Email:" + email + "]";
        }
    }

    public static int obtTotalEst() {
        return cont_est;
    }

    public static boolean form_val(String email) {
        return email.matches(email_form) && email != null;
    }
}
