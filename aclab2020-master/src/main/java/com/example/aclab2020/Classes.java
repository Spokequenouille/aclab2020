package com.example.aclab2020;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Classes {
    @Id
    private int IdClasse;
    private String DateClasse;
    private String HeureClasse;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "IdPromo"))
    private Promotions IdPromo_c;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "IdSalle"))
    private Salles IdSalle_c;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "IdMatiere"))
    private Matieres IdMatiere_c;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "IdProf"))
    private Professeurs IdProf_c;


}
