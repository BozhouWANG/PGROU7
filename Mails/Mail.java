package centrale.pgrou.pgrou;

import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eva
 */
//mail : crti-u1064_itun@univ-nantes.fr
public class Mail {
    private String objet;
    private String contenu;
    
    public Mail(){}
    public Mail(String object, String texte){
        this.objet=object;
        this.contenu=texte;
    }
    
    //setters et getters
    public String getObjet(){
        return objet;
    }
    public String getContenu(){
        return contenu;
    }
    public void setObjet(String object){
        this.objet = object;
    }
    public void setContenu(String texte){
        this.contenu = texte;
    }
    
    //dépendance Maven avec JavaMail
    /*l'envoi du message se fait en trois étapes :
        1 -> création d'une Session ;
        2 -> création d'un objet Message, auquel nous ajoutons les destinataires ;
        3 -> envoi du message, grâce à un objet Transport.*/
    public static void sendMail(String destinataire, Date d) throws MessagingException {
        // 1 -> Création de la session
        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtp");
        //mail.smtp.host = serveur de mail, à demander 
        properties.setProperty("mail.smtp.host", "localhost");
        //nom de l'utilisateur pour se connecter au serveur de mail
        properties.setProperty("mail.smtp.user", " ");
        //adresse par défaut de l'expéditeur
        properties.setProperty("mail.from", "crti-u1064_itun@univ-nantes.fr");
        Session session = Session.getInstance(properties);

        // 2 -> Création d'un message
        MimeMessage message = new MimeMessage(session);
        String texte = this.getContenu();
        String objet = this.getObjet();
        try {
            message.setText(texte);
            message.setSubject(objet);
            message.setSentDate(d);
            message.setRecipients(Message.RecipientType.TO, destinataire);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        // 3 -> Envoi du message
        Transport.send(message);

    }
//pb, comment lancer la méthode récurrence tous les jours ?

}
