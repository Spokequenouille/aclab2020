package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Professeurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProf;
    private String nomProf;
    private String prenomProf;
}
