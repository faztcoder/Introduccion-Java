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
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                    System.out.println("Agrega un TODO:");
                    String tarea = sc.nextLine();
                    setAgregarTODO(Collections.singletonList(tarea));
                    break;

                case 2:
                    getTODO();
                    break;

                case 3:
                    getFirst();
                    break;

                case 4:
                    getLastTODO();
                    break;

                case 5:
                    deleteLastTODO();
                    break;

                default:
                    System.out.println("Opción no encontrada⚠️");
                    break;
            }
        }
    }

    @Override
    public void setAgregarTODO(List<String> TODO) {
        System.out.println("\nTODO agregado 👉🏻 " + listaTareas);
        listaTareas.addAll(TODO);
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
        System.out.println("\nTODO eliminado 👉🏻 " + listaTareas.removeLast());
        if (Boolean.parseBoolean(listaTareas.getFirst())) {
            System.out.println("Eliminando el primer TODO agregado");
            listaTareas.clear();
        } else {
            listaTareas.removeLast();
        }
    }

    public static void main(String[] args) {
        TODOList tdl = new TODOList();
        tdl.menu();
    }
}

