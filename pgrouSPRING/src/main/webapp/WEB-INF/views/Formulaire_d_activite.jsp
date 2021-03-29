<!DOCTYPE html>
<html>
    <head>
        <title>Formulaire de saise d'activit�</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/1.css">
    </head>

    <body>
        <ul class = "menuBar">
            <li><img id = "logo" src = "images/logo.png" alt ="logo"/></li>
            <li><a>Accueil</a></li>
            <li><a>Mes Activit�s</a></li>
            <li><a>Ajout d'activit�s</a></li>
        </ul>

        <h1 align = "center">Formulaire de saise d'activit� </h1>

        <table align="center"> 
            <tr>
                <td> Veuillez s�lectionner une activit�</td>
                <td> 
                    <select name="select1" onmousedown="if(this.options.length>4){this.size=5;}"  onchange='this.size=0;' onblur="this.size=0;"> 
                    <option value="1">Publification</option>
                    <option value="2">Book</option>
                    <option value="3">Platform</option>
                    <option value="4">R�seau</option>
                    <option value="5">Expertise</option>
                    <option value="6">Lab Evalution</option>
                    <option value="7">...</option>
                   </select>
                </td> 
            </tr>
        </table>
        
        <div class="about">
            <form action="about.do" method="GET" >
                <input type="image" class="smallIcon" src="images/About.png" alt ="about"/>        
            </form>
        </div>
        
    </body>
</html>
