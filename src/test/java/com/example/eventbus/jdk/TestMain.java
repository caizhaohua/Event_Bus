package com.example.eventbus.jdk;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @className: TestMain
 * @author: czh
 * @date: 2023/4/22
 * @Description: jdk 观察者测试
 * @version: 1.0.0
 **/
@SpringBootTest
public class TestMain {
    @Test
    public void testCustomEventBus() {
        //被观察者实现类
        ConcreteSubject subject = new ConcreteSubject();
        //观察者
        ConcreteObserverOne observerOne = new ConcreteObserverOne();
        ConcreteObserverTwo observerTwo = new ConcreteObserverTwo();

        //被观察者实现类注册观察者.List.add()
        subject.registerObserver(observerOne);
        subject.registerObserver(observerTwo);

        subject.notifyObserver(new Message("jdk observer subject "));
    }
}
