package com.zc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {




    @RequestMapping(value = "/sayHello")
    public String sayHello(){
        return "Hello!";
    }


}
