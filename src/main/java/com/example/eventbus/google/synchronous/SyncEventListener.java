package com.example.eventbus.google.synchronous;

import com.google.common.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;

/**
 * @className: SyncEventListener
 * @author: czh
 * @date: 2023/4/21
 * @despriction: 事件监听,@Subscribe注解
 * @version: 1.0.0
 **/
public class SyncEventListener {
    @Subscribe
    public void handleMethod(@NotNull MessageEvent msg) {
        System.out.printf("SynchEventListener handleMethod received message: %s \n", msg.getMessage());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("SynchEventListener handleMethod process message: %s \n", msg.getMessage());
    }

}

