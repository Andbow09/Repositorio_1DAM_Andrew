package org.example;

public class sumaa {

    public static int suma() {
        int num = 1;

        if (num <= 10) {
            num += num;

            return suma();
        } else {
            return 0;
        }
    }
}
