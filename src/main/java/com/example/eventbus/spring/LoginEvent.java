package com.example.eventbus.spring;

import lombok.Data;

/**
 * @className: LoginEvent
 * @author: czh
 * @date: 2023/4/22
 * @Description: 定义登录事件
 * @version: 1.0.0
 **/
@Data
public class LoginEvent {
    /**
     * 用户id
     */
    private Long userId;

    /**
     * 登录类型
     */
    private Integer loginType;
}
