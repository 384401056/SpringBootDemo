package com.blueice.springconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/29.
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        UseFunctionServer useFunctionServer = context.getBean(UseFunctionServer.class);
        System.out.println(useFunctionServer.sayHello("Java config"));
        context.close();
    }

}
