<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Profile Suppression</title>
        <meta charset="utf-8">
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


        <h1 class="headTitle"> Suppression de profil </h1>

        <div class="mainInfos">
            <P>Choisissez le profil que vous voulez supprimer</P>
        </div>
        
        <div class="listeEquipe">
            <table border style="width: 250px" cellspacing="0" class="table">
                <caption><h2><img id="teamIcon" src="images/team.png" alt ="team"/>Liste des chercheurs</h2></caption>
                <tbody>
                <c:forEach var="researcher" items="${listResearchers}">
                    <tr>
                        <td>${researcher.surnameResearcher} ${researcher.nameResearcher}</td>
                        <td>
                            <form action="delete.do" method="POST">
                                <input type="hidden" name="id" value="${researcher.idOrcidResearcher}" />
                                <button onClick="confirmer()"><img src="images/delete.png" width="30px"/>Supprimer</button>
                            </form>  
                        </td>
                    </tr>   
                </c:forEach>
            </table>
        </div>

        <p class="about">
            <img class="smallIcon" src="images/About.png" alt ="about"/>
        </p>
    </body>
</html>