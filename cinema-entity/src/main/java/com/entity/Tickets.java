package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tickets {
    private Integer remainingId;
    private String movieName;
    private Date screeningTime;
    private BigDecimal movieDuration;
    private String cinemaName;
    private String playbackRoom;
    private BigDecimal fare;
    private Integer remainingSeats;
    private Integer ticketsStatus;
}
