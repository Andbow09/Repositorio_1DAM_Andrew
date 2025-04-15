package org.example.Lambda.Pokemon_otravez;

import java.util.*;

public class Pokedex{
    static Scanner scanner = new Scanner(System.in);

    private Pokemon especie;
    private Tipos tipo1;
    private Tipos tipo2;
    private int nivel;
    private String naturaleza;
    private TreeSet<Ataque> listaAtaques;

    public Pokedex(Pokemon especie, Tipos tipo1, Tipos tipo2, int nivel, String naturaleza) {
        this.especie = especie;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.nivel = nivel;
        this.naturaleza = naturaleza;

        calcularStats(this.naturaleza);
    }

    public Pokedex(Pokemon especie, Tipos tipo1, int nivel, String naturaleza) {
        this.especie = especie;
        this.tipo1 = tipo1;
        this.nivel = nivel;
        this.naturaleza = naturaleza;

        calcularStats(this.naturaleza);
    }

    public Pokemon getEspecie() {
        return especie;
    }

    public void setEspecie(Pokemon especie) {
        this.especie = especie;
    }

    public Tipos getTipo1() {
        return tipo1;
    }

    public void setTipo1(Tipos tipo1) {
        this.tipo1 = tipo1;
    }

    public Tipos getTipo2() {
        return tipo2;
    }

    public void setTipo2(Tipos tipo2) {
        this.tipo2 = tipo2;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public TreeSet<Ataque> getListaAtaques() {
        return listaAtaques;
    }

    public void setListaAtaques(TreeSet<Ataque> listaAtaques) {
        this.listaAtaques = listaAtaques;
    }

    public void calcularStats(String naturaleza) {
        // 1. Calcular todos los stats BASE según fórmula (sin naturaleza)
        double ps = 10 + ((double) getNivel() / 100 * ((getEspecie().getPs() * 2) + 31)) + getNivel();
        double ataque = 5 + ((double) getNivel() / 100 * ((getEspecie().getAtaque() * 2) + 31));
        double defensa = 5 + ((double) getNivel() / 100 * ((getEspecie().getDefensa() * 2) + 31));
        double at_esp = 5 + ((double) getNivel() / 100 * ((getEspecie().getAt_esp() * 2) + 31));
        double def_esp = 5 + ((double) getNivel() / 100 * ((getEspecie().getDef_esp() * 2) + 31));
        double velocidad = 5 + ((double) getNivel() / 100 * ((getEspecie().getVelocidad() * 2) + 31));

        // 2. Aplicar naturaleza (ajuste con multiplicadores)
        switch (naturaleza.toLowerCase()) {
            case "osada": defensa *= 1.1; ataque *= 0.9; break;
            case "modesta": at_esp *= 1.1; ataque *= 0.9; break;
            case "serena": def_esp *= 1.1; ataque *= 0.9; break;
            case "miedosa": velocidad *= 1.1; ataque *= 0.9; break;

            case "huraña": ataque *= 1.1; defensa *= 0.9; break;
            case "afable": at_esp *= 1.1; defensa *= 0.9; break;
            case "amable": def_esp *= 1.1; defensa *= 0.9; break;
            case "activa": velocidad *= 1.1; defensa *= 0.9; break;

            case "firme": ataque *= 1.1; at_esp *= 0.9; break;
            case "agitada": defensa *= 1.1; at_esp *= 0.9; break;
            case "cauta": def_esp *= 1.1; at_esp *= 0.9; break;
            case "alegre": velocidad *= 1.1; at_esp *= 0.9; break;

            case "pícara": ataque *= 1.1; def_esp *= 0.9; break;
            case "floja": defensa *= 1.1; def_esp *= 0.9; break;
            case "alocada": at_esp *= 1.1; def_esp *= 0.9; break;
            case "ingenua": velocidad *= 1.1; def_esp *= 0.9; break;

            case "audaz": ataque *= 1.1; velocidad *= 0.9; break;
            case "plácida": defensa *= 1.1; velocidad *= 0.9; break;
            case "mansa": at_esp *= 1.1; velocidad *= 0.9; break;
            case "grosera": def_esp *= 1.1; velocidad *= 0.9; break;

            // Naturalezas neutras: no aplican cambios
            case "fuerte":
            case "dócil":
            case "tímida":
            case "rara":
            case "seria":
                break;
        }

        // 3. Redondear y setear
        getEspecie().setPs((int) Math.round(ps));
        getEspecie().setAtaque((int) Math.round(ataque));
        getEspecie().setDefensa((int) Math.round(defensa));
        getEspecie().setAt_esp((int) Math.round(at_esp));
        getEspecie().setDef_esp((int) Math.round(def_esp));
        getEspecie().setVelocidad((int) Math.round(velocidad));

    }

    public void agregarAtaque(Ataque ataque) {
        if (listaAtaques.size() != 4) {
            listaAtaques.add(ataque);
            System.out.println("¡" + getEspecie() + " aprendió " + ataque.getAtaque() + "!");
        } else {
            System.out.println(getEspecie() + " ya conoce cuatro movimientos, ¿Quieres sustituir uno de tus movimientos por " + ataque.getAtaque() + "?");
            String opcion = scanner.next();

            if (opcion.equalsIgnoreCase("si")) {
                System.out.println("¿Qué ataque quieres sustituir?");
                for (Ataque atac : listaAtaques) {
                    System.out.println("- " + atac.getAtaque());
                }

                String ataque_quitar = scanner.nextLine();
                quitarAtaque(ataque_quitar);
            } else if (opcion.equalsIgnoreCase("no")) {
                listaAtaques.add(ataque);
                System.out.println("¡" + getEspecie() + " aprendió " + ataque.getAtaque() + "!");
            }
        }
    }

    public void quitarAtaque(String ataque) {

    }

    public void atacar(Ataque ataque, Pokedex pokemon) {
        System.out.println("¡" + getEspecie() + " usó " + ataque.getAtaque() + " contra " + pokemon.getEspecie() + "!");
    }

    @Override
    public String toString() {
        return "Pokemon [" +
                "Especie: " + especie +
                ", Tipo1: " + tipo1 +
                ", Tipo2: " + tipo2 +
                ", Nivel: " + nivel +
                ", Naturaleza: " + naturaleza +
                ", PS: " + especie.getPs() +
                ", Ataque: " + especie.getAtaque() +
                ", Defensa: " + especie.getDefensa() +
                ", At. Especial: " + especie.getAt_esp() +
                ", Def. Especial: " + especie.getDef_esp() +
                ", Velocidad: " + especie.getVelocidad() +
                ']';
    }
}