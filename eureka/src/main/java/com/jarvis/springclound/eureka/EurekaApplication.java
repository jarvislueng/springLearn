package com.jarvis.springclound.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//添加eureka服务端的注解
@EnableEurekaServer
/**
 * eureka 是一个高可用的组件，他没有后端缓存，每一个实例注册以后要向注册中心
 * 发送心跳，在默认的情况下server也是一个client，必须指定一个server
 * */
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
