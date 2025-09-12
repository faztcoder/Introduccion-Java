package Enum;

public class Enmuns {
    // Datos que no pueden modificarse, valores fijos, constantes, como por ejemplo: Meses, Días de la semana, etc.

    enum DiaSemana {
        Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo
    }

    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.Domingo;
        System.out.println("hoy = " + hoy);

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }
    }
}
