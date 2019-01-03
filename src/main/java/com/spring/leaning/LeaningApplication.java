package com.spring.leaning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class LeaningApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeaningApplication.class, args);
    }

}

