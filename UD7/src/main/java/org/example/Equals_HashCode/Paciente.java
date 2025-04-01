package org.example.Equals_HashCode;

import java.util.Objects;

public class Paciente {
    private String sip;
    private String nombre;
    private String apellidos;

    public Paciente(String sip, String nombre, String apellidos) {
        this.sip = sip;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(sip, paciente.sip) && Objects.equals(nombre, paciente.nombre) && Objects.equals(apellidos, paciente.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sip, nombre, apellidos);
    }

    @Override
    public String toString() {
        return "Paciente [SIP: " + sip + ", Nombre: " + nombre + ", Apellidos: " + apellidos + "]";
    }
}
