package com.entity;


import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

  private Integer movieId;
  private String movieName;
  private String type;
  private BigDecimal movieDuration;
  private String actors;
  private String director;
  private String screenwriter;
  private Date releaseDate;
  private Integer rating;
  private String poster;



}
