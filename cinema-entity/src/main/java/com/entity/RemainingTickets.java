package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RemainingTickets {

  private Integer remainingId;
  private String movieName;
  private java.sql.Timestamp screeningTime;
  private BigDecimal movieDuration;
  private String cinemaName;
  private String playbackRoom;
  private BigDecimal fare;
  private Integer remainingSeats;



}
