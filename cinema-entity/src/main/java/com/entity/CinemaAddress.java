package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CinemaAddress {

  private Integer cinemaId;
  private String cinemaName;
  private String address;
  private String cinemaPhone;
  private Integer cinemaStatus;

}
