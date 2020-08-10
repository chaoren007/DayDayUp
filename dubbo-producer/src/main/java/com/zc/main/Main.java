package com.zc.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author Sea
 */
public class Main {
    public static void main(String[] args) {
        // 初始化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:remote-provider.xml");
        // 允许覆盖
        context.setAllowBeanDefinitionOverriding(true);
        // 允许循环引用，并自动解决
        context.setAllowCircularReferences(true);
        Object dubbo = context.getBean("dubbo");
        System.out.println(dubbo);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        try {
            System.in.read();
        } catch (IOException e) {

        }
    }
}
