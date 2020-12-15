package com.example.aclab2020;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdClasse;
    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private Date DateClasse;
    private float Duree;
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
