INSERT INTO professeurs(nom_prof,prenom_prof)
SELECT * FROM (
    SELECT 'CIUBACIUC' as "nom_prof",'Diana' as "prenom_prof" UNION
    SELECT 'BEAUSSART' as "nom_prof", 'Nicolas' as "prenom_prof"
    ) x WHERE NOT EXISTS(
        SELECT * FROM professeurs
        );
INSERT INTO promotions(lib_promo)
SELECT * FROM (
    SELECT 'Master III, 1ère année' as "lib_promo" UNION
    SELECT 'Licence 3 Sciences du Numérique' as "lib_promo"
    ) y WHERE NOT EXISTS(
        SELECT * FROM promotions
    );
INSERT INTO salles(adresse,lib_salle,nbre_places)
SELECT * FROM (
    SELECT '46 rue du port' as "adresse",'RZ205' as "lib_salle",45 as "nbre_places" UNION
    SELECT '47 rue du port' as "adresse",'RS203' as "lib_salle",25 as "nbre_places"
    ) z WHERE NOT EXISTS(
        SELECT * FROM salles
    );
INSERT INTO informations(lib_info,fichier,commentaire,date_info_deb,date_info_fin)
SELECT * FROM (
    SELECT 'Nuit de l info' as "lib_info",null as "fichier",'1ère édition' as "commentaire",'2020-12-03 16:39:00' as "date_info_deb",'2020-12-04 08:02:00' as "date_info_fin" UNION
    SELECT 'Nuit de l info' as "lib_info",null as "fichier",'2ème édition' as "commentaire",'2021-12-03 16:39:00' as "date_info_deb",'2020-12-04 08:02:00' as "date_info_fin"
    ) a WHERE NOT EXISTS(
        SELECT * FROM informations
    );
INSERT INTO matieres(id_classe,lib_matiere)
SELECT * FROM (
    SELECT 1 as "id_classe",'Anglais' as "lib_matiere" UNION
    SELECT 2 as "id_classe",'Mathématiques' as "lib_matiere"
    ) b WHERE NOT EXISTS(
        SELECT * FROM matieres
    );
INSERT INTO classes(date_classe,duree,matiere_id,prof_id,promo_id,salle_id)
SELECT * FROM (
    SELECT '2021-01-04 08:00:00',2.0 as "duree" ,1 as "matiere_id",1 as "prof_id",1 as "promo_id",1 as "salle_id" UNION
    SELECT '2021-01-05 08:00:00',2.0 as "duree" ,2 as "matiere_id",2 as "prof_id",2 as "promo_id",2 as "salle_id"
    ) c WHERE NOT EXISTS(
        SELECT * FROM classes
    );