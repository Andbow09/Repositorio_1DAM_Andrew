package org.example.Funcionario;

import java.util.Objects;

public class Informe {
    private int codigo;
    private String descripcion;
    private TIPO tipo;

    public Informe(int codigo, String descripcion, TIPO tipo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public TIPO getTipo() {
        return this.tipo;
    }

    public void setTipo(TIPO tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Informe informe = (Informe) o;
        return codigo == informe.codigo && tipo == informe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, tipo);
    }

    @Override
    public String toString() {
        return "Informe {Codigo: " + codigo + ", Descripcion: " + descripcion + ", Tipo: " + tipo + "}";
    }
}
