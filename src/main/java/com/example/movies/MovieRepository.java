package com.example.movies;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.bson.types.ObjectId;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movies,ObjectId> {
Optional<Movies> findMovieByImdbId(String imdbId);
}

