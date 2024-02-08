package com.cruddave.Peliculas.model;

import lombok.Data;

@Data
public class Movie {
    String name, director, genre;
    Double duration;
}
