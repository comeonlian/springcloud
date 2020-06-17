package com.leolian.springcloud.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author lianliang
 * @date 2020/5/4 19:32
 */
@Service
@EnableBinding(Sink.class)
public class ReceiveMessageService {

    @Value("${server.port}")
    private String serverPort;


    @StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("消费者1号，接受：" + message.getPayload() + "\t port:" + serverPort);
    }


}
