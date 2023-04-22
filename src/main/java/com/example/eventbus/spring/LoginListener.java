package com.example.eventbus.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @className: LoginListener
 * @author: czh
 * @date: 2023/4/22
 * @Description: 事件监听@EventListener
 * @version: 1.0.0
 **/
@Slf4j
@Component
public class LoginListener {
    @EventListener
    @Async
    public void loginEvent(LoginEvent event) {
        log.info("监听到登录事件：" + event);
    }
}
