package Ejercicio5;


public class Main {

    public static void main(String[] args) {

        Guerrero g1 = new Guerrero("Leon", 100);

        g1.agregarEquipamiento(new Equipamiento("Espada", 50));
        g1.agregarEquipamiento(new Equipamiento("Escudo", 20));

        // 🔴 superficial. copia objeto pero comparte los objetos internos. g1 y g2 apuntan a la MISMA lista
        Guerrero g2 = (Guerrero) g1.clonacion();
        // esto hace unna copia rapida

        // 🟢 profunda. copia objeto principal y tdo lo que tiene adentro, pero no los valores osea guarda espada y escudo pero no el valor
        Guerrero g3 = (Guerrero) g1.clonacionProfunda();

        // modificar superficial, si cambia en uno cambia en otro.
        g2.getEquipamientos().get(0).setNivelDanio(999); // estas modificando, y tmb cambia el g1

        System.out.println("=== SUPERFICIAL ===");
        System.out.println(g1);
        System.out.println(g2);

        // modificar profunda, aca se copia tdo. g1 queda igual y g3 cambia
        g3.getEquipamientos().get(1).setNivelDanio(777);

        System.out.println("\n=== PROFUNDA ===");
        System.out.println(g1);
        System.out.println(g3);
    }
}
