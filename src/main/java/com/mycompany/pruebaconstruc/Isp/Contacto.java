package com.mycompany.pruebaconstruc.Isp;

public class Contacto implements EmailSender, SMSSender {
  String name, address, emailAddress, telephone;

  @Override
  public void sendEmail(String emailAddress, String message) {
    // Código para enviar correo electrónico
  }

  @Override
  public void sendSMS(String telephone, String message) {
    // Código para enviar SMS
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void setAddress(String a) {
    address = a;
  }

  public String getAddress() {
    return address;
  }

  public void setEmailAddress(String ea) {
    emailAddress = ea;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setTelephone(String t) {
    telephone = t;
  }

  public String getTelephone() {
    return telephone;
  }
}
