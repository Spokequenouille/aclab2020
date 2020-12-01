package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Professeurs {
    @Id
    private int IdProf;
    private String NomProf;
    private String PrenomProf;
    @OneToMany(fetch= FetchType.LAZY, mappedBy="IdProf_c")
    private List<Classes> classes;
}
