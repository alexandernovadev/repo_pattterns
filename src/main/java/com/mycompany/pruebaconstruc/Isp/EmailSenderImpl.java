package com.mycompany.pruebaconstruc.Isp;

public class EmailSenderImpl implements EmailSender {
  @Override
  public void sendEmail(String emailAddress, String message) {
    // Código para enviar correo electrónico
    System.out.println("Enviando correo electrónico a " + emailAddress + " con el mensaje: " + message);
  }
}
