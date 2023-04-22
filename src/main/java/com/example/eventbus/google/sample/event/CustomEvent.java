package com.example.eventbus.google.sample.event;

/**
 * @className: CustomEvent
 * @author: czh
 * @date: 2023/4/21
 **/
public class CustomEvent    {
    private int age;
    public CustomEvent(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
}
