package com.zc;

import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.service.EchoService;
import com.zc.api.Message;
import com.zc.api.SendMessageApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {

        // spring环境
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:remote-consumer.xml");
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        // 获取bean
        Message message = new Message();
        message.setId(Integer.toBinaryString(998));
        message.setMessage("hello word ");
        SendMessageApi bean = context.getBean(SendMessageApi.class);

        // 回声测试，调用服务
        EchoService echoService = (EchoService) bean;
        Object ok = echoService.$echo("OK");
        System.out.println(ok);

        // 获取dubbo上下文
        RpcContext rpcContext = RpcContext.getContext();
        rpcContext.setAttachment("uuid", UUID.randomUUID().toString());
        CompletableFuture<Message> future = bean.sendMessage(message);

        // 增加回调
        future.whenComplete((v, t) -> {
            if (t != null) {
                t.printStackTrace();
            } else {
                System.out.println("Response: " + v);
            }
        });
        // 早于结果输出
        System.out.println("Executed before response return.");
    }
}
