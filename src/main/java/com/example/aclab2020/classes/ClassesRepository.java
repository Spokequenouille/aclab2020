package com.example.aclab2020.classes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClassesRepository extends JpaRepository<Classes, Integer> {
    // Résultat custom' avec query générée manuellement
    @Query(value = "SELECT * FROM classes WHERE id_classe = :id",
            nativeQuery = true)
    Classes getClasseByIdClasse(
            @Param("id") long id
    );
}
