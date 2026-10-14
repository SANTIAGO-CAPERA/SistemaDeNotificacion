package factory;

import model.Notificaciones;
import model.CorreoElectronico;
import model.WhastApp;
import model.Sms;

public class NotificacionFactory {

    public Notificaciones createNotificacion(String type) {
        if (type == null) {
            throw new IllegalArgumentException("El tipo de notificación no puede ser nulo");
        }

        return switch (type.toUpperCase()) {
            case "EMAIL" -> new CorreoElectronico();
            case "WHATSAPP" -> new WhastApp();
            case "SMS" -> new Sms();
            default -> throw new IllegalArgumentException("Tipo de notificación no soportado: " + type);
        };
    } 
}