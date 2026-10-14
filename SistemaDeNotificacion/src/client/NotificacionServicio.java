
package client;

import factory.NotificacionFactory;
import model.Notificaciones;

public class NotificacionServicio {
    NotificacionFactory factory;

    public NotificacionServicio(NotificacionFactory factory) {
        this.factory = factory;
    }

    public Notificaciones enviarNotificacion(String type, String destinatario, String mensaje) {
        Notificaciones notificacion;

        notificacion = factory.createNotificacion(type);

        notificacion.preparar(destinatario, mensaje);
        notificacion.enviar();
        notificacion.registrarLog();

        return notificacion;
    }

}