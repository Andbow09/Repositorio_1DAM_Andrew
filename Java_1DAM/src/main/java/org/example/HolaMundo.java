/* Este es un programa simple en Java...
   NombreArchivo: "HolaMundo.java". */
class HolaMundo {
    // Tu programa comienza con una llamada a main().
    // Imprime "Hola Mundo" en la ventana de la terminal.
    public static void main(String args[])
    // public: Para que la JVM (Máquina Virtual Java) pueda ejecutar el metodo desde cualquier lugar.
    // static: El metodo principal puede ser llamado sin crear el objeto (lo veremos más adelante)
    // void: El metodo main no devuelve nada, por lo tanto, no hay que definirlo con un tipo de datos concreto.
    // main(): Nombre configurado como programa principal en la JVM.
    // String[]: El metodo principal acepta un único argumento: una matriz de elementos de tipo String (texto).
    {
        System.out.println("Hola Mundo");
    }
}