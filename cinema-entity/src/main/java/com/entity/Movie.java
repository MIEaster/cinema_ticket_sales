package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private Integer movieId;
    private String movieName;
    private BigDecimal movieDuration;
    private String typeName;
    private String director;
    private String screenwriter;
    private String actorsName;
    private Date releaseDate;
    private String movieIntroduction;
    private String poster;
}