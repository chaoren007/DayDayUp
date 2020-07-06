package com.zc;

import com.alibaba.dubbo.rpc.RpcContext;
import com.zc.api.Message;
import com.zc.api.SendMessageApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // spring环境
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:remote-consumer.xml");
        // String[] beanDefinitionNames = context.getBeanDefinitionNames();

        // 获取bean
        Message message = new Message();
        message.setId(Integer.toBinaryString(998));
        message.setMessage("hello word ");
        SendMessageApi bean = context.getBean(SendMessageApi.class);
        // 调用直接返回CompletableFuture
        RpcContext context1 = RpcContext.getContext();
        RpcContext context3 = RpcContext.getContext();
        // 早于结果输出
        System.out.println("Executed before response return.");
    }
}
