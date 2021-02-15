![Top](https://img.shields.io/github/languages/top/Spokequenouille/aclab2020)

# aclab2020

---

## Description du projet

Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla tempus laoreet tortor a gravida. Duis lacinia pretium rutrum. Donec nec sodales ipsum, id lobortis sapien. Phasellus ornare odio ut erat malesuada posuere. Sed consequat tellus metus, eu egestas justo condimentum sed. Curabitur vulputate nunc sapien, non molestie ex vulputate a. Nunc sed odio tellus.

## Developpeur de l'API

Johann DE ALMEIDA

---

## Installation et lancement

**N/A**

___

## Fonctionnalités

Sur l'api, il est possible d'effectuer les actions suivantes :

### Swagger (Api Documentation)

[Lien vers Swagger](http://localhost:8080/swagger-ui.html)

[Lien vers la documentation JSON](http://localhost:8080/v2/api-docs)

### Classes

- Créer une classe en envoyant à la route **/classes/add** les paramètres suivants : (**POST**)

    - dateClasse
    - duree
    - matiere_id
    - prof_id
    - promo_id
    - salle_id

- Afficher toutes les classes existantes en base via la route **/classes** (**GET**)

- Afficher une classe existante en base en renseignant son id via la route **/classes/{id}** (**GET**)

- Supprimer une classe existante en base en renseignant son id via la route **/classes/{id}** (**DELETE**)

- Modifier une classe existante en base en renseignant son id via la route **/classes/{id}** et en envoyant les paramètres suivants : (**PUT**)

    - dateClasse *(facultatif)*
    - duree *(facultatif)*
    - matiere_id *(facultatif)*
    - prof_id *(facultatif)*
    - promo_id *(facultatif)*
    - salle_id *(facultatif)*

### Informations

- Afficher les informations existantes en base via la route **/informations** (**GET**)

- Afficher une information existante en base en renseignant son id via la route **/informations/{id}** (**GET**)

- Créer une information en envoyant à la route **/informations/add** les paramètres suivants : (**POST**)

    - commentaire
    - dateInfoDeb
    - dateInfoFin
    - fichier
    - libInfo

- Supprimer une information existante en base en renseignant son id via la route **/informations/{id}** (**DELETE**)

- Modifier une information existante en base en renseignant son id via la route **/informations/{id}** et en envoyant les paramètres suivants : (**PUT**)

    - commentaire
    - dateInfoDeb
    - dateInfoFin
    - fichier
    - libInfo

### Matières

- Afficher les matières existantes en base via la route **/matieres** (**GET**)

- Afficher une matière existante en base en renseignant son id via la route **/matieres/{id}** (**GET**)

- Créer une matière en envoyant à la route **/matieres/add** les paramètres suivants : (**POST**)

    - idClasse
    - libMatiere

- Supprimer une matière existante en base en renseignant son id via la route **/matieres/{id}** (**DELETE**)

- Modifier une matière existante en base en renseignant son id via la route **/matieres/{id}** et en envoyant les paramètres suivants : (**PUT**)

    - libMatiere

### Professeurs

- Afficher les professeurs existants en base via la route **/professeurs** (**GET**)

- Afficher un professeur existant en base en renseignant son id via la route **/professeurs/{id}** (**GET**)

- Créer un professeur en envoyant à la route **/professeurs/add** les paramètres suivants : (**POST**)

    - nomProf
    - prenomProf

- Supprimer un professeur existant en base en renseignant son id via la route **/professeurs/{id}** (**DELETE**)

- Modifier un professeur existant en base en renseignant son id via la route **/professeurs/{id}** et en envoyant les paramètres suivants : (**PUT**)

    - nomProf
    - prenomProf

### Promotions

- Afficher les promotions existantes en base via la route **/promotions** (**GET**)

- Afficher une promotion existante en base en renseignant son id via la route **/promotions/{id}** (**GET**)

- Créer une promotion en envoyant à la route **/promotions/add** les paramètres suivants : (**POST**)

    - libPromo

- Supprimer une promotion existante en base en renseignant son id via la route **/promotions/{id}** (**DELETE**)

- Modifier une promotion existante en base en renseignant son id via la route **/promotions/{id}** et en envoyant les paramètres suivants : (**PUT**)

    - libPromo
    
---

### Collection Postman

Le fichier postman est à la racine du projet et a pour nom **aclab2020.postman_collection.json**.

--- 

### Sonar Cloud

**N/A**

[Lien vers Sonar Cloud]()

---

### CodeQL

**N/A**

---

### DependaBot

**N/A**