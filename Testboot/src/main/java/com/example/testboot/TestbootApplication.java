package com.example.testboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.testboot.dao")
public class TestbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestbootApplication.class, args);
    }

}
