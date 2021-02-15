# Lancer le projet 

Dans le dossier `projet_tele` lancez la commande `docker-compose up`

# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).


PROJET AC’LAB 2020

PARTICIPANTS
Sebastien GUIDEZ, Johann DE ALMEIDA, Etiam AYEDZE, Denis D’ALMEIDA, Youssef TOUGGANI, Nicolas LEPINETTE, Antoine SCHULZ
Lien Git & Trello
Voici le lien de notre projet git:
https://github.com/Spokequenouille/aclab2020.git
https://trello.com/b/ba6Txxkc/aclab
PROJET
Le sujet choisi est la refonte des affichages de l'université catholique de Lille.
Actuellement, de nombreux moniteurs sont inactifs ou mal utilisés.
Le but serait d'améliorer le système déjà en place, en réduisant la technologie utilisée au travers de Raspberry Pi 3B+.
Ce choix de hardware permettra également l’export rapidement et facilement sur tout nouveau moniteur qui viendrait à être ajouté.
Ces derniers viendront se connecter, à leur démarrage, à une interface WEB et afficheront la page correspondante.
La page devra être modulaire, elle intégrera différents modules tels que :
- la météo (récupéré via le site de Météo FRANCE)
- un flux rss de news
- un flux vidéo
- les emplois du temps
- images
- diaporama

Si possible les modules seront conditionnés en fonction du Raspberry PI utilisé, via le serveur distant.
Imaginons qu'un moniteur soit proche d'une salle, il pourrait afficher l'occupation de la salle par intermittence si celui-ci n'a rien d'autre à afficher.
Il pourra également être intéressant d'afficher des news pertinentes en fonction du département dans lequel le moniteur se trouve.
Si le moniteur se trouve du côté Ac’Lab, les news pourront être centrées sur l'association alors que si le moniteur se trouve près des bureaux, des informations administratives pourraient paraître.
Le logo de la faculté sera affiché dans le coin inférieur gauche du moniteur.
On pourra y voir des informations plus communes comme la date de l'heure dans le coin opposé.
TECHNOLOGIES UTILISÉES 


Côté Développeur :
- bash
    Bash nous sera utile pour communiquer avec le Raspberry Pi 3B+. Entre autres pour exécuter le script au lancement du microprocesseur.
- SSH
    Également pour se connecter au Raspberry et communiquer avec, il faudra donc au préalable autoriser la communication SSH
- REACT
    Ce sont des frameworks qui ont une grosse communauté et qui auront donc une documentation conséquente. Ils ont de l’avenir grâce à l’utilisation des composants. C’est donc intéressant de travailler avec car nous pouvons être amenées à les utiliser avec une entreprise à l’avenir. Ils sont aussi considérés comme des frameworks performants et stables.
- DOCKER Compose
Tout le monde n’utilise pas windows dans notre groupe. Cela nous permet d’avoir une même configuration pour travailler. Docker exploite et partage le kernel du système d’exploitation de l’hôte. Cela le rend très efficace en termes d’utilisation des ressources du système. Combiné avec docker-compose il est possible de déployer toute une application et ses dépendances avec une seule commande.
- Github (Git)
    Nous l’utiliserons comme dépôt pour notre projet. Cela permettra à chacun d'interagir avec le projet et de proposer un rendu.
- XML/Json (pour la récupération de données en temps réel ex: météo)
- jq : permet de parser les Jsons reçu via les appels curl
- Mariadb
    Mariadb est facile à utiliser, APi disponibles, open-source, sécurisé et gratuit, de plus il ne dépend pas d’un OS en particulier.
- curl
Curl permet de faire des appels API et de récupérer des datas (GET, PUT, POST).
