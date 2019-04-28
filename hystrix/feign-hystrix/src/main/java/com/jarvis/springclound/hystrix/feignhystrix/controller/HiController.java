package com.jarvis.springclound.hystrix.feignhystrix.controller;

import com.jarvis.springclound.hystrix.feignhystrix.service.SchedualServiceHi;
import com.jarvis.springclound.hystrix.feignhystrix.service.SchedualServiceHi2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    SchedualServiceHi schedualServiceHi;

    @Autowired
    SchedualServiceHi2 schedualServiceHi2;

    @RequestMapping("/hi")
    public String hi(@RequestParam("name")String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }


    @RequestMapping("/hi2")
    public String hi2(@RequestParam("name")String name){
        return schedualServiceHi2.sayHiFromClientOne(name);
    }
}
