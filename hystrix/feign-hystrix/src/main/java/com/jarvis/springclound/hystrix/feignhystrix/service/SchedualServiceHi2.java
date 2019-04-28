package com.jarvis.springclound.hystrix.feignhystrix.service;

import com.jarvis.springclound.hystrix.feignhystrix.config.FeignConfig;
import com.jarvis.springclound.hystrix.feignhystrix.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eurekaClient", configuration = FeignConfig.class)
public interface SchedualServiceHi2 {
    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    String sayHiFromClientOne(@RequestParam("name") String name);
}
