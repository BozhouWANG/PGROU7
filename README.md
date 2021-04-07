# Projet de groupe Centralien HCERES

## Application Spring

L'application permet à ce jour d'ajouter un chercheur, d'accéder à la liste des chercheurs existants et d'en supprimer.
Les identifiants de connexion pour se connecter en mode Admin, ils sont modifiables dans le fichier controller LoginController (dans les sources packages).

## Base de données

Le script de création de la base de donnée est dans le dossier du même nom.
Un script complémentaire d'inscription d'un chercheur et de son employeur sont également présents pour le fonctionnement minimal de l'application (sans avoir l'import des données).
Pour adapter le script à la base de donnée de l'utilisateur, changer le nom et le mot de passe dans le fichier "persistence.xml"

## Mails

Les fonctionnalités d'envois automatiques de mails pour rappeler aux chercheurs de remplir la base de données ne sont pas encore inclues dans l'application principale. 
Un dossier contenant nos avancées à ce jour sur ce sujet a donc été mis à part.

## Auteurs

Mathieu Rey-Herme, Bozhou Wang, Eva Le Flem, Irene Le Borgne, Nino Lambert
