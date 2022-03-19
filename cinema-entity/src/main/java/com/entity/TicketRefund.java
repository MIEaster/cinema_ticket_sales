package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketRefund {

  private Integer refundId;
  private Integer detailsId;
  private String customerName;
  private String movieName;
  private Date screeningTime;
  private String cinemaName;
  private String playbackRoom;
  private String seats;
  private BigDecimal fare;
  private Date ticketingDate;
  private BigDecimal commission;
  private BigDecimal actualRefund;


}
