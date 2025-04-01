package org.example.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;

public class TecladoEstropeado {

    static java.util.Scanner scanner;

    public static boolean casoDePrueba() {
        if (!scanner.hasNext())
            return false;
        else {
            String entrada = scanner.nextLine();

            LinkedList<Character> letras = new LinkedList<>();
            ListIterator<Character> it = letras.listIterator();

            for (char c : entrada.toCharArray()) {
                switch (c) {
                    case '-':
                        while (it.hasPrevious()) {
                            it.previous();
                        }

                        break;
                    case '+':
                        while (it.hasNext()) {
                            it.next();
                        }

                        break;
                    case '*':
                        if (it.hasNext()) {
                            it.next();
                        }

                        break;
                    case '3':
                        if (it.hasNext()) {
                            it.next();
                            it.remove();
                        }

                        break;
                    default:
                        it.add(c);

                        break;
                }
            }

            for (char c : letras) {
                System.out.print(c);
            }

            System.out.println();

            return true;
        }
    }

    public static void main(String[] args) {
        scanner = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}