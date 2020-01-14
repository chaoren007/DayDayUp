package com.zc.api.impl;


import com.alibaba.dubbo.rpc.RpcContext;
import com.zc.api.Message;
import com.zc.api.SendMessageApi;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class SendMessageApiImpl implements SendMessageApi {

    @Override
    public CompletableFuture<Message> sendMessage(Message message) {
        System.out.println("=============================");
        System.out.println(message.getMessage());
        message.setId(UUID.randomUUID().toString());
        Map<String, String> attachments = RpcContext.getContext().getAttachments();
        for (String s : attachments.keySet()) {
            System.out.println(attachments.get(s));
        }
        CompletableFuture<Message> completableFuture = new CompletableFuture<>();
        completableFuture.complete(message);
        return completableFuture;
    }
}
