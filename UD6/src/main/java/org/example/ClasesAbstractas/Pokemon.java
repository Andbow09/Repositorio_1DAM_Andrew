package org.example.ClasesAbstractas;

abstract class Pokemon {
    private int nivel;

    public Pokemon(int nivel) {
        this.nivel = nivel;
    }

    abstract void atacar();
}
