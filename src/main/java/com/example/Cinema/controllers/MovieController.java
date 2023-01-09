package com.example.Cinema.controllers;

import com.example.Cinema.model.Movie;
import com.example.Cinema.services.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/movies/")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id){
        return movieService.getMovie(id);
    }

    @PostMapping
    public Movie addMovie(@Valid @RequestBody Movie movie){
       return movieService.addMovie(movie);
    }

    @DeleteMapping
    public void removeMovie(Long id){
        movieService.deleteMovie(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@PathVariable Long id,@Valid @RequestBody Movie movie){
        ResponseEntity<Movie> movieResponseEntity = movieService.updateMovie(id, movie);
        return movieResponseEntity;
    }
}
