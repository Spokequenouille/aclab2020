package com.example.aclab2020;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InformationsRepository extends JpaRepository<Informations, Integer>{
    // Résultat custom' avec query générée manuellement
    @Query(value = "SELECT * FROM informations WHERE id_info = :id",
            nativeQuery = true)
    Informations getInfoByIdInfo(
            @Param("id") long id
    );
}
