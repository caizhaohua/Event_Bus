package com.example.eventbus.jdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: ConcreteSubject
 * @author: czh
 * @date: 2023/4/22
 * @Description: 被观察者实现类
 * @version: 1.0.0
 **/
public class ConcreteSubject implements Subject {

    /**
     * 观察者列表
     **/
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Message message) {
        //遍历通知所有观察者
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
