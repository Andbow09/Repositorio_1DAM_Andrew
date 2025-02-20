package org.example.Practica1;

import java.util.Scanner;

/**
 * Clase que representa la tienda y su sistema de pago.
 */
public class Tienda {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo principal que inicia el proceso de pago.
     */
    public static void iniciarPago() {
        //pide el metodo que vas a usar
        System.out.println("¿Qué método de pago quieres usar? [Tarjeta, PayPal, Bizum]");
        String metodo = scanner.next();

        switch (metodo.toLowerCase()) { //Verifica que lo que hayas introducido coincide con los casos a continuación.
            //En caso de haber elegido tarjeta
            case "tarjeta":
                //Introduce los datos de tu tarjeta.
                System.out.println("Introduce los datos de tu tarjeta:");
                System.out.println("Número (16 dígitos):");
                String nro_tarjeta = scanner.next();

                System.out.println("Tipo (VISA, MASTERCARD o MAESTRO):");
                String tipo = scanner.next();

                System.out.println("Validando tarjeta...");
                //Crea un nuevo metodo de pago con los datos declarados antes.
                MetodoPago tarjeta = new TarjetaCredito(nro_tarjeta,tipo);

                //Realiza la validación de la tarjeta
                if (((TarjetaCredito) tarjeta).validarTarjeta(nro_tarjeta,tipo)) {
                    //si la validación ha devuelto true, se le pedirá el importe.
                    System.out.println("Introduce el importe:");
                    double importe = scanner.nextDouble();

                    //Con el importe dado, se realiza el pago llamando a realizarPago.
                    realizarPago(tarjeta, importe);
                } else {
                    //Si la validación ha devuelto false, dirá que no ha sido correcta.
                    System.out.println("Datos ingresados incorrectos.");
                }

                break;

            //En caso de haber elegido PayPal.
            case "paypal":
                //Introduce los datos de PayPal.
                System.out.println("Introduce los datos de PayPal:");
                System.out.println("Cuenta de PayPal (ejemplo@dominio):");
                String cuenta = scanner.next();

                System.out.println("Validando PayPal...");

                //Crea un nuevo metodo de pago con los datos declarados antes.
                MetodoPago paypal = new PayPal(cuenta);

                //Realiza la validación de la cuenta de correo.
                if (((PayPal) paypal).validarPayPal(cuenta) != null) {
                    //Si devuelve algo no nulo, se pedirá el importe
                    System.out.println("Introduce el importe:");
                    double importe = scanner.nextDouble();

                    //Con el importe dado, se validará que el saldo no sea inferior al importe.
                    if (((PayPal) paypal).validarSaldo(importe)) {
                        //Si se cumple, se realizará el pago llamando a realizarPago.
                        realizarPago(paypal,importe);
                    }
                } else {
                    //Si el formato de correo no es correcto, saltará error.
                    System.out.println("Formato de cuenta no correcto.");
                }

                break;

            //En caso de haber elegido Bizum.
            case "bizum":
                //Introduce los datos de Bizum.
                System.out.println("Introduce los datos de Bizum:");
                System.out.println("Número de Teléfono (9 Dígitos):");
                String telefono = scanner.next();

                //Crea un nuevo metodo de pago con los datos declarados antes, el pin no, ya que este se genera.
                MetodoPago bizum = new Bizum(telefono);

                //Imprime el pin generado, de esta forma es más sencilla la validación.
                System.out.println(((Bizum) bizum).getPin());
                //pide que insertes el pin.
                System.out.println("PIN (6 Dígitos):");
                int pin = scanner.nextInt();

                //valida el Bizum.
                System.out.println("Validando Bizum...");
                if (((Bizum) bizum).validarBizum(telefono,pin)) {
                    //Si la validación devuelve true, se te pedirá el importe a pagar.
                    System.out.println("Introduce el importe:");
                    double importe = scanner.nextDouble();

                    //Con el importe dado, se realizará el pago llamando a realizarPago.
                    realizarPago(bizum,importe);
                } else {
                    //Si la validación devuelve false, entonces los datos son incorrectos.
                    System.out.println("Los datos introducidos no son correctos.");
                }

                break;

            //Si el metodo introducido no coincide con ninguno de los casos anteriores, este no será aceptado.
            default:
                System.out.println("Método no aceptado.");
                break;
        }

    }

    /**
     * Metodo que llama al proceso de pago del metodo de pago escogido y creado en iniciarPago dado el importe introducido.
     * @param metodo objeto de tipo MetodoPago que se creará en iniciarPago.
     * @param importe double que será declarado en iniciarPago
     */
    public static void realizarPago(MetodoPago metodo, double importe){
        metodo.procesarPago(importe);
    }
}