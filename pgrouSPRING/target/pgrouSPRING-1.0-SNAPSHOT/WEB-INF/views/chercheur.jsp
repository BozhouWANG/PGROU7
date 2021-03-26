<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Chercheur</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/1.css">
    </head>
    <body>
        <ul class = "menuBar">
            <li><img id = "logo" src = "images/logo.png" alt ="logo"/></li>
            <li><a>Accueil</a></li>
            <li><a>Nouveau Profil</a></li>
            <li><a>Supprimer Profil</a></li>
            <li><a>Extraction d'activités</a></li>
            <li><a>Ajout d'activités</a></li>
        </ul>
        
        <table align="center">
        <tr>
        <td><img src = "images/add_user.png" width="60" height = "60" alt ="user"/></td>
        <td><h1 align = "center">Ajout de profil </h1></td> 
        </tr>
        </table>
        <h2 align = "center">Inscription d'un chercheur </h2>
        
        <form> 
            <table align="center"> 
                <tr>
                    <td> Nom</td> 
                    <td><input type="text" name="Nom" placeholder="Nom"/></td> 
                </tr> 
                
                <tr>
                    <td> Prénomš</td> 
                    <td><input type="text" name="Prénom" placeholder="Prénom"/></td> 
                </tr> 
                
                <tr>
                    <td> Numéro ORCIDš</td> 
                    <td><input type="text" name="Id" placeholder="Id"/></td> 
                </tr> 
                
                <tr>
                    <td> Nom de l'employeur</td> 
                    <td><input type="text" name="Nom de l'employeur"/></td> 
                </tr>
                
                <tr>
                    <td>Statut</td>
                    <td>
                        <select name="Statut">
                            <option value="Statut1" selected="selected">Statut1</option> 
                            <option value="Statut2">Statut2</option> 
                        </select> 
                    </td> 
                </tr>
                
                <tr>
                    <td>Type de contrat</td>
                    <td>
                        <select name="Type de contrat">
                            <option value="CDD" selected="selected">CDD</option> 
                            <option value="CDI">CDI</option> 
                        </select> 
                    </td> 
                </tr>
                
                <tr>
                    <td> Fonction</td> 
                    <td><input type="text" name="Fonction"/></td> 
                </tr>
                
                <tr>
                    <td> E-mail</td> 
                    <td><input type="text" name="E-mail"/></td> 
                </tr>
                
                <tr>
                    <td>Encordrez vous un doctorant?</td> 
                    <td><input type="radio" name="radio" value="Oui"/>Oui
                        <input type="radio" name="radio" value="Non" />Non 
                    </td> 
                </tr> 
                
                <tr>
                    <td> Si oui, indique de qui il s'agit</td>
                    <td>
                    <select name="Quel doctorant">
                            <option value="Nom_doctorant_1" selected="selected">Nom_doctorant_1</option> 
                            <option value="Nom_doctorant_2">Nom_doctorant_1</option> 
                            <option value="Nom_doctorant_3">Nom_doctorant_3</option> 
                    </select> 
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