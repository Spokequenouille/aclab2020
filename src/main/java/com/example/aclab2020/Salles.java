package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Salles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdSalle;
    private String LibSalle;
    private int NbrePlace;
    private String Adresse;
}
