package com.jarvis.springclound.sleuth.servicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }

    @Bean
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    AlwaysSampler：作用相当于在配置文件中配置 spring.sleuth.sampler.percentage=1，设置sleuth收集信息的比率为1,默认10%
    @Bean
    public AlwaysSampler alwaysSampler(){
        return new AlwaysSampler();
    }
}
