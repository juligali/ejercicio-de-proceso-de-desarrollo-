package Ejercicio4;

public class Main {
    public static void main(String[] args) {

        Examen examen1 = new Examen.Builder()
                .conSeccionTeorica(true)
                .conSeccionPractica(true)
                .conTiempoLimite(90)
                .conPuntajeExtra(5)
                .build();

        Examen examen2 = new Examen.Builder()
                .conSeccionTeorica(false)
                .conSeccionPractica(true)
                .conTiempoLimite(60)
                .build();

        System.out.println("EXAMEN 1");
        examen1.mostrarExamen();

        System.out.println();

        System.out.println("EXAMEN 2");
        examen2.mostrarExamen();
    }
}
