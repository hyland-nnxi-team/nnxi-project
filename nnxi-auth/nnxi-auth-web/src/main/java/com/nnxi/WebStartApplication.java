package com.nnxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.nnxi"})
public class WebStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStartApplication.class, args);
    }

}