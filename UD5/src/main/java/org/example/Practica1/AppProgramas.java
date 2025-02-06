package org.example.Practica1;

public class AppProgramas {
    public static void main(String[] args) {
        Cadena cad1 = new Cadena("Antena 3");
        System.out.println(cad1);
        System.out.println("");

        Programa prog1 = new Programa("El Hormiguero",cad1,"Director1");
        System.out.println(prog1);
        System.out.println("");

        cad1.agregarPrograma(prog1);
        System.out.println(cad1);
        System.out.println("");

        prog1.agregarEmpleado("Pablo Motos", "Presentador");
        System.out.println(prog1);
        System.out.println("");

        System.out.println(prog1.getListaEmpleados());
        System.out.println("");

        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(0).setFecha_visita();
        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(1).setFecha_visita();
        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(2).setFecha_visita();
        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(3).setFecha_visita();

        System.out.println("");

        System.out.println(prog1.getListaInvitados());
        System.out.println(prog1.invitadosTemporada(3));
        System.out.println(prog1.vecesInvitado("jujalag"));
        prog1.rastrearInvitado("Aitana");
        prog1.rastrearInvitado("jujalag");
        prog1.invitadoAntes("Aitana");
    }
}