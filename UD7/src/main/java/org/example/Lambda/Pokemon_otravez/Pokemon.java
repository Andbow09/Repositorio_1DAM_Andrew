package org.example.Lambda.Pokemon_otravez;

public enum Pokemon {
    Bulbasaur(45,49,49,65,65,45),
    Ivysaur(60,62,63,80,80,60),
    Venusaur(80,82,83,100,100,80),
    Charmander(39,52,43,60,50,65),
    Charmeleon(58,64,58,80,65,80),
    Charizard(78,84,78,109,85,100),
    Squirtle(44,48,65,50,64,43),
    Wartortle(59,63,80,65,80,58),
    Blastoise(79,83,100,85,105,78);

    private double ps, ataque, defensa, at_esp, def_esp, velocidad;

    Pokemon(double ps, double ataque, double defensa, double at_esp, double def_esp, double velocidad) {
        this.ps = ps;
        this.ataque = ataque;
        this.defensa = defensa;
        this.at_esp = at_esp;
        this.def_esp = def_esp;
        this.velocidad = velocidad;
    }

    public double getPs() {
        return ps;
    }

    public void setPs(double ps) {
        this.ps = ps;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getAt_esp() {
        return at_esp;
    }

    public void setAt_esp(double at_esp) {
        this.at_esp = at_esp;
    }

    public double getDef_esp() {
        return def_esp;
    }

    public void setDef_esp(double def_esp) {
        this.def_esp = def_esp;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}