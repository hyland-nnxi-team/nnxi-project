package com.nnxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.cors.CorsConfiguration;


@SpringBootApplication(scanBasePackages = {"com.nnxi"})
public class WebStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStartApplication.class, args);
    }

}