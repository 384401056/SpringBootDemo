package com.blueice.springmvcconfig;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/4/8.
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class);
        ClassA classA = context.getBean(ClassA.class);
        classA.getDisc().play();
        context.close();
    }
}
