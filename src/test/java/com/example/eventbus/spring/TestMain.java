package com.example.eventbus.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @className: TestMain
 * @author: czh
 * @date: 2023/4/22
 * @Description: 发布事件
 * @version: 1.0.0
 **/
@SpringBootTest
public class TestMain {
    @Test
    public void testEventListener() throws InterruptedException {
        LoginEvent event = new LoginEvent();

        event.setLoginType(1);
        event.setUserId(8142L);

        //事件的发布
        SpringContextHolder.getApplicationContext().publishEvent(event);

        Thread.sleep(100);
    }
}
