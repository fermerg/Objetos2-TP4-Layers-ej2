package ar.unrn.tp4.email;

import ar.unrn.tp4.modelo.Email;

import java.util.Properties;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
public class EmailSender implements Email {
        private String host = "sandbox.smtp.mailtrap.io";
        private String port = "25";
        private String username = "20303eaafd4445";
        private String password = "6a511b0f6a8f0f";
        private String from = "correoempresa@mail.com";
        private String to;


        public void enviarEmail(String emailEmpleado) {
            this.to = emailEmpleado;

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", this.host);
            props.put("mail.smtp.port", this.port);


            Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(username, password);
                }
            });
            try {
                Message message = new MimeMessage(session);
                message.setFrom(new InternetAddress(this.from));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(this.to));
                message.setSubject("Feliz cumpleaños!");
                message.setText("Lo saludamos en este dia tan especial.");
                Transport.send(message);
                System.out.println("Mensaje enviado satisfactoriamente");
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
        }
    }