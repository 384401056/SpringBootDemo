package com.blueice.springprofile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 通过动态设置Profile来实现不同的对象。
 *
 */
public class Main {

    public static void main(String[] agrs){

        //这里不设置配置文件。
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        //动态设置ProFile。
        context.getEnvironment().setActiveProfiles("dev");
        context.register(ProFileConfig.class);
        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();

    }


}
