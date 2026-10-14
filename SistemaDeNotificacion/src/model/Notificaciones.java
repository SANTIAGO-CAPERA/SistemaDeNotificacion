package model;

public abstract class Notificaciones {
    protected String destinatario;
    protected String mensaje;
    public void preparar(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    public abstract void enviar();
    public void registrarLog() {
        System.out.println("Notificación procesada hacia: " + destinatario);
    }
}