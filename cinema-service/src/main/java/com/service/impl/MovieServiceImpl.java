package com.service.impl;

import com.dao.MovieDao;
import com.entity.Movie;
import com.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieDao movieDao;

    @Override
    public List<Movie> allMovie() {
        return movieDao.allMovie();
    }

    @Override
    public int addMovie(Movie movie) {
      return   movieDao.addMovie(movie);
    }

    @Override
    public int delete(int id) {
        return movieDao.delete(id);
    }

    @Override
    public Movie getByMovieId(int id) {
        return movieDao.getByMovieId(id);
    }

    @Override
    public int updateMovie(Movie movie) {
        return movieDao.updateMovie(movie);
    }
}
