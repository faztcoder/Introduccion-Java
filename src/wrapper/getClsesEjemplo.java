package wrapper;

import java.lang.reflect.Method;

public class getClsesEjemplo {
    public static void main(String[] args) {
        String cadena = "Hola mundo";

        Class<? extends String> strClass = cadena.getClass();

        for (Method metodos : strClass.getMethods()) {
            System.out.println(metodos);
        }
    }
}
