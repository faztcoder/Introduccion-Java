package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TODOList implements TODO {

    public static Scanner sc = new Scanner(System.in);
    public List<String> listaTareas = new ArrayList<>();
    public int opcion = 1;

    public void menu() {
        while (opcion != 0) {
            System.out.println("\n");
            System.out.println("0. Salir");
            System.out.println("1. Agregar TODO");
            System.out.println("2. Obtener TODOS");
            System.out.println("3. Obtener primer TODO");
            System.out.println("4. Obtener último TODO");
            System.out.println("5. Eliminar último TODO");
            opcion = sc.nextInt();
            String valor = String.valueOf(opcion).trim();
            sc.nextLine(); // limpiar buffer

            switch (opcion = Integer.parseInt(valor)) {
                case 0 -> System.out.println("Saliendo...");

                case 1 -> {
                    System.out.println("Agrega un TODO:");
                    String tarea = sc.nextLine();
                    setAgregarTODO(Collections.singletonList(tarea));
                }

                case 2 -> getTODO();

                case 3 -> getFirst();

                case 4 -> getLastTODO();

                case 5 -> deleteLastTODO();

                default -> System.out.println("Opción no encontrada⚠️");
            }
        }
    }

    @Override
    public void setAgregarTODO(List<String> TODO) {
        listaTareas.addAll(TODO);
        System.out.println("\nTODO agregado 👉🏻 " + listaTareas.getLast());
    }

    @Override
    public void getTODO() {
        System.out.println("Todos los TODOS 👉🏻 " + listaTareas);
    }

    @Override
    public void getFirst() {
        System.out.println("\nPrimer TODO agregado 👉🏻 " + listaTareas.getFirst());
        listaTareas.getFirst();
    }

    @Override
    public void getLastTODO() {
        System.out.println("\nÚltimo TODO agregado 👉🏻 " + listaTareas.getLast());
        listaTareas.getLast();
    }

    @Override
    public void deleteLastTODO() {

        if (listaTareas.size() > 1) {
            System.out.println("\nTODO eliminado 👉🏻" + listaTareas.getLast());
            listaTareas.removeLast();
        } else if (listaTareas.size() == 1) {
            System.out.println("\nTODO eliminado 👉🏻" + listaTareas.getFirst());
            listaTareas.removeFirst();
            System.out.println("La lista está vacía🗑️");
        } else {
            listaTareas.isEmpty();
            System.out.println("La lista está vacía🗑️");
        }
    }

    public static void main(String[] args) {
        TODOList tdl = new TODOList();
        tdl.menu();
    }
}

