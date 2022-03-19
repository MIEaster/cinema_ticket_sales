package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {

  private Integer detailsId;
  private String customerName;
  private String movieName;
  private Date screeningTime;
  private String cinemaName;
  private String playbackRoom;
  private String seats;
  private BigDecimal fare;
  private BigDecimal commission;
  private Date ticketingTime;
  private Date extractionTime;


}
