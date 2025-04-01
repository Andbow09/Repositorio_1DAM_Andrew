package org.example.String_Builder;

public class Pruebas {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hola");

        sb.append("qué tal");
        sb.insert(4," soy andy ");
        sb.replace(5,8,"eres");
        sb.delete(0,5);

        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb);
    }
}
