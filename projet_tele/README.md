# Lancer le projet 

Dans le dossier `projet_tele` lancez la commande `docker-compose up`

# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).


# Installation de la BD

Dans le dossier `projet_tele` lancez la commande `docker-compose up`

La dernier version de mariadb sera installé dans votre conteneur.

mariadb ne possédant pas d'interface graphique, vous allez devoir télécharger HeidiSQL pour exécuter les scripts et faire les manips.
Vous pouvez télécharger HeidiSQL sur le lien suivant: https://www.heidisql.com/download.php?download=installer

Lancer HeidiSQL pendant que votre conteneur est en train de tourner, créer une nouvelle session:
- le type de réseau MySQL (TCP/IP)
- Library: libmariadb.dll
- Nom de l'hôte: 127.0.0.1
- utilisateur: root
- password: secret (il est configuré ainsi par défaut dans le docker-compose)

Lorsque la session est ouverte créez une nouvelle base de données et exécutez le contenu du fichier dbscript.sql 

