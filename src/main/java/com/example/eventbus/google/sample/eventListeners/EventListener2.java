package com.example.eventbus.google.sample.eventListeners;

import com.example.eventbus.google.sample.event.CustomEvent;
import com.google.common.eventbus.Subscribe;

import java.time.Instant;

/**
 * @className: EventListener2
 * @author: czh
 * @date: 2023/4/21
 * @Description: 事件监听
 **/
public class EventListener2 {

    @Subscribe
    public void test(CustomEvent event){
        System.out.println(Instant.now() +",监听者2,收到事件："+event.getAge()+"，线程号为："+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
