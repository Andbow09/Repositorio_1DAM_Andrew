package org.example.biblioteca;
import java.time.LocalDateTime;

public class Prestamo {
    private Estudiante estudiante;
    private Libro libro;
    private LocalDateTime fechaPrestamo;

    public Prestamo(Estudiante estudiante, Libro libro, LocalDateTime fechaPrestamo) {
        this.estudiante = estudiante;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
    }
}