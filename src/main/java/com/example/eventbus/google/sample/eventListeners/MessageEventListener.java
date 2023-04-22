package com.example.eventbus.google.sample.eventListeners;

import com.example.eventbus.google.sample.event.MessageEvent;
import com.google.common.eventbus.Subscribe;

/**
 * @className: MessageEventListener
 * @author: czh
 * @date: 2023/4/22
 * @Description: 描述
 **/
public class MessageEventListener {
    @Subscribe
    public void method1(MessageEvent msg){
        System.out.println("method1:接收消息," + msg.getMessage());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("method1:处理消息," + msg.getMessage());
    }

    @Subscribe
    public void method2(MessageEvent msgEvent){
        System.out.println("method2:接收消息," + msgEvent.getMessage());
        System.out.println("method2:处理消息," + msgEvent.getMessage());
    }
}
