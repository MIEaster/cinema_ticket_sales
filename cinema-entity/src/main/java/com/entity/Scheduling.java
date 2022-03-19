package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Scheduling {

  private Integer schedulingId;
  private Integer roomId;
  private String movieName;
  private Date startTime;
  private Date endTime;
  private BigDecimal fare;



}
