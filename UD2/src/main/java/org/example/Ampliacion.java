package org.example;
import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ampliacion {
    public void ampli(){
        Scanner entrada = new Scanner(System.in);

        int altura = 0;

        try{
            System.out.println("Dime tu altura:");
            altura = entrada.nextInt();
        }catch (InputMismatchException err) {
            System.out.println("Introduce un formato correcto");
            System.exit(0);
        }

        if (altura<=150) {
            if(altura <=0){
                System.out.println("Introduce una edad coherente, se puede medir 0");
                System.exit(0);
            }
            System.out.println("Tienes una estatura baja");
        }else if (altura>=151 && altura<=175) {
            System.out.println("Tienes una estatura media");
        }else{
            if(altura >=300){
                System.out.println("Introduce una edad coherente, se puede medir más de 3 metros");
                System.exit(0);
            }
            System.out.println("Tienes una estatura alta");
        }
    }
}
