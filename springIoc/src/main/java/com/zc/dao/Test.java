package com.zc.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description TODO
 * @Author LiquorSea
 * @Date 2019/9/29 23:30
 **/
public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring.class);
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
//        IndexServiceA service = (IndexServiceA)applicationContext.getBean("indexServiceA");
//        service.service();
    }
}
  
  
   