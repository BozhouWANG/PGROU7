<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Publication</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/1.css">
    </head>
    <body>
        <ul class = "menuBar">
        <li><img src = "images/logo.png" width="192" height = "67" alt ="logo"/></li>
        <li><a>Accueil</a></li>
        <li><a>Mes activités</a></li>
        <li><a>Ajout d'activités</a></li>
        </ul>
         
        <h1 align = "center">Formulaire de saise d'activité</h1> 
        <h2 align = "center">Publication</h2>
        
        <form> 
            <table align="center"> 
                <tr>
                    <td> Date de publication：</td> 
                    <td><input type="text" name="Date de publication"/></td> 
                </tr>
                
                
                <tr>
                    <td>Language：</td>
                    <td>
                        <select name="Language">
                            <option value="Anglais" selected="selected">Anglais</option> 
                            <option value="Français">Français</option> 
                        </select> 
                    </td> 
                </tr>
                
                <tr>
                    <td>Authors：</td> 
                    <td><textarea rows="1" cols="100"></textarea></td> 
                </tr> 
                
                 <tr>
                    <td>Source：</td> 
                    <td><textarea rows="1" cols="100"></textarea></td> 
                </tr> 
                
                <tr>
                    <td>PMID：</td> 
                    <td><input type="text" name="PMID"></td> 
                </tr> 
                
                <tr>
                    <td>ImpactFactor：</td> 
                    <td><input type="text" name="ImpactFactor"></td> 
                </tr> 
                
                <tr>
                    <td> Description：</td> 
                    <td><textarea rows="10" cols="100"></textarea></td>
                </tr> 
                
                <tr>
                    <td>Clinique?</td> 
                    <td><input type="radio" name="Clinique" value="Oui"/>Oui
                        <input type="radio" name="Clinique" value="Non" />Non 
                    </td> 
                </tr> 
                
                <tr>
                    <td>PDC?</td> 
                    <td><input type="radio" name="PDC" value="Oui"/>Oui
                        <input type="radio" name="PDC" value="Non" />Non 
                    </td> 
                </tr> 
                
                <tr>
                    <td>Collaboration international?</td> 
                    <td><input type="radio" name="Collaborationinternational" value="Oui"/>Oui
                        <input type="radio" name="Collaborationinternational" value="Non" />Non 
                    </td> 
                </tr> 
                
                <tr>
                    <td>Collaboration au sein de l'IRTC?</td> 
                    <td><input type="radio" name="Collaboration" value="Oui"/>Oui
                        <input type="radio" name="Collaboration" value="Non" />Non 
                    </td> 
                </tr> 
                
                <tr>
                    <td> </td>
                    <td align="right"><input type="submit" value="Valider" onclick = "alert('Saisie réussie !')"/></td> 
                </tr> 
            </table> 
        </form>
    </body>
</html>