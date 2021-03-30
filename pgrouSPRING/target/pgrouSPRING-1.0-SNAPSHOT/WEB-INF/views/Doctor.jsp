<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Doctor</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/1.css">
    </head>
    <body>
        <ul class = "menuBar">
            <li><img id = "logo" src = "images/logo.png" alt ="logo"/></li>
            <form id="accueilForm" action="login.do" method="GET" >  
                <li><a onclick="document.getElementById('accueilForm').submit();">Accueil</a></li>
            </form>
            <form id="newProfileForm" action="newProfile.do" method="GET" >   
                <li><a onclick="document.getElementById('newProfileForm').submit();">Nouveau Profil</a></li>
            </form>
            <form id="suppProfileForm" action="suppressionProfile.do" method="GET" >   
                <li><a onclick="document.getElementById('suppProfileForm').submit();">Supprimer Profil</a></button></li>
            </form> 
            <li><a>Extraction d'activités</a></li>
            <li><a>Ajout d'activités</a></li>
        </ul>
        
        <div class="connexionInfos">
            <form action="index.do" method="GET">
                <p>Admin : Connecté</p>
                <input type="submit" value="Déconnexion"/><br>
            </form>
        </div>
        
        <table align="center">
        <tr>
        <td><img src = "images/add_user.png" width="60" height = "60" alt ="user"/></td>
        <td><h1 align = "center">Ajout de profil </h1></td> 
        </tr>
        </table>
        <h2 align = "center">Inscription d'un doctorant </h2>
        
        <form> 
            <table align="center"> 
                <tr>
                    <td> Nom</td> 
                    <td><input type="text" name="Nom" placeholder="Nom"/> </td> 
                </tr> 
                
                <tr>
                    <td> Prénom</td> 
                    <td><input type="text" name="Prénom" placeholder="Prénom"/></td> 
                </tr> 
                
                <tr>
                    <td> Numéro ORCID(pas obligatoire)</td> 
                    <td><input type="text" name="Id" placeholder="Id"/></td> 
                </tr> 
                
                <tr>
                    <td> Date soutenance</td> 
                    <td><input type="date" name="Date soutenance"/></td> 
                </tr>
                
                <tr>
                    <td> Durée thèse</td> 
                    <td><input type="text" name="Durée thèse" placeholder="Nb de mois"/></td> 
                </tr>
                
                <tr>
                    <td> Devenir</td> 
                    <td><input type="text" name="Devenir" /></td> 
                </tr>
                
                <tr>
                    <td>Combien avez-vous d'encadrants?</td>
                    <td><input type="text" name="Nombre" placeholder="Nombre"/></td>
                </tr> 
                
                <tr>
                    <td>Encadrant 1</td>
                    <td><input type="text" name="Nom" placeholder="Nom"/></td>
                    <td><input type="text" name="Prénom" placeholder="Prénom"/></td>
                </tr> 
                
                <tr>
                    <td>Encadrant 2</td>
                    <td><input type="text" name="Nom" placeholder="Nom"/></td>
                    <td><input type="text" name="Prénom" placeholder="Prénom"/></td>
                </tr> 

                <tr>
                    <td> </td>
                    <td> </td>
                    <td align="right"><input type="submit" value="Valider" onclick = "alert('Saisie réussie !')"/></td> 
                </tr> 
            </table> 
        </form>
        
        <div class="about">
            <form action="about.do" method="GET" >
                <input type="image" class="smallIcon" src="images/About.png" alt ="about"/>        
            </form>
        </div>
        
    </body>
</html>