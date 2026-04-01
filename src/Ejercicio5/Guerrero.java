package Ejercicio5;


import java.util.ArrayList;
import java.util.List;

public class Guerrero implements IPrototype {

    private String nombre;
    private int salud;
    private List<Equipamiento> equipamientos;

    public Guerrero(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.equipamientos = new ArrayList<>();
    }

    public void agregarEquipamiento(Equipamiento e) {
        equipamientos.add(e);
    }

    public List<Equipamiento> getEquipamientos() {
        return equipamientos;
    }

    // 🔴 CLONACIÓN SUPERFICIAL
    @Override
    public IPrototype clonacion() {
        Guerrero clon = new Guerrero(nombre, salud);
        clon.equipamientos = this.equipamientos; // MISMA lista ❌
        return clon;
    }

    // 🟢 CLONACIÓN PROFUNDA
    @Override
    public IPrototype clonacionProfunda() {
        Guerrero clon = new Guerrero(nombre, salud);

        List<Equipamiento> nuevaLista = new ArrayList<>();

        for (Equipamiento e : this.equipamientos) {
            nuevaLista.add((Equipamiento) e.clonacionProfunda());
        }

        clon.equipamientos = nuevaLista; // lista nueva ✔️
        return clon;
    }

    @Override
    public String toString() {
        return Integer.toHexString(System.identityHashCode(this)) +
                " - Guerrero{" +
                "nombre='" + nombre + '\'' +
                ", salud=" + salud +
                ", equipamientos=" + equipamientos +
                '}';
    }
}
