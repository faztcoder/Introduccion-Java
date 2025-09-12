package basico;

public class Casting {
    public static void main(String[] args) {
        int numeroEntero = 420;
        double numeroDoble = (int)numeroEntero;

        String password = "1234";
        int pass = Integer.parseInt(password);

        int entero = 765;
        String cadenaEntero = String.valueOf(entero);

        System.out.println(numeroEntero);
        System.out.println(numeroDoble);
        System.out.println(password);
        System.out.println(pass);

        System.out.printf("Conversión de entero a texto %s", cadenaEntero);
    }
}
