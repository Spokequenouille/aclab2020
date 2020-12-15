package com.example.aclab2020;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Informations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idInfo;
    private String libInfo;
    private String fichier;
    private String commentaire;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date dateInfoDeb;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private Date dateInfoFin;
}
