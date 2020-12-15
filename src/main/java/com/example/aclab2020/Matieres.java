package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Matieres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMatiere;
    private int idClasse;
    private String libMatiere;
}
