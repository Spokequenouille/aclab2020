package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Matieres {
    @Id
    private int IdMatiere;
    private int IdClasse;
    private String LibMatiere;
}
