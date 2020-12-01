package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Matieres {
    @Id
    private int IdMatiere;
    private int IdClasse;
    private String LibMatiere;
    @OneToMany(fetch= FetchType.LAZY, mappedBy="IdMatiere_c")
    private List<Classes> classes;
}
