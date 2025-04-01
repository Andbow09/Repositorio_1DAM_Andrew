package org.example.Iterator;

import java.util.*;

public class MaquinaMaria {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Escribe un texto:");
        String texto = scanner.nextLine();

        LinkedList<Character> txt = new LinkedList<>();
        ListIterator<Character> iterator = txt.listIterator();

        for (char c : texto.toCharArray()) {
            switch (c) {
                case '<':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                    }

                    break;
                case '>':
                    if (iterator.hasNext()) {
                        iterator.next();
                    }

                    break;
                case '#':
                    if (iterator.hasPrevious()) {
                        iterator.previous();
                        iterator.remove();
                    }

                    break;
                default:
                    iterator.add(c);
                    break;
            }
        }

        for (char c : txt) {
            System.out.print(c);
        }
    }
}
