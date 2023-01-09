package com.example.Cinema.exceptions;

import com.example.Cinema.enums.MovieError;

public class MovieException extends RuntimeException{

    private MovieError movieError;
    public MovieException(MovieError movieError) {
        this.movieError = movieError;
    }
}
