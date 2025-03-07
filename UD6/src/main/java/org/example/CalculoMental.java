package org.example;

public class CalculoMental {
    static java.util.Scanner scanner;

    public static void casoDePrueba() {
        String calculo = scanner.nextLine();
        String[] caracteres = calculo.split(" ");

        int num1 = 0;
        int num2 = 0;
        int res = 0;
        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i].equals("+")) {
                num1 = Integer.parseInt(caracteres[i-1]);
                num2 = Integer.parseInt(caracteres[i+1]);

                if (i == 1) {
                    res = num1 + num2;
                } else {
                    res = res + num2;
                }

                continue;
            } else if (caracteres[i].equals("-")) {
                num1 = Integer.parseInt(caracteres[i-1]);
                num2 = Integer.parseInt(caracteres[i+1]);

                if (i == 1) {
                    res = num1 - num2;
                } else {
                    res = res - num2;
                }

                continue;
            }

            if (i == (caracteres.length - 1)) {
                System.out.print(res);
            } else if (res != 0){
                System.out.print(res + ", ");
            }
        }
    }

    public static void main(String[] args) {
        scanner = new java.util.Scanner(System.in);

        int numCasos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCasos; i++) {
            casoDePrueba();
        }
    }
}