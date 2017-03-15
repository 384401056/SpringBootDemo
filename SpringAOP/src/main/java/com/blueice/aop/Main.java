package com.blueice.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/15.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationServer demoAnnotationServer = context.getBean(DemoAnnotationServer.class);
        DemoMethodServer demoMethodServer = context.getBean(DemoMethodServer.class);
        demoAnnotationServer.add();
        demoMethodServer.add();
        context.close();

    }

}
