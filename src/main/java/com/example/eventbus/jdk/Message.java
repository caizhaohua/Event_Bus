package com.example.eventbus.jdk;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: Message
 * @author: czh
 * @date: 2023/4/22
 * @Description: 事件定义
 * @version: 1.0.0
 **/
@Data
@AllArgsConstructor
public class Message {
    /**
     * 消息信息
     */
    private String message;
}
