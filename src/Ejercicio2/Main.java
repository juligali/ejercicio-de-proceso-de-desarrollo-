package Ejercicio2;

import Ejercicio2.Factory.NotificacionFactory;
import Ejercicio2.interfaz.Notificacion;

public class Main {

    public static void main(String[] args) {

        Notificacion noti1 = NotificacionFactory.crearNotificacion("EMAIL");
        noti1.enviar("Bienvenido a la universidad");

        Notificacion noti2 = NotificacionFactory.crearNotificacion("SMS");
        noti2.enviar("Tenés un nuevo mensaje");

        Notificacion noti3 = NotificacionFactory.crearNotificacion("WHATSAPP");
        noti3.enviar("Recordatorio de examen");
    }
}// lo que hace el factory es que el main  no sabe quw clase se crea.
// la clase factory encapsula los new
// sin factory el new estaria en el main