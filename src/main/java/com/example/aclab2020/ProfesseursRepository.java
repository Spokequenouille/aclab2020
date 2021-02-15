package com.example.aclab2020;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProfesseursRepository extends JpaRepository<Professeurs, Integer> {
    // Résultat custom' avec query générée manuellement
    @Query(value = "SELECT * FROM professeurs WHERE id_prof = :id",
            nativeQuery = true)
    Professeurs getProfByIdProf(
            @Param("id") long id
    );
}
