package com.example.eventbus.google.spring.sample.service.impl;

import com.example.eventbus.google.spring.sample.service.BusListenerServiceI;
import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.AsyncEventBus;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @className: BusListenerServiceImpl
 * @author: czh
 * @date: 2023/4/22
 * @Description: 需要异步执行的类中注册该类,并给异步执行的方法上加@Subscribe注解
 * @version: 1.0.0
 **/
@Service("busListenerService")
@Slf4j
public class BusListenerServiceImpl implements BusListenerServiceI {

    @Autowired
    private AsyncEventBus asyncEventBus;

    @PostConstruct // 注册该类
    public void register(){
        log.info("singleton async event bus register listener instance on spring service PostConstruct.................");
        asyncEventBus.register(this);
    }

    @AllowConcurrentEvents//线程安全
    @Subscribe // 异步执行的方法标识:需要传入String类型参数 : 消费 event信息
    public void onMessage(String message){
        log.info("listener Subscribe received message: {}",message);
    }
}
