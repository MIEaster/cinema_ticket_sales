package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dao")
public class CinemaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class,args);
    }
}
