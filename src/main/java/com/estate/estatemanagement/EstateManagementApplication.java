package com.estate.estatemanagement;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.estate.estatemanagement.dao")
public class EstateManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstateManagementApplication.class, args);
    }

}
