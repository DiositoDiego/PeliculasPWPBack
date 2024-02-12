package com.cruddave.Peliculas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Movie {
    private @Id @GeneratedValue Long idMovie;
    private String name, director, duration;
    @ManyToOne
    @JoinColumn(name = "idGenre")
    private Genre genre;
}
