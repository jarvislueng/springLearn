package com.jarvis.springclound.ribbon.ribbon.service;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//这里加上这个的话就不会扫描这个类
@ExcludeAnnotation
public class RibbonClientService {
    @Bean
    public IRule ribbonRule() {
        return new RandomRule();
    }
}
