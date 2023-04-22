package com.example.eventbus.google.spring.sample.controller;

import com.google.common.eventbus.AsyncEventBus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: GuavaEventBusController
 * @author: czh
 * @date: 2023/4/22
 * @description: 调用方法的类
 * @version: 1.0.0
 **/
@RestController
@RequestMapping
@Slf4j
public class GuavaEventBusController {
    @Autowired
    private AsyncEventBus eventBus;

    @GetMapping("/eventbus")
    public String eventbus(){
        log.info("event bus controller enter........");
        log.info("event bus send event message");
        eventBus.post("异步消息发送: event message,controller send"); // 调用执行方法的参数
        log.info("event bus controller send success........");
        return "send success......................................";
    }

}
