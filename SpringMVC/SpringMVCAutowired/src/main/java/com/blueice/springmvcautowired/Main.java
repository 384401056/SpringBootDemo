package com.blueice.springmvcautowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/4/8.
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class);
        ClassB classB = context.getBean(ClassB.class);
        classB.getDisc().play();
        context.close();
    }
}
