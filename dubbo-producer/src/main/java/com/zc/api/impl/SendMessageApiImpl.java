package com.zc.api.impl;


import com.zc.api.Message;
import com.zc.api.SendMessageApi;

import java.util.UUID;

public class SendMessageApiImpl implements SendMessageApi {

    @Override
    public Message sendMessage(Message message) {
        System.out.println(message.getMessage());
        message.setId(UUID.randomUUID().toString());
        return message;
    }
}
