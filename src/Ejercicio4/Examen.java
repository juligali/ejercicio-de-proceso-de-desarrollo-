package Ejercicio4;

public class Examen {

    private boolean seccionTeorica;
    private boolean seccionPractica;
    private int tiempoLimite;
    private double puntajeExtra;

    // constructor privado para obligar a usar el Builder
    private Examen(Builder builder) {
        this.seccionTeorica = builder.seccionTeorica;
        this.seccionPractica = builder.seccionPractica;
        this.tiempoLimite = builder.tiempoLimite;
        this.puntajeExtra = builder.puntajeExtra;
    }

    public boolean isSeccionTeorica() {
        return seccionTeorica;
    }

    public boolean isSeccionPractica() {
        return seccionPractica;
    }

    public int getTiempoLimite() {
        return tiempoLimite;
    }

    public double getPuntajeExtra() {
        return puntajeExtra;
    }

    public void mostrarExamen() {
        System.out.println("Sección teórica: " + seccionTeorica);
        System.out.println("Sección práctica: " + seccionPractica);
        System.out.println("Tiempo límite: " + tiempoLimite + " minutos");
        System.out.println("Puntaje extra: " + puntajeExtra);
    }

    // clase interna Builder
    public static class Builder {
        private boolean seccionTeorica;
        private boolean seccionPractica;
        private int tiempoLimite;
        private double puntajeExtra;

        public Builder conSeccionTeorica(boolean seccionTeorica) {
            this.seccionTeorica = seccionTeorica;
            return this;
        }

        public Builder conSeccionPractica(boolean seccionPractica) {
            this.seccionPractica = seccionPractica;
            return this;
        }

        public Builder conTiempoLimite(int tiempoLimite) {
            this.tiempoLimite = tiempoLimite;
            return this;
        }

        public Builder conPuntajeExtra(double puntajeExtra) {
            this.puntajeExtra = puntajeExtra;
            return this;
        }

        public Examen build() {
            return new Examen(this);
        }
    }
}
