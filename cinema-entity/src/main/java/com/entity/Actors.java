package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Actors {
    private Integer actorsId;
    private String actorsName;
    private Date actorsBirthday;
    private String actorsIntroduction;
    private String actorsPhoto;
}
