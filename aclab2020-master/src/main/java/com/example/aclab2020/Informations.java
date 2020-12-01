package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Informations {
    @Id
    private int IdInfo;
    private String LibInfo;
    private String Fichier;
    private String Commentaire;
    private String DateInfo;
}
