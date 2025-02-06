package org.example.Practica1;

public class AppProgramas {
    public static void main(String[] args) {
        Cadena cad1 = new Cadena("Antena 3"); //creamos una cadena.
        System.out.println(cad1);
        System.out.println("");

        Programa prog1 = new Programa("El Hormiguero",cad1,"Director1"); //Creamos un programa, este programa pertenecerá a la cadena creada anteriormente.
        System.out.println(prog1);
        System.out.println("");

        cad1.agregarPrograma(prog1); //Añadimos el programa creado a la cadena.
        System.out.println(cad1);
        System.out.println("");

        prog1.agregarEmpleado("Pablo Motos", "d"); //Añadimos un empleado con un cargo erróneo para que salte pte como cargo por defecto.
        System.out.println(prog1);
        System.out.println("");

        System.out.println(prog1.getListaEmpleados()); //imprimimos la lista de empleados del programa.
        System.out.println("");

        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(0).setFecha_visita();
        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(1).setFecha_visita();
        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(2).setFecha_visita();
        prog1.agregarInvitado("Aitana", "Cantante", 1);
        prog1.getListaInvitados().get(3).setFecha_visita();
        //agregamos muchas veces el mismo invitado a un programa con diferentes fechas.

        System.out.println("");

        System.out.println(prog1.getListaInvitados()); //Imprimimos la lista de invitados.
        System.out.print("Invitados que han venido en la temporada 3: ");
        System.out.println(prog1.invitadosTemporada(3)); //llamamos a invitados temporada dada la temporada 3.
        System.out.print("Total de veces que ha venido el invitado jujalag: ");
        System.out.println(prog1.vecesInvitado("jujalag")); //llamamos a vecesInvitado dado el invitado jujalag.
        prog1.rastrearInvitado("Aitana");
        prog1.rastrearInvitado("jujalag");
        //llamamos a rastrearInvitado para ver el recorrido tanto de Aitana como de jujalag.
        prog1.invitadoAntes("Aitana");
        //Como antes pasamos muchas fechas, ahora llamaremos a invitado Antes para ver la primera vez que fue al programa.
    }
}