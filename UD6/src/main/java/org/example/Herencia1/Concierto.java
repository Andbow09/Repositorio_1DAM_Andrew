package org.example.Herencia1;

public class Concierto {
    public static void main(String[] args) throws EdadValida {
        try {
            Asistente a1 = new Asistente("Carlos", 15, "VIP");
            Artista art1 = new Artista("Dua Lipa",28,"Pop");
            Organizador org1 = new Organizador("Francisco",30,"Seguridad");
        } catch (EdadValida e) {
            System.out.println(e.getMessage());
        }


//        a1.mostrarInfo();
//        System.out.println("");
//        art1.mostrarInfo();
//        System.out.println("");
//        org1.mostrarInfo();
//
//        Persona[] personas = {
//                new Asistente("Lucas", 18, "VIP"),
//                new Artista("Sofía", 25, "Rock Alternativo"),
//                new Organizador("Martín", 30, "Producción")
//        };
//
//        for (Persona p : personas) {
//            p.mostrarInfo(); //se ejecuta la versión sobrescrita de cada subclase
//        }
//
//        Persona a = new Asistente("Carlos",25,"VIP");
//        Persona art = new Artista("Dua Lipa",28,"Pop");
//        Persona org = new Organizador("Francisco",30,"Seguridad");
//
//        mostrarAcceso(a);
//        mostrarAcceso(art);
//        mostrarAcceso(org);
//    }
//
//    public static void mostrarAcceso(Persona persona) {
//        persona.accederEvento();
//    }
    }
}
