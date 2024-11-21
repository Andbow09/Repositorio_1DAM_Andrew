package org.example;
import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public void practica3() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un ISBN:");
        String ISBN = "caca";

        try {
            ISBN = entrada.next();
        } catch (InputMismatchException err) {
            System.out.println("El ISBN debe ser de formato numérico");
            System.exit(0);
        }

        int ISBN_L = ISBN.length();

        if (ISBN_L != 10) {
            System.out.println("El ISBN debe tener 10 dígitos");
            System.exit(0);
        }

        int res = 0;
        int incog = -1;

        for (int i = 0; i < 10; i++) {
            char num = ISBN.charAt(i);

            if (num == '?') {
                incog = i + 1;
            } else if (num == 'X') {
                res += 10 * (10 - i);
            } else {
                int digito = Character.getNumericValue(num);
                res += digito * (10 - i);
            }
        }

        if (incog == -1) {
            if (res % 11 == 0) {
                System.out.println("El ISBN es válido");
                return;
            } else {
                System.out.println("El ISBN es inválido");
                return;
            }
        }

        for (int pos = 0; pos <= 9; pos++) {
            int resp = res + (incog * (10 - pos));
            if (resp % 11 == 0) {
                pos += 1;
                System.out.println("El dígito que falta es:" + pos);
                break;
            }
            break;
        }

        System.out.println("No es posible calcular");
    }
}




