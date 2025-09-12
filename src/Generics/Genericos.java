package Generics;

public class Genericos {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        String[] names = {"Anthony", "Fernanda", "Panchito"};
        Integer[] numbers = {1,2,3,4};

        printArray(names);
        printArray(numbers);
    }
}
