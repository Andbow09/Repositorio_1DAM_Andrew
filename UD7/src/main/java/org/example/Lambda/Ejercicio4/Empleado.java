package org.example.Lambda.Ejercicio4;

import java.time.LocalDate;

public class Empleado {
    private String nombre;
    private double salario;
    private LocalDate fecha_contrato;

    public Empleado(String nombre, double salario, LocalDate fecha_contrato) {
        this.nombre = nombre;
        this.salario = salario;
        this.fecha_contrato = fecha_contrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(LocalDate fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }
}
