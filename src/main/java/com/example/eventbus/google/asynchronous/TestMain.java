package com.example.eventbus.google.asynchronous;

import com.google.common.eventbus.AsyncEventBus;

import java.util.concurrent.Executor;

/**
 * @className: TestMain
 * @author: czh
 * @date: 2023/4/21
 * @description: google异步eventBus测试
 * @version: 1.0.0
 **/
public class TestMain {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("step 1------------TestMain main create executor .");
        Executor executor = new Executor() {
            public void execute(Runnable command) {
                new Thread(command).start();
            }
        };

        System.out.println("step 2------------TestMain main create AsyncEventBus with executor: eventBus = new AsyncEventBus(executor) .");
        AsyncEventBus eventBus = new AsyncEventBus(executor);

        System.out.println("step 3------------TestMain main create EventListener: listener = new AsyncEventListener() .");
        AsyncEventListener listener = new AsyncEventListener();

        System.out.println("step 4------------TestMain main eventbus register listener: eventBus.register(listener) .");
        eventBus.register(listener);

        System.out.println("step 5------------TestMain main eventbus post event:  eventBus.post(new MessageEvent(\"异步消息\" + i)); .");
        for (int i = 0; i < 10; i++) {
            System.out.println("-----------------TestMain main eventBus post event message.");
            eventBus.post(new MessageEvent("异步消息" + i));

        }

    }
}
