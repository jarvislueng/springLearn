package com.jarvis.springclound.ribbon.ribbon;

import com.jarvis.springclound.ribbon.ribbon.service.ExcludeAnnotation;
import com.jarvis.springclound.ribbon.ribbon.service.RibbonClientService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
//@RibbonClients可以提供自定义负载均衡配置
/**
 * 针对局部service，指定对应的负载均衡方案
 * 要放在包不能扫描的地方扫描能扫到的地方，不然这个策略会共享到所有服务
 * */
//@RibbonClient(name="ribbonClinetService" , configuration = RibbonClientService.class)
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = ExcludeAnnotation.class)})
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
