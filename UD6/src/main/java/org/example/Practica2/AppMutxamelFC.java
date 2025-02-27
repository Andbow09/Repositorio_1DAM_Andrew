package org.example.Practica2;

public class AppMutxamelFC {
    public static void main(String[] args) throws MismoDorsal, formacionErronea {
        MutxamelFC jugador1 = new Jugador("Juan",30,Equipos.SENIOR,8,Posiciones.PORTERO);
        MutxamelFC jugador2 = new Jugador("Pedro",34,Equipos.SENIOR,4,Posiciones.CENTROCAMPISTA);
        MutxamelFC jugador3 = new Jugador("Silvia",27,Equipos.SENIOR,7,Posiciones.DELANTERO);

        MutxamelFC entrenador = new Entrenador("Sergio",41,Equipos.SENIOR,"9-3-4");

        MutxamelFC masajista1 = new Masajista("Nerea",39,"Masajista especializada.",10);
        MutxamelFC masajista2 = new Masajista("Mario",25,"Masajista principiante.",2);

        MutxamelFC acompanante1 = new Acompañante("Alberto",33,(Jugador) jugador2,"Pareja");
        MutxamelFC acompanante2 = new Acompañante("María",35,(Jugador) jugador1,"Amiga");

        jugador1.concentrarse();
        jugador2.concentrarse();
        jugador3.concentrarse();
        entrenador.concentrarse();
        masajista1.concentrarse();
        masajista2.concentrarse();
        acompanante1.concentrarse();
        acompanante2.concentrarse();

        ((Jugador) jugador1).entrenar();
        ((Jugador) jugador2).entrenar();
        ((Jugador) jugador3).entrenar();
        ((Entrenador) entrenador).entrenar();

        ((Masajista) masajista2).darMasaje((Jugador) jugador3);

        jugador1.viajar("Madrid");
        jugador2.viajar("Madrid");
        jugador3.viajar("Madrid");
        entrenador.viajar("Madrid");
        masajista1.viajar("Madrid");
        masajista2.viajar("Madrid");

    }
}