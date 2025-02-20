package org.example.Pokemon;

import java.util.Random;

public class Pokemon {
    private String nombre;
    private String tipo;
    private int ps, ataque, defensa, ataqueEspecial, defensaEspecial, velocidad;

    public Pokemon(String nombre, String tipo, int ps, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velocidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ps = ps;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPs() {
        return ps;
    }

    public boolean estaVivo() {
        return ps > 0;
    }

    public void recibirDano(int dano) {
        ps -= dano;
        if (ps < 0) ps = 0;
    }

    public int calcularDano(Movimiento movimiento, Pokemon objetivo) {
        boolean esFisico = movimiento.esFisico();
        int ataqueUsado = esFisico ? ataque : ataqueEspecial;
        int defensaObjetivo = esFisico ? objetivo.defensa : objetivo.defensaEspecial;

        // Cálculo del daño basado en la fórmula de Pokémon
        double stab = movimiento.getTipo().equals(this.tipo) ? 1.2 : 1.0; // STAB 20%
        Random rand = new Random();
        double variacion = (rand.nextDouble() * 0.15) + 0.85; // Variación entre 85% y 100%

        int dano = (int) ((((2 * 50 / 5 + 2) * movimiento.getPotencia() * (ataqueUsado / defensaObjetivo)) / 50 + 2) * stab * variacion);

        return dano;
    }
}