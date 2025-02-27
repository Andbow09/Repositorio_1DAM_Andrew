package org.example.CajeroAutomatico;

import java.util.Scanner;

public class AppCuenta {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws DepositoMaximo, ImporteMinimo, SaldoInsuficiente, LimiteDiario {
        CuentaBancaria banco = new CuentaBancaria(700);

        do {
            Menu();

            System.out.print("\n\tIngrese una opción: ");
            String opcion = scanner.next();

            double importe = 0;

            switch (opcion.toLowerCase()) {
                case "1":
                    System.out.println("\tSaldo actual: " + banco.consultarSaldo());
                    break;
                case "2":
                    System.out.print("\tIntroduce el importe a ingresar: ");
                    importe = scanner.nextDouble();
                    banco.ingresar(importe);
                    break;
                case "3":
                    System.out.print("\tIntroduce el importe a retirar: ");
                    importe = scanner.nextDouble();
                    banco.retirar(importe);
                    break;
                case "x":
                    System.out.println("\tSaliendo...");
                    System.exit(0);
            }
        } while (1 != 0);

    }

    public static void Menu() {
        System.out.println("\n=== Cajero Automático ===");
        System.out.println("\t[1]. Consultar saldo.");
        System.out.println("\t[2]. Ingresar dinero.");
        System.out.println("\t[3]. Retirar dinero.");
        System.out.println("\t[X]. Salir.");
    }
}
