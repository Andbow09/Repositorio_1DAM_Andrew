package org.example;
import java.util.Scanner;

public class Practica1 {
    public void practica1() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa)");
        String fecha = entrada.next();
        int fechalongi = fecha.length();

        String dia = fecha.substring(0,2);
        if (dia.contains("/")){
            System.out.println("El día debe tener 2 dígitos");
            System.exit(0);
        }
        String mes = fecha.substring(3,5);
        if (mes.contains("/")){
            System.out.println("El mes debe tener 2 dígitos");
            System.exit(0);
        }
        String anyo = fecha.substring(6,fechalongi);
        int longi = anyo.length();
        if ( longi < 4 ){
            System.out.println("El año debe tener 4 dígitos");
            System.exit(0);
        }

        int dia_1 = 0;
        int mes_1 = 0;
        int anyo_1 = 0;
        try {
            dia_1 = Integer.parseInt(dia);
            mes_1 = Integer.parseInt(mes);
            anyo_1 = Integer.parseInt(anyo);
        }catch(NumberFormatException err){
            System.out.println("Introduce variables numéricas");
            System.exit(0);
        }

        if(dia_1 > 31 || dia_1 <=0 || mes_1 > 12 || mes_1 <=0 || anyo_1 <= 1900 || anyo_1 > 2024){
            System.out.println("Introduce una fecha coherente");
            System.exit(0);
        }

        int primero = dia_1 + mes_1 + anyo_1;
        System.out.println(dia_1 + "+" + mes_1 + "+" + anyo_1 + " = " + primero);

        String primeroS = Integer.toString(anyo_1);
        String primeroS1 = primeroS.substring(0,1);
        String primeroS2 = primeroS.substring(1,2);
        String primeroS3 = primeroS.substring(2,3);
        String primeroS4 = primeroS.substring(3,4);

        int primero1 = Integer.parseInt(primeroS1);
        int primero2 = Integer.parseInt(primeroS2);
        int primero3 = Integer.parseInt(primeroS3);
        int primero4 = Integer.parseInt(primeroS4);

        int suerte = primero1 + primero2 + primero3 + primero4;
        System.out.println(primero1 + "+" + primero2 + "+" + primero3 + "+" + primero4 + " = " + suerte);
        System.out.println("Tu número de la suerte es el " + suerte);
    }
}