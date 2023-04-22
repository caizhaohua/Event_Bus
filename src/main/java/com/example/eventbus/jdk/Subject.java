package com.example.eventbus.jdk;

/**
 * @className: Subject
 * @author: czh
 * @date: 2023/4/22
 * @Description: 被观察者接口
 * @version: 1.0.0
 **/
public interface Subject {
    /**
     * 注册观察者
     *
     * @param observer 观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 发布事件
     *
     * @param message 事件
     */
    void notifyObserver(Message message);
}
