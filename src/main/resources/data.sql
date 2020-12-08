INSERT INTO matieres(id_matiere,id_classe,lib_matiere)
VALUES(1,1,"Anglais");
INSERT INTO professeurs(id_prof,nom_prof,prenom_prof)
VALUES(1,"CIUBACIUC","Diana");
INSERT INTO promotions(id_promo,lib_promo)
VALUES(1,"Master III, 1ère année");
INSERT INTO salles(id_salle,adresse,lib_salle,nbre_place)
VALUES(1,"46 rue du port","RZ205",45);
INSERT INTO classes(id_classe,date_classe,heure_classe,matiere_id,prof_id,promo_id,salle_id)
VALUES(1,'2021-01-04','08:00:00',1,1,1,1);