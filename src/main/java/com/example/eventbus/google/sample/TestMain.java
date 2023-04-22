package com.example.eventbus.google.sample;

import com.example.eventbus.google.sample.event.MessageEvent;
import com.example.eventbus.google.sample.eventListeners.MessageEventListener;
import com.example.eventbus.google.sample.event.CustomEvent;
import com.example.eventbus.google.sample.eventListeners.EventListener1;
import com.example.eventbus.google.sample.eventListeners.EventListener2;
import com.example.eventbus.google.sample.util.EventBusUtil;

import java.time.Instant;

/**
 * @className: TestMain
 * @author: czh
 * @date: 2023/4/21
 **/
public class TestMain {
    public static void main(String[] args) {
        EventListener1 listener1 = new EventListener1();
        EventListener2 listener2 = new EventListener2();

        CustomEvent customEvent = new CustomEvent(23);

        EventBusUtil.register(listener1);
        EventBusUtil.register(listener2);

        EventBusUtil.asyncPost(customEvent);

        //EventBusUtil.post(customEvent);
        System.out.println(Instant.now() +",主线程执行完毕："+Thread.currentThread().getName());

        //为了定位 g_sync_eventbus 不生效原因
        //1.message没问题
        MessageEvent messageEvent = new MessageEvent("为了定位g_sync_eventbus不生效原因！");
        //2.listener 错误修复： Message msg -> MessageEvent msgEvent 修复
        MessageEventListener messageEventListener = new MessageEventListener();

        EventBusUtil.register(messageEventListener);
        EventBusUtil.asyncPost(messageEvent);
    }
}
