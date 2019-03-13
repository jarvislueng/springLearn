package com.jarvis.springclound.ribbon.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    //这里写的时应用的名称，具体架构是访问时会经过ribbon
    // 此时ribbon其实已经有整个拓扑，在restTemplate发送出去时就会替换具体ip
    //这里替换时会根据负载走
    public String hiService (String name){
        return restTemplate.getForObject("http://eurekaClient/hi?name="+name, String.class);
    }
}
