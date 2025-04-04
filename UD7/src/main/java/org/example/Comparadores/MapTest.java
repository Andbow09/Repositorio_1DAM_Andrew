//package org.example.Comparadores;
//
//import java.util.*;
//
//public class MapTest {
//    public static void main(String[] args) {
//        Map<Integer,String> mapa = new HashMap<>();
//        mapa.put(1,"a");
//        mapa.put(2,"b");
//        mapa.put(3,"c");
//
//        List<Map.Entry<Integer,String>> listaMapa = new ArrayList<>(mapa.entrySet());
//        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
//
//        for (Map.Entry<Integer,String> mapa2 : listaMapa) {
//            System.out.println("dni: " + mapa2.getKey() + ", nombre: " + mapa2.getValue());
//        }
//    }
//}
