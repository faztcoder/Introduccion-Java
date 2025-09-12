package bucles;

public class InteresCompuesto {
    public static void main(String[] args) {
        float capitalInicia = 1000;
        float adicionAnual = 2100;
        float tasaInteresAnual = 0.05f;
        float periodoAnios = 10;

        float montoFinal = capitalInicia;
        for (int i = 0; i < periodoAnios; i++) {
            float crecimientoAnual = montoFinal * tasaInteresAnual;
            montoFinal += crecimientoAnual;
            montoFinal += adicionAnual;
        }
        System.out.println(montoFinal);
    }
}
