package Ejercicio5;


public class Equipamiento implements IPrototype {

    private String nombre;
    private int nivelDanio;

    public Equipamiento(String nombre, int nivelDanio) {
        this.nombre = nombre;
        this.nivelDanio = nivelDanio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelDanio() {
        return nivelDanio;
    }

    public void setNivelDanio(int nivelDanio) {
        this.nivelDanio = nivelDanio;
    }

    @Override
    public IPrototype clonacion() {
        return new Equipamiento(nombre, nivelDanio);
    }

    @Override
    public IPrototype clonacionProfunda() {
        return this.clonacion();
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +
                " - Equipamiento{" +
                "nombre='" + nombre + '\'' +
                ", nivelDanio=" + nivelDanio +
                '}';
    }
}