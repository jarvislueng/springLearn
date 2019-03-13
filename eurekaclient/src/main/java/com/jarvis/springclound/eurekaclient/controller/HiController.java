package com.jarvis.springclound.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @RequestMapping("hi")
    public String hi(@RequestParam("name") String name){
        return name;
    }
}
