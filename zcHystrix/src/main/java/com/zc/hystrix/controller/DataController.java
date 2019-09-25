package com.zc.hystrix.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/24 10:07
 **/
@RestController
public class DataController {
    @RequestMapping("/queryData")
    public String queryData() {
        long sleepTime = 5000;
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return UUID.randomUUID().toString();
    }


}
  
  
   