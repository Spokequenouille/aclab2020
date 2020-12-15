package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Informations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long IdInfo;
    private String LibInfo;
    private String Fichier;
    private String Commentaire;
    private String DateInfo;
}
