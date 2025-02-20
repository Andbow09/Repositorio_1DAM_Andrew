package org.example;

public class AppVehiculos {
    public static void main(String[] args) {
        Avion avion = new Avion("VEGETA777","7777VGT",3);
        Tren tren = new Tren("Renfe","9150KKE",17);

        avion.imprimirInfo();
        tren.imprimirInfo();
        avion.ruido();
        tren.ruido();
        tren.ruido();
    }
}
