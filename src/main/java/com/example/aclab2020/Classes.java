package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdClasse;
    private String DateClasse;
    private String HeureClasse;
    @ManyToOne
    @JoinColumn(name = "promo_id", referencedColumnName = "IdPromo", nullable = false)
    private Promotions promotions;
    @ManyToOne
    @JoinColumn(name = "salle_id", referencedColumnName = "IdSalle", nullable = false)
    private Salles salles;
    @ManyToOne
    @JoinColumn(name = "matiere_id", referencedColumnName = "IdMatiere", nullable = false)
    private Matieres matieres;
    @ManyToOne
    @JoinColumn(name = "prof_id", referencedColumnName = "IdProf", nullable = false)
    private Professeurs professeurs;


}
