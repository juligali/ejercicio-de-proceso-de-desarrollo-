package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        ConfiguracionRed config1 = ConfiguracionRed.getInstancia();
        config1.setNombreServidor("Servidor1");
        config1.setPuerto(8080);

        ConfiguracionRed config2 = ConfiguracionRed.getInstancia();

        // mostramos valores
        System.out.println(config2.getNombreServidor());
        System.out.println(config2.getPuerto());



        // comprobamos si es el mismo objeto
        if (config1 == config2) {
            System.out.println("Es la MISMA instancia en memoria");
        } else {
            System.out.println("Son diferentes");
        }

        //Comprobar que sean la misma
        System.out.println(config1);
        System.out.println(config2);
    }


}


