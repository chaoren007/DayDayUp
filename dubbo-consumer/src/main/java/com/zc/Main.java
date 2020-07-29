package com.zc;

import com.alibaba.dubbo.rpc.RpcContext;
import com.zc.api.Message;
import com.zc.api.SendMessageApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        // spring环境
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:remote-consumer.xml");
        Message message = new Message();
        message.setId(Integer.toBinaryString(998));
        message.setMessage("来自消费端的 hello word ");



        SendMessageApi bean = context.getBean(SendMessageApi.class);
        bean.sendMessage(message);
//        // 早于结果输出
//        System.out.println("Executed before response return.");
    }
}
