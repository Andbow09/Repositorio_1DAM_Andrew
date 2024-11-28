package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica3 {
    public void practica3() {
        Scanner entrada = new Scanner(System.in);

        int filas = 0;
        int columnas = 0;
        //determinamos las variables de filas y columnas respectivamente.
        try {
            System.out.print("Introduce número de filas: ");
            filas = entrada.nextInt(); //introducimos número de filas.

            System.out.print("Introduce número de columnas: ");
            columnas = entrada.nextInt(); //introducimos número de columnas.
        } catch (InputMismatchException err){
            System.out.println("Valor de filas/columnas no válido"); //comprueba que las filas y columnas sean de valor numérico.
            return;
        }

        String[][] sopaletras = new String[filas][columnas]; //convertimos el total de filas y columnas en una matriz de esas dimensiones.

        for (int i = 0; i < filas; i++) {
            System.out.print("Introduce las letras de la fila " + (i + 1) + ": ");
            String letras = entrada.next(); //introducimos los valores alfabéticos en la fila correspondiente.

            if (letras.length() != columnas) {
                System.out.println("Tamaño de palabra no admitido.");
                return; //comprobamos que el tamaño de la palabra que introducimos en la fila sea de un valor igual al número de columnas, si no lo es, se sale del programa.
            }

            boolean let = letras.matches("[a-zA-Z]+"); //comprobamos que la palabra que introducimos en la fila actual sea de valores alfabéticos.

            if (!let) {
                System.out.println("ERROR. Introduce datos válidos: " + columnas + " letras.");
                return; //si no es alfabético, te dice que el valor no es válido y se sale del programa.
            }

            String letras_vector[] = letras.split(""); //guarda la palabra escrita en la fila actual en un array cuyo delimitante es la nada misma, haciendo que se guarde
            // letra por letra en una posición consecutiva cada vez.

            for (int j = 0; j < sopaletras[i].length; j++) {
                sopaletras[i][j] = letras_vector[j]; //guarda el array con todas las letra de la palabra en una fila diferente de la matriz de la sopa de letras.
            }
        }

        System.out.print("Introduce la palabra a buscar: ");
        String palabrabuscar = entrada.next(); //escribimos qué palabra vamos a buscar.

        String[] letrabuscar = palabrabuscar.split(""); //convertimos la palabra a buscar en un array que contiene en cada uno de sus espacios las letras de la palabra.
        int longpalabra = letrabuscar.length; //guardamos la longitud del array anterior para operar con él más adelante.

        boolean encontrada = false;
        boolean coincidencia = false;
        //creamos dos valores booleanos que nos ayudarán a identificar que haya coincidencias en la matriz o si se encuentra la palabra a buscar.

        for (int i = 0; i < filas; i++) { //recorre todas las filas
            for (int j = 0; j <= columnas - longpalabra; j++) { //recorre todas las columnas dentro de la fila en la que estamos verificando.
                //con "j <= columnas - longpalabra" se espera que el bucle no busque verificar más allá del límite de la matriz.
                coincidencia = true; //esta variable booleana servirá para determinar si se ha encontrado la palabra en la sopa de letras.
                for (int k = 0; k < longpalabra; k++) { //este bucle es para recorrer todas las letras de "letrabuscar" una por una.
                    if (!sopaletras[i][j + k].equals(letrabuscar[k])) { //busca que en la fila actual, las letra buscada coincida con el valor que hay en esa fila y en cada columna.
                        coincidencia = false;
                        break; //en caso de no coincidir, "coincidencia" se convierte en false y eso significará que en esa fila no existe ninguna coincidencia, y pasará a la siguiente.
                    }
                }

                if (coincidencia) {
                    System.out.println("Palabra " + palabrabuscar + " encontrada en la fila " + (i + 1) + ", columna " + (j + 1));
                    encontrada = true; //en caso de de coincidir, se mostrará un un mensaje que dice que la palabra que buscas se encontró, además de sus coordenadas en la matriz.
                    //además, encontrada se convertirá en true, y por tanto afectará a una condición que veremos más adelante.
                }
            }
        }

        for (int j = 0; j < columnas; j++) { //recorre todas las filas
            for (int i = 0; i <= filas - longpalabra; i++) { //recorre todas las filas dentro de la columna en la que estamos verificando.
                //con "j <= filas - longpalabra" se espera que el bucle no busque verificar más allá del límite de la matriz.
                coincidencia = true; //esta variable booleana servirá para determinar si se ha encontrado la palabra en la sopa de letras.
                for (int k = 0; k < longpalabra; k++) { //este bucle es para recorrer todas las letras de "letrabuscar" una por una.
                    if (!sopaletras[i + k][j].equals(letrabuscar[k])) { //busca que en la columna actual, las letra buscada coincida con el valor que hay en esa columna y en cada fila.
                        coincidencia = false;
                        break; //en caso de no coincidir, "coincidencia" se convierte en false y eso significará que en esa columna no existe ninguna coincidencia, y pasará a la siguiente.
                    }
                }

                if (coincidencia) {
                    System.out.println("Palabra " + palabrabuscar + " encontrada en la fila " + (i + 1) + ", columna " + (j + 1));
                    encontrada = true; //en caso de de coincidir, se mostrará un un mensaje que dice que la palabra que buscas se encontró, además de sus coordenadas en la matriz.
                    //además, encontrada se convertirá en true, y por tanto afectará a una condición que veremos más adelante.
                }
            }
        }

        if (!encontrada) {
            System.out.println("Palabra " + palabrabuscar + " no encontrada en la sopa de letras."); //para finalizar, si la variable booleana "encontrada" sigue siendo false
            //querrá decir que no hubo ninguna coincidencia, te dirá que no se encontró, y saldrá del programa.
        }
    }
}