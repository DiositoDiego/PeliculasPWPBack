package com.cruddave.Peliculas.controller;

import com.cruddave.Peliculas.model.Movie;
import com.cruddave.Peliculas.service.MovieService;
import com.cruddave.Peliculas.utils.CustomResponse;
import com.cruddave.Peliculas.utils.DateBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/name/{name}")
    public CustomResponse<List<Movie>> getMoviesByName(@PathVariable String name){
        return service.getMoviesByName(name);
    }

    @GetMapping("/director/{director}")
    public CustomResponse<List<Movie>> getMoviesByDirector(@PathVariable String director){
        return service.getMoviesByDirector(director);
    }

    @PostMapping("/date/between")
    public CustomResponse<List<Movie>> getMoviesBetweenDates(@RequestBody DateBody date){
        return service.getMoviesBetweenDates(date);
    }

    @GetMapping("/date/{date}")
    public CustomResponse<List<Movie>> getMoviesByReleaseDate(@PathVariable Date date){
        return service.getMoviesByReleaseDate(date);
    }

    @GetMapping("/genre/{id}")
    public CustomResponse<List<Movie>> getMoviesByGenre(@PathVariable Long id){
        return service.getMoviesByGenre(id);
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
