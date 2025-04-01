package org.example.Queue;

import java.util.*;

public class Ejer3 {
    public static void main(String[] args) {
        Deque<String> lista = new LinkedList<>();

        lista.offer("This Could Be Heaven - Queen");
        lista.offer("Still Loving You - Scorpions");
        lista.offer("La Isla Bonita - Madonna");
        lista.offer("Parachutes - Coldplay");
        lista.offer("Machines (or 'Back to Humans') - Queen");
        lista.offer("Learn to Fly - Foo Fighters");
        lista.offer("Speed of Sound - Coldplay");
        lista.offer("wonderful life (feat. Dani Filth) - Bring Me The Horizon, Dani Filth");

        System.out.println("Estado inicial de la playlist: " + lista.toString());
        System.out.println("Reproduciendo... " + lista.peek());
        lista.poll();
    }
}
