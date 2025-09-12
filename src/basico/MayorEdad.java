package basico;

import javax.swing.*;

public class MayorEdad {
    public static void main(String[] args) {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad: "));

        if (!(edad < 18)) {
            JOptionPane.showMessageDialog(null, "Accediendo al sitio...");
        } else {
            JOptionPane.showMessageDialog(null, "No puedes acceder al sitio");
        }
    }
}

