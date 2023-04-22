简单的消息组件：限定范围同一个jvm中
　　EventBus 是设计模式中的观察者模式（生产者/消费者编程模型）的实现。
EvenBus 中的相关术语

EventBus 术语解释备注事件（消息）可以向事件总线（EventBus）发布的对象通常是一个类，不同的消息事件用不同的类来代替，消息内容就是类里面的属性订阅向事件总线注册监听者，以接受事件的行为EventBus.register(Object)，参数就是监听者监听者提供一个处理方法，希望接受和处理事件的对象通常也是一个类，里面有消息的处理方法处理方法监听者提供的公共方法，事件总线使用该方法向监听者发送事件；该方法应使用 Subscribe 注解监听者里面添加一个 Subscribe 注解的方法，就可以认为是消息的处理方法发布消息通过事件总线向所有匹配的监听者提供事件EventBus.post(Object)
EvenBus 的简单使用
　　添加依赖
<dependency>
<groupId>com.google.guava</groupId>
<artifactId>guava</artifactId>
<version>31.1-jre</version>
</dependency>

EventBus 的使用很简单，笼统来说可分为以下几个步骤。
创建 EventBus 对象。通常全局或模块内通过单例模式只用一个 EventBus 对象
创建消息类
创建监听者类
注册监听者类。如果有多个 EventBus 对象，监听者类注册在哪个 EventBus 对象下，消息就需要发布到对应的 EventBus 中
发布消息
　　EventBusDemo.java
package cn.jkingtools.demo.guava.eventbus;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
public class EventBusDemo {
// 1. 创建消息类
private static class Message {
private String message;
public Message(String message) {
this.message = message;
}

        public String getMessage() {
            return message;
        }
    
        public void setMessage(String message) {
            this.message = message;
        }
}

// 2. 创建监听者类，即事件处理函数，需要使用 @Subscribe 进行注解
private static class EventListener {
@Subscribe
public void dealWithEvent(Message msg) {
System.out.println("接收消息" + msg.getMessage());
try {
Thread.sleep(10000);
} catch (InterruptedException e) {
throw new RuntimeException(e);
}
System.out.println("处理消息" + msg.getMessage());
}
}

public static void main(String[] args) {
// 3. 创建 EventBus 对象
EventBus eventBus = new EventBus("Test");
// 4. 注册监听者类
eventBus.register(new EventListener());
// 5. 发布消息
for (int i=0; i<5; i++) {
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
throw new RuntimeException(e);
}
System.out.println("---------");
eventBus.post(new Message("tttt" + i));
}
}

}
　　执行输出信息：
---------
接收消息tttt0
处理消息tttt0
---------
接收消息tttt1
处理消息tttt1
---------
接收消息tttt2
处理消息tttt2
---------
接收消息tttt3
处理消息tttt3
---------
接收消息tttt4
处理消息tttt4    
　



AsyncEventBus（EventBus 的异步实现）

com.google.common.eventbus.AsyncEventBus 







