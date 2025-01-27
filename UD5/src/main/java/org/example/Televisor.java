package org.example;

public class Televisor {
    private int canal;
    private int volumen;
    public Televisor() {

    }

    public Televisor(int canal, int volumen) {
        this.canal = 1;
        this.volumen = 5;
    }

    public void subirCanal() {
        int canal = this.canal;
        canal+=1;
    }

    public void bajarCanal() {
        int canal = this.canal-1;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
}
