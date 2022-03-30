package com.dao;

import com.entity.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> allMovie();
    int addMovie(Movie movie);
    //即过了放映时间
    int delete(int id);
    Movie getByMovieId(int id);
    int updateMovie(Movie movie);

}
