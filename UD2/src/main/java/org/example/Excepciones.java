package org.example;
import java.util.Scanner;

public class Excepciones {
    public void excepciones(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe...");
        String numero = entrada.next();
        int dividendo = 0;

        if(entrada.hasNextInt()) {
            System.out.println("Introduce un dividendo...");
            dividendo = entrada.nextInt();
        }else{
            System.out.println("El formato no es numérico");
        }

        int num = 0;
        int div = 0;

        try {
            num = Integer.parseInt(numero);
            div = dividendo / num;
        }catch (NumberFormatException err1){
            System.out.println("Ocurrió una excepción: " + err1.getMessage());
        }catch (ArithmeticException err2){
            System.out.println("Ocurrió una excepción dividiendo entre 0: " + err2.getMessage());
        }finally{
            if (num != 0){
                System.out.println("El resultado es: " + div);
            }
        }
    }
}
