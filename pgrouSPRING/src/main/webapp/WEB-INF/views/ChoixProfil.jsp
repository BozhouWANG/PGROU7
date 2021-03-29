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
        <<form action="login.do" method="GET" >  
            <li><button><a>Accueil</a></button></li>
        </form>
        <form action="newProfile.do" method="GET" >   
            <li><button><a>Nouveau Profil</a></button></li>
        </form>
        <form action="suppressionProfile.do" method="GET" >   
            <li><button><a>Supprimer Profil</a></button></li>
        </form> 
        <li><a>Extraction d'activités</a></li>
        <li><a>Ajout d'activités</a></li>
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