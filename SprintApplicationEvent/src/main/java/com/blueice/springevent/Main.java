package com.blueice.springevent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Main {
    public static void main(String[] agrs){
        /**
         * 1.新建一个Evetn对象.
         * 2.新建一个Publisher.来发布Event对象。
         * 3.所有实现了ApplicationListener<Event对象>类，都可以收到发布的Event对象，并在onApplicationEvent方法中执行。
         */
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);
        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publisher("Hello Application Event!!!");
    }
}
