/*==============================================================*/
/* Nom de SGBD :  MySQL 5.0                                     */
/* Date de création :  22/11/2020 09:51:28                      */
/*==============================================================*/



/*==============================================================*/
/* Table : Informations                                         */
/*==============================================================*/
create table informations
(
   IdInfo               int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   LibInfo              varchar(254),
   Fichier              varchar(254),
   Commentaire          varchar(254),
   DateInfo             datetime
)ENGINE = InnoDB;

/*==============================================================*/
/* Table : Cours                                                */
/*==============================================================*/
create table matiere
(
   IdMatiere           int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   IdClasse             varchar(254) not null,
   LibMatiere           varchar(254)
)ENGINE = InnoDB;

/*==============================================================*/
/* Table : Professeur                                           */
/*==============================================================*/
create table Professeur
(
   IdProf               int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   NomProf              varchar(254),
   PrenomProf           varchar(254)
)ENGINE = InnoDB;

/*==============================================================*/
/* Table : Promotion                                            */
/*==============================================================*/
create table promotion
(
   IdPromo              int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   LibPromo             varchar(254)
)ENGINE = InnoDB;

/*==============================================================*/
/* Table : Salle                                                */
/*==============================================================*/
create table salle
(
   IdSalle              int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   LibSalle             varchar(254),
   NbrePlace            int,
   Adresse              varchar(254)
)ENGINE = InnoDB;

/*==============================================================*/
/* Table : Classe                                               */
/*==============================================================*/
create table classe
(
   IdClasse             int NOT NULL AUTO_INCREMENT PRIMARY KEY,
   DateClasse           datetime,
   HeureClasse          datetime,
   IdPromo_c            int not null,
   IdSalle_c            int not null,
   IdMatiere_c          int not null,
   IdProf_c             int not null,
   FOREIGN KEY (IdSalle_c) REFERENCES salle (IdSalle),
   FOREIGN KEY (IdPromo_c) REFERENCES promotion (IdPromo),
   FOREIGN KEY (IdProf_c) REFERENCES professeur(IdProf),
   FOREIGN KEY (IdMatiere_c) REFERENCES matiere (IdMatiere)
   
)ENGINE = InnoDB;