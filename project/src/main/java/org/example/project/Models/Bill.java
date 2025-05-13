package org.example.project.Models;

import java.time.LocalDateTime;

public class Bill {
    private static int nextId = 1; // Variable estática para llevar la cuenta del próximo ID a asignar a una factura. Se inicializa en 1.
    private final int id; // Identificador único de la factura. Se asigna una sola vez en el constructor.
    private final User recipient; // Objeto de la clase User que representa al destinatario de la factura. Es inmutable una vez asignado.
    private final double amount; // Monto total de la factura. Es inmutable una vez asignado.
    private final LocalDateTime issueDate; // Fecha y hora en la que se emitió la factura. Se establece automáticamente al crear la instancia.

    // Constructor de la clase Bill. Recibe el destinatario (User) y el monto (double) como argumentos.
    public Bill(User recipient, double amount) {
        // Valida que el monto proporcionado sea positivo. Si no lo es, lanza una excepción IllegalArgumentException con un mensaje descriptivo.
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser positivo.");
        }

        // Asigna el siguiente ID disponible a la factura y luego incrementa el contador estático nextId para la próxima factura.
        this.id = nextId++;
        // Asigna el objeto User recibido como destinatario de la factura.
        this.recipient = recipient;
        // Asigna el monto recibido a la factura.
        this.amount = amount;
        // Obtiene la fecha y hora actual del sistema y la asigna como la fecha de emisión de la factura.
        this.issueDate = LocalDateTime.now();
    }

    // Método getter para obtener el ID de la factura.
    public int getId() {
        return id;
    }

    // Método getter para obtener el objeto User que es el destinatario de la factura.
    public User getRecipient() {
        return recipient;
    }

    // Método getter para obtener el monto de la factura.
    public double getAmount() {
        return amount;
    }

    // Método getter para obtener la fecha y hora de emisión de la factura.
    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    // Sobreescritura del método toString() para proporcionar una representación en cadena legible del objeto Bill.
    @Override
    public String toString() {
        // Utiliza String.format para crear una cadena con información relevante de la factura, incluyendo ID, nombre del destinatario, monto y fecha de emisión.
        return String.format("Bill [ID=%d, Recipient=%s, Amount=%.2f, IssueDate=%s]",
                id, recipient.getName(), amount, issueDate);
    }
}