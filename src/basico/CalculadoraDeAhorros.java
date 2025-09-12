package basico;

import java.util.Scanner;

public class CalculadoraDeAhorros {
    public static void main(String[] args) {
        /*
         * 50 = necesidades
         * 30 = desos
         * 20 = ahorros
         */
        Scanner buffer = new Scanner(System.in);
        System.out.println("Ingresa tu salario mensual después de impuestos");
        float salario = buffer.nextFloat() / 2;

        System.out.println("Tienes algún prestamo mensual, ingresa el monto del pago mensual");
        float salarioDespuesPrestamo = (salario - buffer.nextFloat());
        System.out.println("salarioDespuesPrestamo " + salarioDespuesPrestamo);

        float necesidades = (salarioDespuesPrestamo * 0.5f);
        float deseos = (salarioDespuesPrestamo * 0.3f);
        float ahorros = (salarioDespuesPrestamo * 0.20f);

        System.out.println("Después de prestamos");
        System.out.println("necesidades = " + necesidades);
        System.out.println("deseos = " + deseos);
        System.out.println("ahorros = " + ahorros);
    }
}
