package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private Integer customerId;
    private String customerName;
    private String customerPassword;
    private String customerPhone;
    private String customerEmail;
    private Integer customerStatus;
    private Date createTime;
    private Date updateTime;
}