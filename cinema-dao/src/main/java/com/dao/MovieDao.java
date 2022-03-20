package com.dao;

import com.entity.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> allMovie();
    void addMovie(Movie movie);
    //即过了放映时间
    boolean delete(int id);
    Movie getByMovieId(int id);


}
