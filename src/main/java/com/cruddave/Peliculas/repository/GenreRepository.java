package com.cruddave.Peliculas.repository;

import com.cruddave.Peliculas.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository  extends JpaRepository<Genre, Long> {
}
