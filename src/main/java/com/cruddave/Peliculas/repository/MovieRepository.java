package com.cruddave.Peliculas.repository;

import com.cruddave.Peliculas.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Override
    @Query("SELECT m FROM Movie m JOIN m.genre g")
    List<Movie> findAll();
}
