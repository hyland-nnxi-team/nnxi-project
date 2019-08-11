package com.nnxi;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author hyland
 */
@SpringBootApplication(scanBasePackages = {"com.nnxi"})
@DubboComponentScan(basePackages = "com.nnxi.service.impl")
public class ServiceStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceStartApplication.class, args);
    }

}