package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CinemaRoom {

  private Integer roomId;
  private Integer cinemaId;
  private String playbackRoom;
  private Integer roomStatus;
  private Integer totalSeats;




}
