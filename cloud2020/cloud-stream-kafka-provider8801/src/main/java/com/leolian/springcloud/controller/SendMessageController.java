package com.leolian.springcloud.controller;

import com.leolian.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SendMessageController {
    
    @Resource
    private IMessageProvider messageProvider;


    @GetMapping(value = "/sendMessage")
    public void sendMessage() {
        messageProvider.send();
    }

}
