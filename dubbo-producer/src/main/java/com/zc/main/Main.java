package com.zc.main;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        // 初始化Spring容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:remote-provider.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        //
        System.out.println(RpcContext.getContext().isConsumerSide());
        RpcContext.getContext().setAttachment("uuid", UUID.randomUUID().toString());
        try {
            System.in.read();
        } catch (IOException e) {

        }
    }
}
