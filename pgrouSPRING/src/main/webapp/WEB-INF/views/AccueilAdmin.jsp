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
        <li><a>Accueil</a></li>
        <li><a>Nouveau Profil</a></li>
        <li><a>Supprimer Profil</a></li>
        <li><a>Extraction d'activités</a></li>
        <li><a>Ajout d'activités</a></li>
    </ul>

    <h1 class="headTitle">Page Administrateur</h1> 
       
    <table style="align: center" align="center" width="450px" height="150px">
        <tr>
            <td align="center">
                <form action="newProfile.do" method="GET" >
                    <button style="width:180px"><img class="smallIcon" src="images/add_user.png">Nouveau profil</button>
                </form>
            </td>
            <td align="center"><button style="width:180px"><img class="smallIcon" src="images/add.png">Ajout d'activité</button></td>
        </tr>
        <tr>
            <td align="center" ><button style="width:180px"><img class="smallIcon" src="images/delete.png">Supprimer profil</button></td>
            <td align="center"><button style="width:180px"><img class="smallIcon" src="images/extract.png">Extraction d'activités</button></td>
        </tr>
        </table>
    </body>
</html>

