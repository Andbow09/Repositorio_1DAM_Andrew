package org.example.HashMap;

import java.util.HashMap;

public class Modas {

    static java.util.Scanner scanner;

    public static boolean casoDePrueba() {
        HashMap<String,Integer> map = new HashMap<>();

        int numcasos = scanner.nextInt();
        scanner.nextLine();

        if (numcasos == 0) {
            return false;
        } else {
            String nums = scanner.nextLine();
            String[] listaNums = nums.split(" ");

            for (String num : listaNums) {
                if (map.containsKey(num)) {
                    map.put(num,(map.get(num) + 1));
                } else {
                    map.put(num,1);
                }
            }

            int max = 0;
            String masg = "";
            for (HashMap.Entry<String,Integer> lets : map.entrySet()) {
                if (lets.getValue() >= max) {
                    masg = lets.getKey();
                    max = lets.getValue();
                }
            }

            System.out.println(masg);

            return true;
        }
    }

    public static void main(String[] args) {
        scanner = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}