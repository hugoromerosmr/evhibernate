package org.example.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "pelicula", schema = "ejevaluable")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @OneToMany(mappedBy = "pelicula", fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Opinion> opinions = new ArrayList<>(0);

    public void addOpinion(Opinion opinion) {
        opinion.setPelicula(this);
        opinions.add(opinion);
    }

    public Pelicula( String titulo) {
        this.titulo = titulo;
    }
    public Pelicula() {

    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +

                '}';
    }
}