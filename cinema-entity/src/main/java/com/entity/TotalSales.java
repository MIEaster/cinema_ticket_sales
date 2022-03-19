package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TotalSales {

  private Integer salesId;
  private String movieName;
  private Date screeningTime;
  private String cinemaName;
  private String playbackRoom;
  private Integer seatsTaken;
  private BigDecimal fare;
  private Integer allCount;
  private BigDecimal movieDuration;



}
