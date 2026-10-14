package main;

import client.NotificacionServicio;
import factory.NotificacionFactory;
import factory.TipoNotificacion; 

public class Main {
    public static void main(String[] args) {
      
        NotificacionFactory factory = new NotificacionFactory();

        NotificacionServicio servicio = new NotificacionServicio(factory);

        System.out.println("prueba de sistema de notificaciones\n");

        servicio.enviarNotificacion("EMAIL", "pepe@gmail.com", "Tu pedido ha sido despachado.");
        System.out.println("-------------------------------------------");
        servicio.enviarNotificacion("WHATSAPP", "3001234567", "El codigo de verificación es 8492.");
        System.out.println("-------------------------------------------");
        servicio.enviarNotificacion("SMS", "3119876543", "Recordatorio: Cita mañana es a las 10:00 AM.");
        System.out.println("-------------------------------------------");
    }
}