package ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TODOList {

    public static Scanner sc = new Scanner(System.in);
    // Tiene que cunplir el contrato de una Interfaz de List
    public List<String> listaTareas = new ArrayList<>();

    public int longitud = listaTareas.size();
    public int opcion;

    public void menu() {
        do {
            System.out.println("0. Salir");
            System.out.println("1. Agregar TODO");
            System.out.println("2. Obtener TODOS");
            opcion = sc.nextInt();

            switch (opcion) {
                case 0 -> System.out.println("Saliendo...");
                case 1 -> setAgregarTODO();
                case 2 -> getTODO();
                default -> System.out.println("Opcion no encontrada");
            }

        } while (opcion != 0);

    }

    public void setAgregarTODO() {

        for (int i = 0; i <= longitud; i++) {
            System.out.println("Agrega un TODO");
            String TODO = sc.nextLine();
            listaTareas.add(TODO);
        }
    }

    public List<String> getTODO() {
        return listaTareas;
    }

    public static void main(String[] args) {
        TODOList tdl = new TODOList();
        tdl.menu();
    }
}
