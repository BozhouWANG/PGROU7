<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>AccueilAdmin</title>
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
        <li><a>Extraction d'activit�s</a></li>
        <li><a>Ajout d'activit�s</a></li>
    </ul>

    <div class="connexionInfos">
        <form action="index.do" method="GET">
            <p>Admin : Connect�</p>
            <input type="submit" value="D�connexion"/><br>
        </form>
    </div>
        
    <h1 class="headTitle">Page Administrateur</h1> 
       
    <table style="align: center" align="center" width="450px" height="150px">
        <tr>
            <td align="center">
                <form action="newProfile.do" method="GET" >
                    <button style="width:180px"><img class="smallIcon" src="images/add_user.png">Nouveau profil</button>
                </form>
            </td>
            <td align="center">
                <form action="newActivity.do" method="GET" >
                    <button style="width:180px"><img class="smallIcon" src="images/add.png">Ajout d'activit�</button>
                </form>
            </td>
        </tr>
        <tr>
            <td align="center" >
                <form action="suppressionProfile.do" method="GET" >
                    <button style="width:180px"><img class="smallIcon" src="images/delete.png">Supprimer profil</button>
                </form>
            </td>
            <td align="center"><button style="width:180px"><img class="smallIcon" src="images/extract.png">Extraction d'activit�s</button></td>
        </tr>
        </table>
    
    <div class="about">
        <form action="about.do" method="GET" >
            <input type="image" class="smallIcon" src="images/About.png" alt ="about"/>        
        </form>
    </div>
    
    </body>
</html>

