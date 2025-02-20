package org.example.Herencia2;

public class Streamer extends Usuario{
    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String usuario, int seguidores, int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, usuario, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Retransmisiones realizadas: " + numero_retransmisiones);
        System.out.println("Horas de directo: " + horas_directo);
    }
}
