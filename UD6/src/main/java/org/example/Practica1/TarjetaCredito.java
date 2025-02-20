package org.example.Practica1;

/**
 * Clase que representa el metodo de pago con tarjeta de crédito.
 */
public class TarjetaCredito extends MetodoPago {
    private String nro_tarjeta; // Número de la tarjeta de crédito
    private String tipo; // Tipo de la tarjeta (VISA, MASTERCARD, MAESTRO)

    /**
     * Constructor que inicializa la tarjeta de crédito con su número y tipo.
     * @param nro_tarjeta Número de la tarjeta.
     * @param tipo Tipo de la tarjeta (VISA, MASTERCARD o MAESTRO).
     */
    public TarjetaCredito(String nro_tarjeta, String tipo) {
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }

    /**
     * Valida el número de la tarjeta de crédito, este debe tener 16 dígitos.
     * @param nro_tarjeta Número de la tarjeta de crédito.
     * @return El número de la tarjeta si es válido, nulo en caso contrario.
     */
    public String validarNumero(String nro_tarjeta) {
        // Verifica si el número de tarjeta tiene 16 dígitos
        if (nro_tarjeta.matches("\\d{16}")) {
            return nro_tarjeta;
        }
        return null;
    }

    /**
     * Valida el tipo de tarjeta de crédito (VISA, MASTERCARD o MAESTRO).
     * @param tipo Tipo de la tarjeta de crédito.
     * @return El tipo de tarjeta si es válido, nulo en caso contrario.
     */
    public String validarTipo(String tipo) {
        // Tipos válidos de tarjetas.
        String[] tipos = {"VISA", "MASTERCARD", "MAESTRO"};

        // Verifica si el tipo es uno de los válidos.
        for (String s : tipos) {
            if (tipo.equalsIgnoreCase(s)) {
                return tipo.toUpperCase();
            }
        }
        return null;
    }


    /**
     * Valida los datos de la tarjeta de crédito llamando a validarNumero y validarTipo.
     * @param nro_tarjeta Número de la tarjeta.
     * @param tipo Tipo de la tarjeta.
     * @return true si la validación es correcta, false en caso contrario.
     */
    public boolean validarTarjeta(String nro_tarjeta, String tipo) {
        // Verifica el número de tarjeta y el tipo llamando a validarNumero y a validarTipo.
        validarNumero(nro_tarjeta);
        validarTipo(tipo);

        // Si alguno es nulo, la validación falla.
        if (validarNumero(nro_tarjeta) == null || validarTipo(tipo) == null) {
            return false;
        }
        return true;
    }

    /**
     * Procesa el pago con la tarjeta de crédito.
     * @param importe a procesar.
     */
    @Override
    void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + this.tipo);
    }
}