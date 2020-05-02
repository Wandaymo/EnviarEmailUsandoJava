/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enviaremail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Wandaymo
 */
public class EnviarEmailUsandoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String enderecoEmail = "seu_email@gmail.com";
        String senha = "sua_senha";
        
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(enderecoEmail, senha));
        email.setSSLOnConnect(true);
        
        try {
            email.setFrom(enderecoEmail);
            email.setSubject("E-mail de teste");
            email.setMsg("Não se preocupe, este é um e-mail de teste enviado a partir de uma programinha feito em Java");
            email.addTo("email_destino");
            email.send();
            System.out.println("Email enviado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
