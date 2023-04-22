package com.example.eventbus.google.sample.event;

/**
 * @className: Message
 * @author: czh
 * @date: 2023/4/21
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
