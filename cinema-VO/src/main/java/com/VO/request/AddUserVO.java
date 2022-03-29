package com.VO.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddUserVO {
    private String customerName;
    private String customerPassword;
    private String customerPhone;
    private String customerEmail;
    private Integer customerStatus;
}
