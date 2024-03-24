package com.example.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository repository;


    //database access methods
    public List<Movies> findAllMovies(){
       return repository.findAll();
    }
    //optional so that if that id is not found then null is being returned;

    public Optional<Movies> findMovieByImdbId(String imdbId){
        return repository.findMovieByImdbId(imdbId);
    }
}
