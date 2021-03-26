<!DOCTYPE html>
<html>
<head>
    <title>Ajout Profil</title>
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
        <li><a>Extraction d'activit�s</a></li>
        <li><a>Ajout d'activit�s</a></li>
    </ul>


    <h1 class="headTitle"><img id="teamIcon" src="images/user.png"> Ajout de profil </h1>

    <div class="mainInfos">
        <P>Choisissez le profil que vous voulez ajouter :</P>
    </div>

    <div class="listeEquipe">
        <form action="newDoctorant.do" method="GET" >
            <input type="submit" value="Doctorant" />
        </form>
        <form action="newChercheur.do" method="GET" >
            <input type="submit" value="Chercheur" />
        </form>
    </div>  
    
    <p class="about">
        <img class="smallIcon" src="images/About.png" alt ="about"/>
    </p>

</body>