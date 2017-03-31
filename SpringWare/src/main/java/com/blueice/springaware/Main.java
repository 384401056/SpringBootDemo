package com.blueice.springaware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService =  context.getBean(AwareService.class);

        awareService.outputResult();

        context.close();
    }
}
