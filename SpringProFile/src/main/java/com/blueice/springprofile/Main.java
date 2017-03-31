package com.blueice.springprofile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/30.
 */
public class Main {

    public static void main(String[] arsg){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod"); //设置活动的配置文件profile为dev.
        context.register(ProFileConfig.class); //注册配置类.
        context.refresh(); //刷新容器.

        //根据设置的配置文件来生成不同的对象。
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        context.close();
    }

}
