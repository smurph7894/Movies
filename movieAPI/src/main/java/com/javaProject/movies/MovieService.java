package com.javaProject.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    //@autoWired instantiates the class for us, so we don't have to initialize a constructor.
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> singleMovie(String imdbID) {
        return movieRepository.findMovieByImdbId(imdbID);
    }
}
