package com.blueice.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/15.
 */
@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(AopConfig.class);
//        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        DemoAnnotationServer demoAnnotationServer = context.getBean(DemoAnnotationServer.class);
        DemoMethodServer demoMethodServer = context.getBean(DemoMethodServer.class);
        demoAnnotationServer.add();
        demoAnnotationServer.delete();
        demoMethodServer.add();
        demoMethodServer.delete();
//        context.close();
    }
}
