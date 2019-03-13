package com.jarvis.springclound.ribbon.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    @Bean
    /**
     * 使用ribbon客户端负载均衡会在restTemplate中加入这个标签
     * 可以让restTemplate请求时拥有客户端负载均衡的能力
    */
    @LoadBalanced
    RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
