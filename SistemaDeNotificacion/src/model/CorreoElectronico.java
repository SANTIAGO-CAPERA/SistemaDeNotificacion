
package model;

public class CorreoElectronico extends Notificaciones {

    @Override
    public void enviar() {
        System.out.println("Enviando Correo Electronico a " + destinatario + ": " + mensaje);
    }
}