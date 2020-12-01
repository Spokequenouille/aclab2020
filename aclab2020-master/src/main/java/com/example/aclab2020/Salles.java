package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Salles {
    @Id
    private int IdSalle;
    private String LibSalle;
    private int NbrePlace;
    private String Adresse;
    @OneToMany(fetch=FetchType.LAZY, mappedBy="IdSalle_c")
    private List<Classes> classes;
}
