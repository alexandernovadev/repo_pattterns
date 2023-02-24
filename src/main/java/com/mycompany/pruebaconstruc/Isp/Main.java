package com.mycompany.pruebaconstruc.Isp;

public class Main {
  public static void main(String[] args) {
    Contacto c = new Contacto();
    c.setName("Juan");
    c.setAddress("Calle 1");
    c.setEmailAddress("q@q.com");
    c.setTelephone("123456789");

    EmailSender emailSender = new EmailSenderImpl();
    emailSender.sendEmail(c.getEmailAddress(), "Hola");

    SMSSender smsSender = new SMSSenderImpl();
    smsSender.sendSMS(c.getTelephone(), "Hola");

    // Gmail
    GmailAccount gmailAccount = new GmailAccount();
    gmailAccount.setName("John Smith");
    gmailAccount.setEmailAddress("johnsmith@gmail.com");

    EmailSender emailSenderMail = new EmailSenderImpl();
    emailSenderMail.sendEmail(gmailAccount.getEmailAddress(), "Hello from Java!");
  }
}

/**
 * 
 * 
 * 1. ¿Qué información necesitan las clases EmailSender y SMSSender de la clase
 * Contacto
 * para realizar su tarea, y qué información recogen? Consideras que incumplen
 * en
 * principio ISP.
 * 
 * Las clases EmailSender y SMSSender necesitan conocer la dirección de correo
 * electrónico y
 * el número de teléfono, respectivamente, de un objeto de la clase Contacto
 * para poder enviar
 * un correo electrónico o un mensaje SMS. Estas clases recogen esta información
 * a través
 * de los métodos getEmailAddress y getTelephone, respectivamente, definidos en
 * la clase Contacto.
 * 
 * En principio, se podría decir que estas clases no cumplen con el principio
 * ISP
 * (Principio de Segregación de Interfaces) ya que están dependiendo de una gran
 * cantidad
 * de información innecesaria de la clase Contacto, lo cual podría ser
 * problemático en el
 * futuro si se quisieran añadir nuevos métodos a la interfaz Contacto que no
 * sean necesarios
 * para estas clases.
 * 
 * 
 * 
 * 2. Refactoriza las clases anteriores, sustituyendo el parámetro Contacto, por
 * una interfaz.
 * Esta interfaz tendrá los métodos necesarios para acceder a la información que
 * necesita
 * en método. Modifica también la clase Contacto.
 * 
 * TASK DONE
 * 3. Piensa que después de refactorización, la clase GmailAccount (con alguna
 * modificación)
 * podrá ser enviada a la clase EmailSender pero no a la clase SMSSender.
 * public class GmailAccount {
 * String name, emailAddress;
 * }
 * Crea un programa que permita invocar al método sendEmail de la clase
 * EmailSender con
 * un objeto de la clase GmailAccount.
 * 
 * TASK DONE
 */