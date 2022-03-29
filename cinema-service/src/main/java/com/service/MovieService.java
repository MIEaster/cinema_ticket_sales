package com.service;

import com.entity.Movie;

import java.util.List;

public interface MovieService {


    List<Movie> allMovie();
    void addMovie(Movie movie);
    boolean delete(int id);
    Movie getByMovieId(int id);
}
