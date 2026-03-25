package Ejercicio2.modelo;

import Ejercicio2.interfaz.Notificacion;

public class EmailNotificacion implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}