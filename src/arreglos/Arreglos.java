package arreglos;

public class Arreglos {
    public static void main(String[] args) {
        String[] nombres = new String[3];

        nombres[0] = "anthony";
        nombres[1] = "fernanda";
        nombres[2] = "camila";

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("\nInicio de algoritmo de ordenamiento...🚀");

        // Algoritmo de ordenamiento (burbuja) sin usar la API Collections
        int contador = 0;

        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = 0; j < nombres.length - i - 1; j++) { // Él -i -1 es para evitar el punto de quiebre y que el ordenamiento se revierta
                if (nombres[j + 1].compareTo(nombres[j]) < 0) {
                    String aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
                contador++;
            }
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
