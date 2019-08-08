package com.nnxi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = {"com.nnxi"})
@MapperScan("com.nnxi.mapper")
//@DubboComponentScan(basePackages = "com.nnxi.service.impl")
public class QuickstartApplication {

    public static void main(String[] args) {

        SpringApplication.run(QuickstartApplication.class, args);
    }

}