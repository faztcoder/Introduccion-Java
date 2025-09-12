package basico;

import java.util.Scanner;

public class CalcularIVA {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);

        float IVA = 0.16f;
        System.out.println("Ingresa el precio del producto: ");
        float producto = Float.parseFloat(buffer.nextLine());
        float TAX = producto - (producto * IVA);
        System.out.println("El precio del producto después de impuestos: " + TAX);
    }
}
