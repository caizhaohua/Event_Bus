package com.example.eventbus.google.asynchronous;

import com.google.common.eventbus.Subscribe;

/**
 * @className: AsyncEventListener
 * @author: czh
 * @date: 2023/4/21
 * @description: event bus listener
 * @version: 1.0.0
 **/
public class AsyncEventListener {
    @Subscribe
    public void method1( MessageEvent msg) {
        System.out.printf("AsyncEventListener method1 Subscribe received message: %s \n", msg.getMessage());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("AsyncEventListener method1 Subscribe process message: %s \n", msg.getMessage());
    }

    @Subscribe
    public void method2( MessageEvent msg) {
        System.out.printf("AsyncEventListener method2 Subscribe received message: %s \n", msg.getMessage());
        System.out.printf("AsyncEventListener method2 Subscribe process message: %s \n", msg.getMessage());
    }

}

