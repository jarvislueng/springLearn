package com.jarvis.springclound.hystrix.feignhystrix.service.impl;

import com.jarvis.springclound.hystrix.feignhystrix.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " +name;
    }
}
