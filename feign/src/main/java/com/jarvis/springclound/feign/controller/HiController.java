package com.jarvis.springclound.feign.controller;

import com.jarvis.springclound.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name")String name){
        return  schedualServiceHi.sayHiFromClientOne(name);
    }
}
