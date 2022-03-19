package com.entity;


import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
