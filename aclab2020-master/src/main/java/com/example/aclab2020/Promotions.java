package com.example.aclab2020;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Promotions {
    @Id
    private int IdPromo;
    private String LibPromo;
    @OneToMany(fetch=FetchType.LAZY, mappedBy="IdPromo_c")
    private List<Classes> classes;
}
