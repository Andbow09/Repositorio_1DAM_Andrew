package org.example.ClasesAbstractas;

public class Agua extends Pokemon{
    private int ps;

    public Agua(int nivel, int ps) {
        super(nivel);
        this.ps = ps;
    }

    @Override
    public void atacar() {
        System.out.println("Hidrobomba");
    }
}
