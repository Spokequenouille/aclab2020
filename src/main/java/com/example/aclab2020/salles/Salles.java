package com.example.aclab2020.salles;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Salles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSalle;
    private String libSalle;
    private int nbrePlaces;
    private String adresse;
}
