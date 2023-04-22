package com.example.eventbus.jdk;

/**
 * @className: Observer
 * @author: czh
 * @date: 2023/4/22
 * @Description: 观察者
 * @version: 1.0.0
 **/
public interface Observer {
    /**
     * 观察者响应事件方法
     *
     * @param message 事件类型
     */
        void update(Message message);
}
