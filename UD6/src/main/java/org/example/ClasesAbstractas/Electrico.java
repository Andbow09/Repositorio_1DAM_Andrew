package org.example.ClasesAbstractas;

public class Electrico extends Pokemon{
    private int ps;

    public Electrico(int nivel, int ps) {
        super(nivel);
        this.ps = ps;
    }

    @Override
    public void atacar() {
        System.out.println("Placaje eléctrico");
    }
}
