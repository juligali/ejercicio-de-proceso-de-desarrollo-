package Ejercicio2.modelo;

import Ejercicio2.interfaz.Notificacion;

public class WhatsAppNotificacion implements Notificacion {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando WhatsApp: " + mensaje);
    }
}
