package arreglos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class NumerosArrayList {
    // Crea un ArrayList que debe almacenar numeros enteros desde Scanner

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        int cantidad;
        int numero;

        System.out.println("Ingrese tamaño del arreglo");
        cantidad = sc.nextInt();

        for (int i = 0; i < cantidad ; i++) {
            System.out.println("Ingrese un número para el arreglo: 👇🏻");
            numero = sc.nextInt();

            numeros.add(numero);
        }
        System.out.println(numeros);
        System.out.println("Sorting Array...");

        Collections.sort(numeros);
        System.out.println(numeros);
    }
}
