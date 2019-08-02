package com.springtask.eurekaclien;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaclienApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaclienApplication.class, args);
    }

}
