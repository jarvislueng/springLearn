package com.jarvis.springclound.ribbon.ribbon.controller;

import com.jarvis.springclound.ribbon.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @RequestMapping("hello")
    public String helloMethod(@RequestParam("name")String name){
        return helloService.hiService(name);
    }
}
