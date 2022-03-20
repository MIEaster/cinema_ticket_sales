package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Discuss {
    private Integer discussId;
    private Integer customerId;
    private Integer movieId;
    private String discussContent;
    private Date createDate;
}