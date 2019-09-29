package com.zc.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/29 23:30
 **/
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        IndexService service = (IndexService)classPathXmlApplicationContext.getBean("service");
        service.service();
    }
}
  
  
   