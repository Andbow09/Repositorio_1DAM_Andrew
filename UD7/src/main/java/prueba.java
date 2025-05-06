public class prueba {
    public static void main(String[] args) {
        media("3.0,8.7,6.7,5.0,9.6");
    }

    public static double media(String cad) {
        String[] array = cad.split(",");

        double total = 0;

        for (int i = 0; i < array.length; i++) {
            total += Double.parseDouble(array[i]);
        }

        return total / array.length;
    }
}
