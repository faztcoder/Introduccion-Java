package wrapper;

public class WrapperInteger {

    public static void main(String[] args) {
        int intPrimitivo = 3287;
        Integer intObjecto = Integer.valueOf(intPrimitivo);
        Integer intObjecto2 = intPrimitivo;

        int num = intObjecto;
        int num2 = intObjecto.intValue();
        String cadenaNum = intObjecto.toString();

        System.out.println("Convirtinedo el intObjecto a un String: " + cadenaNum);

        System.out.println(num);
        System.out.println(num2);

        String valorTVLCD = "6999";
        Integer valorTV = Integer.valueOf(valorTVLCD);

        System.out.println(valorTV);

    }
}
