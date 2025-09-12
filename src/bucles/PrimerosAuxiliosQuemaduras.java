package bucles;

import java.util.Scanner;

public class PrimerosAuxiliosQuemaduras {

    public static int menu;

    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);
        do {
            System.out.println("********Mostrar información de quemaduras********");
            System.out.println("¿Qué tipo de quemadura es?");
            System.out.println("1) Primer grado");
            System.out.println("2) Segundo grado");
            System.out.println("3) Tercero grado");
            System.out.println("0) Salir");
            menu = buffer.nextInt();

            // Structured switch (Java 14+)
            switch (menu) {
                case 1 ->
                    System.out.println("Tratamiento con cremas y antibióticos\n");
                case 2 ->
                    System.out.println("Tratamiento con injerto de piel\n");
                case 3 ->
                    System.out.println("Tratamiento con injerto de pez tilapia\n");
                case 0 ->
                    System.out.println("Saliendo...");
                default ->
                    System.out.println("La opción no existe\n");
            }
        } while ((menu != 0));
    }
}
