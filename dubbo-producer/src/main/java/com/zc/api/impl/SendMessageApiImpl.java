package com.zc.api.impl;


import com.zc.api.Message;
import com.zc.api.SendMessageApi;

import java.util.UUID;

public class SendMessageApiImpl implements SendMessageApi {

    @Override
    public Message sendMessage(Message message) {
        System.out.println("=============================");
        message.setId(UUID.randomUUID().toString());
        System.out.println(message.getMessage());
//        RpcContext savedContext = RpcContext.getContext();
//        // 建议为supplyAsync提供自定义线程池，避免使用JDK公用线程池
//        return CompletableFuture.supplyAsync(() -> {
//            System.out.println(savedContext.getAttachment("consumer-key1"));
//            try {
//                Thread.sleep(5000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            return "async response from provider.";
        return message;
    }
}
