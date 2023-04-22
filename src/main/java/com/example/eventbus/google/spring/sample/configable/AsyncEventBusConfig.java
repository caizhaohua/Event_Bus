package com.example.eventbus.google.spring.sample.configable;

import com.google.common.eventbus.AsyncEventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @className: AsyncEventBusConfig
 * @author: czh
 * @date: 2023/4/22
 * @description: 事件注入中心
 * @version: 1.0.0
 **/
@Configuration
public class AsyncEventBusConfig {
    @Bean
    @Scope("singleton")
    public AsyncEventBus asyncEventBus() {
        final ThreadPoolTaskExecutor executor = executor();
        return new AsyncEventBus(executor);
    }

    @Bean
    public ThreadPoolTaskExecutor executor(){
        /*
        org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
        private int corePoolSize = 1;
        private int maxPoolSize = 2147483647;
        private int queueCapacity = 2147483647;
        private int keepAliveSeconds = 60;
        private boolean allowCoreThreadTimeOut = false;
        * */
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5);
        executor.setMaxPoolSize(100);
        executor.setQueueCapacity(1000);
        // executor.setKeepAliveSeconds(600);
        // executor.setAllowCoreThreadTimeOut(true);
        return executor;
    }
}
