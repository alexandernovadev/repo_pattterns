package Isp;

public class SMSSender {
  public static void sendSMS(Contacto c, String message) {
    // Envía un mensaje SMS al teléfono del Contacto c.

    System.out.println("Enviando SMS al número " + c.getTelephone() + " con el mensaje: " + message);

  }
}