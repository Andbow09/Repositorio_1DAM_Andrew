package org.example.Interfaces;

import java.util.ArrayList;

public class AppDispositivos {
    public static void main(String[] args) {
        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

        Televisor tv = new Televisor("LG");
        ParlanteInteligente pi = new ParlanteInteligente("BOSE");
        AireAcondicionado aa = new AireAcondicionado("FUJITSU");

        listaDispositivos.add(tv);
        listaDispositivos.add(pi);
        listaDispositivos.add(aa);

        Dispositivo proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (!isEstado()) {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    setEstado(true);
                } else {
                    System.out.println("El proyector ya está encendido");
                }
            }
        };

        ControlRemoto controlProyector = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        Dispositivo hornoInteligente = new Dispositivo("balay") {
            @Override
            public void encender() {
                if (!isEstado()) {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                } else {
                    System.out.println("El horno inteligente ya está encendido.");
                }
            }
        };

        listaDispositivos.add(proyector);
        listaDispositivos.add(hornoInteligente);

        for (Dispositivo disp : listaDispositivos) {
            disp.encender();

            if (disp instanceof ControlRemoto) {
                ((ControlRemoto) disp).sincronizar();
            }

            if (proyector.getNombre().equalsIgnoreCase("optoma")) {
                controlProyector.sincronizar();
            }

            disp.isEstado();
            disp.apagar();
        }
    }
}
