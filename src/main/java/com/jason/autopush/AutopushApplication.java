package com.jason.autopush;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jason.autopush.auth.dao")
public class AutopushApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutopushApplication.class, args);
    }

}
