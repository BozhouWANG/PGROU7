<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Intranet CRTI</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/1.css">
</head>
<body>
    <ul class = "menuBar">
        <li><img id = "logo" src = "images/logo.png" alt ="logo"/></li>
    </ul>

    <div class="connexionInfos">
        <p>Connexion</p>
        <form action="login.do" method="POST">
            <input type="text" value="Username" /><br>
            <input type="password" value="Password"/><br>
            <input type="submit" value="Valider"/><br>
        </form>
        <a href="#">Mot de passe oublié ?</a>
    </div>

    <h1 class="headTitle">
        Intranet CRTI
    </h1>
    <div class="mainInfos">
        <p>Bienvenue sur l'espace interne des chercheurs de l'université de Nantes</p>
    </div>

    <div class="mainInfos">
        <P>Informations relatives à l'intranet à modifier ?</P>
    </div>

    <p class="about" action="about.do" method="POST">
        <img class="smallIcon" src="images/About.png" alt ="about"/>
    </p>

</body>