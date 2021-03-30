<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <h2 align = "center">Inscription d'un chercheur </h2>
        
        
        <form action="newChercheur.do" method="POST">
            <table align="center"> 
                <tr>
                    <td> Nom</td> 
                    <td><input type="text" name="nameResearcher" placeholder="Nom"/></td> 
                </tr> 
                
                <tr>
                    <td> Prénom</td> 
                    <td><input type="text" name="surnameResearcher" placeholder="Prénom"/></td> 
                </tr> 
                
                <tr>
                    <td> Numéro ORCID (*)</td> 
                    <td><input type="text" name="idOrcidResearcher" placeholder="Id"/></td> 
                </tr> 
                
                <tr>
                    <td> Nom de l'employeur (*)</td> 
                    <td><select name="idEmployer">
                            <c:forEach var="employer" items="${listEmployer}">
                                <option value="${employer.idEmployer}">${employer.nameEmployer}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td>Statut</td>
                    <td>
                        <select name="Statut">
                            <option value="Statut1" selected="selected">Statut1</option> 
                            <option value="Statut2" >Statut2</option> 
                        </select> 
                    </td> 
                </tr>
                
                <tr>
                    <td>Type de contrat</td>
                    <td>
                        <select name="contractType">
                            <option value="CDD" selected="selected">CDD</option> 
                            <option value="CDI" >CDI</option> 
                        </select> 
                    </td> 
                </tr>
                
                <tr>
                    <td> Fonction</td> 
                    <td><input type="text" name="function"/></td> 
                </tr>
                
                <tr>
                    <td> E-mail</td> 
                    <td><input type="text" name="emailAddress"/></td> 
                </tr>
                
                
                <tr>
                    <td>Encordrez vous un doctorant?</td> 
                    <td><input type="radio" name="encadreDoct" value="Oui"/>Oui
                        <input type="radio" name="encadreDoct" value="Non" />Non 
                    </td> 
                </tr> 
                
                <tr>
                    <td> Si oui, indique de qui il s'agit</td>
                    <td>
                    <select name="Quel_doctorant">
                            <option value="Nom_doctorant_1" selected="selected">Nom_doctorant_1</option> 
                            <option value="Nom_doctorant_2">Nom_doctorant_1</option> 
                            <option value="Nom_doctorant_3">Nom_doctorant_3</option> 
                    </select> 
                    </td>     
                </tr> 
                
                <tr>
                    <td> </td>
                    <td align="right"><input type="submit" value="Valider"/></td> 
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