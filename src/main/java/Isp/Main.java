package Isp;

public class Main {
  public static void main(String[] args) {
    Contacto c = new Contacto();
    c.setName("Juan");
    c.setAddress("Calle 1");
    c.setEmailAddress("q@q.com");
    c.setTelephone("123456789");
    SMSSender.sendSMS(c, "Hola");
    EmailSender.sendEmail(c, "Hola");

  }
}
