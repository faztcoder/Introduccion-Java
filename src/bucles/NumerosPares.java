package bucles;

public class NumerosPares {
    public static void main(String[] args) {
        int esPar = 1;
        int contadorMaximo = 100;
        for (; esPar <= contadorMaximo; esPar++) {

            if (esPar % 2 == 0) {
                System.out.println("Es par: " + esPar);
            } else
                System.out.println("Es impar: " + esPar);
        }
    }
}
