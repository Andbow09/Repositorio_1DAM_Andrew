package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ampliacion2 {
    public void ampli2(){
        Scanner entrada = new Scanner(System.in);
        int dia = 0;

        try{
            System.out.println("Dime un número del 1 al 7");
            dia = entrada.nextInt();
        }catch (InputMismatchException err) {
            System.out.println("Introduce un formato correcto");
            System.exit(0);
        }
        switch (dia) {
            case 1:
                System.out.println(dia + " corresponde al Lunes");
                break;
            case 2:
                System.out.println(dia + " corresponde al Martes");
                break;
            case 3:
                System.out.println(dia + " corresponde al Miércoles");
                break;
            case 4:
                System.out.println(dia + " corresponde al Jueves");
                break;
            case 5:
                System.out.println(dia + " corresponde al Viernes");
                break;
            case 6:
                System.out.println(dia + " corresponde al Sábado");
                break;
            case 7:
                System.out.println(dia + " corresponde al Domingo");
                break;
            default:
                System.out.println(dia + " no es un día de la semana");
                break;
        }
    }
}
