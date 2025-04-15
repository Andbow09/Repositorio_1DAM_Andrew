package org.example.Lambda.Pokemon_otravez;

import java.util.Objects;

public class Ataque {
    private Tipos tipo;
    private String ataque;
    private int potencia;
    private int precision;
    private int pp;
    private String efecto_secundario;

    public Ataque(Tipos tipo, String ataque, int potencia, int precision, int pp, String efecto_secundario) {
        this.tipo = tipo;
        this.ataque = ataque;
        this.potencia = potencia;
        this.precision = precision;
        this.pp = pp;
        this.efecto_secundario = efecto_secundario;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ataque ataque1 = (Ataque) o;
        return Objects.equals(ataque, ataque1.ataque);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ataque);
    }
}