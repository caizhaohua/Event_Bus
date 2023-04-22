package com.example.eventbus.jdk;

import lombok.extern.slf4j.Slf4j;

/**
 * @className: ConcreteObserverTwo
 * @author: czh
 * @date: 2023/4/22
 * @Description: 两个观察者
 * @version: 1.0.0
 **/
@Slf4j
public class ConcreteObserverTwo implements Observer {
    @Override
    public void update(Message message) {
        log.info("观察者2：收到消息[" + message.getMessage() + "]");
    }
}
