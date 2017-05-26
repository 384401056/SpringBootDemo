package com.blueice.springscheduled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/4/5.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
//        TaskScheduledService service = context.getBean(TaskScheduledService.class);
    }
}
