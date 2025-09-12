package arreglos;

import java.util.Arrays;
import javax.swing.*;

public class PromedioAlumnos {

    static float promedio;
    static String nombreAlumno = "";

    public static void main(String[] args) {

        int cantidadAlumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos"));

        String[] alumnos = new String[cantidadAlumnos];
        

//        Bucle for para agregar alumnos al arreglo
        for (int i = 0; i < cantidadAlumnos; i++) {
            nombreAlumno = JOptionPane.showInputDialog("Ingrese el nombre del alumno");
            alumnos[i] = nombreAlumno;

            float notaUno = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la primera calificación"));

            float notaDos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la segunda calificación"));

            float notaTres = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la tercera calificación"));

            promedio = (notaUno + notaDos + notaTres) / 3;
            System.out.println(nombreAlumno + " tuvo como promedio = " + promedio);
            JOptionPane.showMessageDialog(null, nombreAlumno + " tuvo como promedio: " + promedio);
        } // fin de bucle for

        JOptionPane.showMessageDialog(null,
                new StringBuilder()
                        .append("Total de alumnos: ")
                        .append(cantidadAlumnos)
                        .append("\n")
                        .append("Alumnos: ")
                        .append(Arrays.toString(alumnos))
                        .toString(),
                "Alumnos & Promedios",
                JOptionPane.INFORMATION_MESSAGE);
        for (String alumno : alumnos) {
            System.out.println("Nombre: " + alumno + "\n" + "Promedio: " + promedio + "\n");
        }
    } // fin del main

} // fin de la clase principal
