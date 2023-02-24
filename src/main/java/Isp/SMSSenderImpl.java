package Isp;

public class SMSSenderImpl implements SMSSender {
  @Override
  public void sendSMS(String telephone, String message) {
    // Código para enviar SMS
    System.out.println("Enviando SMS a " + telephone + " con el mensaje: " + message);
  }
}