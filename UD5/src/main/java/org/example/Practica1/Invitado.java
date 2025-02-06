package org.example.Practica1;
import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {
    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = LocalDate.now();
        this.temporada = temporada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita() {
        System.out.println("Introduce el año en el que acudirá el invitado " + getNombre() + ":");
        int anyo = scanner.nextInt();
        System.out.println("Introduce el mes:");
        int mes = scanner.nextInt();
        System.out.println("Introduce el día:");
        int dia = scanner.nextInt();
        LocalDate fecha = LocalDate.of(anyo, mes, dia);
        this.fecha_visita = fecha;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado [Nombre: " + nombre + ", Profesion: " + profesion + ", Fecha de Visita: " + fecha_visita + ", Temporada: " + temporada + "]";
    }
}
