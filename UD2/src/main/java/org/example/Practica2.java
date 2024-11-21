package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {
    public void practica2(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("¡Bienvenido a la Calculadora!");
        System.out.println("Introduce el operando:");
        int op1 = 0;

        try{
            op1 = entrada.nextInt();
        }catch (InputMismatchException err) {
            System.out.println("Debes introducir caracteres numéricos");
            System.exit(0);
        }

        System.out.println("¿Qué tipo de operación quieres realizar? (+, -, x, /, R)");
        String operacion = entrada.next();

        if (operacion.equals("R")) {
            if ( op1 <= 0 ){
                System.out.println("No es posible realizar una raíz con números inferiores a 1");
                System.exit(0);
            }
            double total = Math.sqrt(op1);
            System.out.println("La raíz de " + op1 + " es " +total);
        }else{
            System.out.println("Introduce el segundo operando:");
            int op2 = 0;

            try{
                op2 = entrada.nextInt();
            }catch (InputMismatchException err) {
                System.out.println("Debes introducir caracteres numéricos");
                System.exit(0);
            }

            int total = 0;

            switch (operacion) {
                case "+":
                    total = op1 + op2;
                    System.out.println(op1 + " + " + op2 + " = " + total);
                    break;
                case "-":
                    total = op1 - op2;
                    System.out.println(op1 + " - " + op2 + " = " + total);
                    break;
                case "x":
                    total = op1 * op2;
                    System.out.println(op1 + " x " + op2 + " = " + total);
                    break;
                case "/":
                    try{
                        total = op1 / op2;
                    }catch (ArithmeticException err) {
                        System.out.println("No es posible realizar divisiones entre 0.");
                        System.exit(0);
                    }
                    System.out.println(op1 + " / " + op2 + " = " + total);
                    break;
                default:
                    System.out.println("La operación que intentas realizar no está disponible o no es correcta.");
                    break;
            }
        }
    }
}
