package Isp;

public class EmailSender {
  public static void sendEmail(Contacto c, String message) {
    // Envía un mensaje la direccion de correo del Contacto c.

    System.out.println("Enviando correo a " + c.getEmailAddress() + " con el mensaje: " + message);

  }
}