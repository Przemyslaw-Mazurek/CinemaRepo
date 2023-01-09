package com.example.Cinema.services;

import com.example.Cinema.enums.MovieError;
import com.example.Cinema.exceptions.MovieException;
import com.example.Cinema.model.Movie;
import com.example.Cinema.repositories.MovieRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public ResponseEntity<Movie> getMovie(Long id) {
        Movie movieFromDB = movieRepository.findById(id)
                .orElseThrow(() -> new MovieException(MovieError.MOVIE_NOT_FOUND));

        return ResponseEntity.ok(movieFromDB);
    }

    public ResponseEntity<Movie> updateMovie(Long id, Movie movie) {
        Movie movieFromDB = movieRepository.findById(id)
                .orElseThrow(() -> new MovieException(MovieError.MOVIE_NOT_FOUND));

        movieFromDB.setTitle(movie.getTitle());
        movieFromDB.setGenre(movie.getGenre());
        movieFromDB.setDuration(movie.getDuration());
        movieFromDB.setDescription(movie.getDescription());
        movieFromDB.setMinimumAge(movie.getMinimumAge());
        movieFromDB.setRating(movie.getRating());
        movieFromDB.setIsPremiere(movie.getIsPremiere());

        return ResponseEntity.ok(movieFromDB);
    }

    public void deleteMovie(Long id) {
        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new MovieException(MovieError.MOVIE_NOT_FOUND));
        movieRepository.delete(movie);
    }

}
