package org.example.project.Models;

import java.time.LocalDateTime;

public class Payment {
    private static int nextId = 1; // Variable estática para llevar la cuenta del próximo ID a asignar a un pago. Se inicializa en 1.
    private final int id; // Identificador único del pago. Se asigna una sola vez en el constructor.
    private final User payer; // Objeto User que realizó el pago. Es inmutable una vez asignado.
    private final Bill bill; // Objeto Bill al que corresponde este pago. Es inmutable una vez asignado.
    private final double amount; // Monto del pago. Es inmutable una vez asignado.
    private final LocalDateTime timestamp; // Fecha y hora en la que se realizó el pago. Se establece automáticamente al crear la instancia.

    // Constructor de la clase Payment. Recibe el pagador (User), la factura (Bill) y el monto (double) como argumentos.
    public Payment(User payer, Bill bill, double amount) {
        // Valida que el monto proporcionado sea positivo. Si no lo es, lanza una excepción IllegalArgumentException con un mensaje descriptivo.
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo.");
        }

        // Asigna el siguiente ID disponible al pago y luego incrementa el contador estático nextId para el próximo pago.
        this.id = nextId++;
        // Asigna el objeto User que realizó el pago.
        this.payer = payer;
        // Asigna el objeto Bill al que se refiere el pago.
        this.bill = bill;
        // Asigna el monto del pago.
        this.amount = amount;
        // Obtiene la fecha y hora actual del sistema y la asigna como la marca de tiempo del pago.
        this.timestamp = LocalDateTime.now();
    }

    // Método getter para obtener el ID del pago.
    public int getId() {
        return id;
    }

    // Método getter para obtener el objeto User que realizó el pago.
    public User getPayer() {
        return payer;
    }

    // Método getter para obtener el objeto Bill asociado al pago.
    public Bill getBill() {
        return bill;
    }

    // Método getter para obtener el monto del pago.
    public double getAmount() {
        return amount;
    }

    // Método getter para obtener la fecha y hora del pago.
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // Sobreescritura del método toString() para proporcionar una representación en cadena legible del objeto Payment.
    @Override
    public String toString() {
        // Utiliza String.format para crear una cadena con información relevante del pago, incluyendo ID, nombre del pagador, ID de la factura y monto.
        return String.format("Payment [ID=%d, Payer=%s, BillID=%d, Amount=%.2f]",
                id, payer.getName(), bill.getId(), amount);
    }
}