package com.jarvis.springclound.sleuth.serverziokin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ServerZiokinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZiokinApplication.class, args);
    }

}
