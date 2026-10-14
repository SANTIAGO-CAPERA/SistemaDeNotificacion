
package model;

public class    WhastApp extends Notificaciones {

    @Override
    public void enviar() {
        System.out.println("Enviando WhastApp a " + destinatario + ": " + mensaje);
    }
}