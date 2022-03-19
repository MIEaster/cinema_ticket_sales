package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;



}
