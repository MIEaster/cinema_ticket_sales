package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator {

  private Integer adminId;
  private String adminName;
  private String adminPassword;
  private Integer adminRole;

}
