package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Classes {
    @Id
    private int IdClasse;
    private String DateClasse;
    private String HeureClasse;
    @OneToOne
    @JoinColumn(name = "IdPromo")
    private Promotions IdPromo_c;
    @OneToOne
    @JoinColumn(name = "IdSalle")
    private Salles IdSalle_c;
    @OneToOne
    @JoinColumn(name = "IdMatiere")
    private Matieres IdMatiere_c;
    @OneToOne
    @JoinColumn(name = "IdProf")
    private Professeurs IdProf_c;
}
