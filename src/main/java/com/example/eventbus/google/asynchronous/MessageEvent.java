package com.example.eventbus.google.asynchronous;

/**
 * @className: MessageEvent
 * @author: czh
 * @date: 2023/4/21
 * @despriction: 事件消息
 * @version: 1.0.0
 **/
public class MessageEvent {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
