package org.example.Herencia2;

public class RedSocial {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ana",30,"@ana",231);
        System.out.println("Información del Usuario: ");
        usuario.mostrarInfo();
        System.out.println("");

        Influencer influ = new Influencer("Luis",25,"@luis_influencer",50000);
        influ.anadirColaboracion("MediaMarkt");
        influ.anadirColaboracion("Yoigo");
        influ.anadirColaboracion("Temu");
        System.out.println("Información del Influencer:");
        influ.mostrarInfo();
        System.out.println("");
        System.out.println("");

        Streamer str = new Streamer("Carlos",27,"@carlos_stream",30200,150,2000);
        str.mostrarInfo();
        System.out.println("");

        Basico bas = new Basico("Pedro",22,"@pedro123",455);
        bas.mostrarInfo();
    }
}
