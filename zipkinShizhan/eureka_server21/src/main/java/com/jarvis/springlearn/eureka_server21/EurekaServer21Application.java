package com.jarvis.springlearn.eureka_server21;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer21Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer21Application.class, args);
    }

}
