package org.example;

public class cosasString {
    public void caracteres() {
        String frase = "Ey muy buenas a todos aqui vegeta777";

        int vegeta = frase.length();
        System.out.println("El tamaño de la frase es " + vegeta);

        char let = frase.charAt(20);
        System.out.println("La letra que hay en la posición 20 es " + let);

        String part = frase.substring(3,13);
        System.out.print("El trozo de la frase es " + part);

        String conc = frase.concat(part);
        System.out.println("Concateno la frase con el trozo de palabra anterior " + conc);

        int pos = frase.indexOf("7");
        System.out.println("La posición del número 7 en la frase es " + pos);

        pos = frase.indexOf("7", 5);
        System.out.println("La posición del número 7 en la frase, saltando desde la posición 5 es " + pos);

        pos = frase.lastIndexOf("7");
        System.out.println("La última posición del número 7 en la frase es " + pos);

        String may = frase.toUpperCase();
        System.out.println("La frase en mayúsculas es " + may);

        String min = frase.toLowerCase();
        System.out.println("La frase en minúsculas es " + min);

        String nombre = "vegeta                                            ";
        System.out.println("El nombre leído en la frase es " + nombre + ".");

        nombre = nombre.trim();
        System.out.println("El nombre sin espacios es " + nombre + ".");

        String sines = frase.replace(" ", "");
        System.out.println("La frase sin espacios es " + sines);

        String sust = frase.replace("vegeta777", "willyrex comentando");
        System.out.println("La frase sustituyendo a vegeta por willyrex es: " + sust);


    }
}