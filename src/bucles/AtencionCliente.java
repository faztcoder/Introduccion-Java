package bucles;

import java.util.Scanner;

public class AtencionCliente {
    public static void main(String[] args) {
        Scanner buffer = new Scanner(System.in);

        int intentos = 3;
        String usuario = "Anthony";
        String password = "contraseña";

        while (intentos > 0) {

            System.out.println("Ingresa tu contraseña: ");
            String pass = buffer.nextLine();

            if (pass.equals(password)) {
                System.out.println("Iniciando sesión...");
                System.out.println("Bienvenido " + usuario);
                break;
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta, te quedan: " + intentos);
                if (intentos == 0) {
                    System.out.println("Cuenta bloqueada por 60 min, te quedan: " + intentos);
                } else {
                    System.out.println("Intente de nuevo por favor");
                }
            }
        }
    }
}
