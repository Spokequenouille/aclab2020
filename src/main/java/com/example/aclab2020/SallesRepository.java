package com.example.aclab2020;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SallesRepository extends JpaRepository<Salles, Integer> {
    // Résultat custom' avec query générée manuellement
    @Query(value = "SELECT * FROM salles WHERE id_salle = :id",
            nativeQuery = true)
    Salles getSalleByIdSalle(
            @Param("id") long id
    );
}
