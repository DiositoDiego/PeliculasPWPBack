package com.cruddave.Peliculas.controller;

import com.cruddave.Peliculas.model.Movie;
import com.cruddave.Peliculas.service.MovieService;
import com.cruddave.Peliculas.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/api/movies
@RequestMapping("/api/movies")
@CrossOrigin(origins = "*")
public class MovieController {
    @Autowired
    MovieService service;

    @GetMapping
    public CustomResponse<List<Movie>> getMovies(){
        return service.getMovies();
    }

    @GetMapping("/{id}")
    public CustomResponse<Movie> getMovieById(@PathVariable Long id){
        return service.getMovieById(id);
    }

    @PutMapping("/{id}")
    public CustomResponse<Movie> updateMovie(@PathVariable Long id, @RequestBody Movie movie){
        return service.updateMovie(id, movie);
    }

    @PostMapping
    public CustomResponse<Movie> saveMovie(@RequestBody Movie movie){
        return service.saveMovie(movie);
    }

    @DeleteMapping("/{id}")
    public CustomResponse<Movie> deleteMovie(@PathVariable Long id){
        return service.deleteMovie(id);
    }
}
