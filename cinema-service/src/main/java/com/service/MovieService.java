package com.service;

import com.entity.Movie;

import java.util.List;

public interface MovieService {


    List<Movie> allMovie();
    int addMovie(Movie movie);
    int delete(int id);
    Movie getByMovieId(int id);
    int updateMovie(Movie movie);
}
