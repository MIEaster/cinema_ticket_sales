package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seats {
    private Integer seatsId;
    private Integer roomId;
    private String seatNum;
}