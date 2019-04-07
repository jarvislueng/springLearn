package com.jarvis.springclound.hystrix.ribbonhystrix.controller;

import com.jarvis.springclound.hystrix.ribbonhystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("sayHello")
    public String sayHello(@RequestParam("name")String name){
        return helloService.sayHello(name);
    }
}
