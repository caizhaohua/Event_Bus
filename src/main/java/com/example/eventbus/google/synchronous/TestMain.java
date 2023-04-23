package com.example.eventbus.google.synchronous;

import com.google.common.eventbus.EventBus;

/**
 * @className: TestMain
 * @author: czh
 * @date: 2023/4/21
 * @description: google同步eventBus测试
 * @version: 1.0.0
 **/
public class TestMain {
    public static void main(String[] args) {

        System.out.println("step 1------------TestMain main create eventBus Object identifier: eventBus = new EventBus(\"test\") .");
        EventBus eventBus = new EventBus("test");

        System.out.println("step 2------------TestMain main eventBus new listener:  eventListener = new SyncEventListener().");
        SyncEventListener eventListener = new SyncEventListener();
        System.out.println("step 3------------TestMain main eventBus register event listener:  eventBus.register(eventListener).");
        eventBus.register(eventListener);

        System.out.println("step 4------------TestMain main eventBus post event: eventBus.post(new MessageEvent(\"消息同步发送\" + i))");
        for (int i=0; i<2; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("-----------------TestMain main eventBus post event message.");
            eventBus.post(new MessageEvent("消息同步发送" + i));
        }

    }
}
