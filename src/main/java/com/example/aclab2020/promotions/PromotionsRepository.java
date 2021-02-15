package com.example.aclab2020.promotions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PromotionsRepository extends JpaRepository<Promotions, Integer> {
    // Résultat custom' avec query générée manuellement
    @Query(value = "SELECT * FROM promotions WHERE id_promo = :id",
            nativeQuery = true)
    Promotions getPromoByIdPromo(
            @Param("id") long id
    );
}
