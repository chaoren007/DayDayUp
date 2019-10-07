package com.zc.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/29 23:30
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring.class);
        IndexService service = (IndexService)applicationContext.getBean("indexService");
        service.service();
    }
}
  
  
   