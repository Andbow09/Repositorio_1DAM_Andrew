package org.example;
import javax.xml.transform.Source;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Act_hasNextInt {
    public void nextint(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige un modo (1 o 2):");
        String modo = entrada.next();

        LocalDateTime hoy = LocalDateTime.now();
        int anyo_actual = hoy.getYear();
        int anyo = 0;

        if (modo.equals("1")) {
            System.out.println("Dime tu año de nacimiento");
            String anyo1 = entrada.next();

            try{
                int anyo2 = Integer.parseInt(anyo1);

                if (anyo2<1900 || anyo2 > anyo_actual) {
                    System.out.println("El año introducido no es válido (1900<=año<=" + anyo_actual + ").");
                }else{
                    anyo = anyo2;
                }
            }catch (NumberFormatException err) {
                System.out.println("Has introducido un formato incorrecto");
            }finally{
                entrada.nextLine();
            }

        }else if (modo.equals("2")) {
            System.out.println("Dime tu edad:");

            if (entrada.hasNextInt()) {
                int edad = entrada.nextInt();
                if (edad<0) {
                    System.out.println("La edad introducida debe tener sentido");
                }else{
                    anyo = anyo_actual - edad;
                }
            }else{
                System.out.println("La edad introducida no tiene un formato válido");
            }
        }else{
            System.out.println("El modo introducido no existe o es incorrecto.");
        }
        if (anyo!=0){
            if (anyo>=1900 && anyo<=1927) {
                System.out.println("Eres de la generación sin bautizar.");
            } else if (anyo>=1928 && anyo<=1944) {
                System.out.println("Eres de la generación Silent.");
            } else if (anyo>=1945 && anyo<=1964) {
                System.out.println("Eres de la generación Baby Boomers.");
            } else if (anyo>=1965 && anyo<=1981) {
                System.out.println("Eres de la Generación X.");
            } else if (anyo>=1982 && anyo<=1994) {
                System.out.println("Eres de la Generación Y o Millennials.");
            } else if (anyo>=1995 && anyo<=anyo_actual) {
                System.out.println("Eres de la Generación Z o Centennials.");
            }
        }
    }
}
