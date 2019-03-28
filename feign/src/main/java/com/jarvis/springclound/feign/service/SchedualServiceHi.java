package com.jarvis.springclound.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eurekaClient")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    String sayHiFromClientOne(@RequestParam("name")String name);
}
