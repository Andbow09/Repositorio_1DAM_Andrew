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
        int anyo1 = 1800;

        if (modo.equals("1")) {
            System.out.println("Dime tu año de nacimiento");
            String anyo = entrada.next();

            boolean error = false;
            try{
                anyo1 = Integer.parseInt(anyo);
            }catch (NumberFormatException err){
                System.out.println("Has introducido un formato incorrecto");
            }

            if (anyo1 < 1900 || anyo1 > anyo_actual){
                System.out.println("El año introducido es correcto.");
                error = true;
            }
        }else if (modo.equals("2")){
            int edad = 0;
            System.out.println("Dime tu edad:");

            if (entrada.hasNextInt()){
                edad = entrada.nextInt();
            }else{
                System.out.println("La edad introducida no tiene un formato válido");
            }


        }else{
            System.out.println("El modo introducido no existe o es incorrecto.");
        }
    }
}
