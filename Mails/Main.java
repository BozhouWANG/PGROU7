package centrale.pgrou.pgrou;

import static java.lang.System.in;
import java.util.Date;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author eva
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        //for (SELECT DateEcheance in String object = "SELECT Object
        //connection à la base de données (besoin de l'url, login, mdp)
        String dbUrl = "...";
        Connection con = DriverManager.getConnection(dbUrl, "login", "mdp");

        //récupération de l'objet et du contenu du mail de base
        ResultSet resultat1 = null;
        String requete1 = "SELECT objet,contenu FROM mail";
        try {
            Statement stmt1 = con.createStatement();
            resultat1 = stmt1.executeQuery(requete1);
        } catch (SQLException e) {
            //traitement de l'exception
        }
        String objet = resultat1.getString("objet");
        String texte = resultat1.getString("contenu");
        Mail mail = new Mail(objet, texte);
        
        //recuperation de la liste de destinataires
        ResultSet resultat2 = null;
        //on récupère une liste de toutes les dates de dernier remplissage et des mails des chercheurs correspondants
        String requete2 = "SELECT dateDernierRemplissage, mail FROM chercheur";
        Statement stmt2 = con.createStatement();
        resultat2 = stmt2.executeQuery(requete2);
        //date d'aujourd'hui
        Date aujourdHui = new Date();
        //on envoie un mail à tous les chercheurs qui ont dépassé le délais
        //delais de 2 mois
        Date delais = new Date(0000,02,00);
        resultat2.next();
        //on se trouve sur la premiere ligne
        //traitement de la première ligne ... 
        while(resultat2.next()){ 
        //traitement des lignes du résultat de la requête  
} 
        for (ResultSet res in resultat2) {
            if ((aujourdHui - res.getDate("dateDernierRemplissage")) > delais) {
                String destinataire = res.getColumn(2);
                mail.sendMail(destinataire, aujourdHui);
            }
        }
    }
}
