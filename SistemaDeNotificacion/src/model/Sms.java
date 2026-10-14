
package model;

public class Sms extends Notificaciones {

    @Override
    public void enviar() {
        System.out.println("Enviando txt a " + destinatario + ": " + mensaje);
    }
}
