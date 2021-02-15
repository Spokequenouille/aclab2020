package com.example.aclab2020.matieres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MatieresRepository extends JpaRepository<Matieres, Integer> {
    // Résultat custom' avec query générée manuellement
    @Query(value = "SELECT * FROM matieres WHERE id_matiere = :id",
            nativeQuery = true)
    Matieres getMatiereByIdMatiere(
            @Param("id") long id
    );
}
