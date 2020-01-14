package com.zc.api;


import java.util.concurrent.CompletableFuture;

public interface SendMessageApi {

    public CompletableFuture<Message> sendMessage(Message message);

}
