package com.cruddave.Peliculas.service;

import com.cruddave.Peliculas.model.Genre;
import com.cruddave.Peliculas.repository.GenreRepository;
import com.cruddave.Peliculas.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService {
    @Autowired
    private GenreRepository genreRepository;

    public CustomResponse<List<Genre>> getGenres(){
        CustomResponse<List<Genre>> response = new CustomResponse<>();
        List<Genre> genres = genreRepository.findAll();
        if(!genres.isEmpty()){
            response.setData(genres);
            response.setError(false);
            response.setMessage("Genres found");
            response.setCode(200);
        } else {
            response.setData(null);
            response.setError(true);
            response.setMessage("No genres found");
            response.setCode(404);
        }
        return response;
    }
}
