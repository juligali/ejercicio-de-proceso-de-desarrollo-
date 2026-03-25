package Ejercicio2.Factory;

import Ejercicio2.interfaz.Notificacion;
import Ejercicio2.modelo.EmailNotificacion;
import Ejercicio2.modelo.SMSNotificacion;
import Ejercicio2.modelo.WhatsAppNotificacion;

public class NotificacionFactory {

    public static Notificacion crearNotificacion(String tipo) {

        switch (tipo.toUpperCase()) {
            case "EMAIL":
                return new EmailNotificacion();
            case "SMS":
                return new SMSNotificacion();
            case "WHATSAPP":
                return new WhatsAppNotificacion();
            default:
                throw new IllegalArgumentException("Tipo no válido");
        }
    }
}