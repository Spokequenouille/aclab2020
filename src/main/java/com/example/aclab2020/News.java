package com.example.aclab2020;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class News {
    @Id
    private int id_news;
    private String name;

    public void setId(Integer id) {
        this.id_news = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id_news;
    }

    public String getName() {
        return name;
    }
}