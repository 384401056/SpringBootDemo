package com.blueice.springasync;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Main {


    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskServer asyncTaskServer = context.getBean(AsyncTaskServer.class);

        for (int i=0;i<10;i++){
            asyncTaskServer.executeAsyncTask(i);
            asyncTaskServer.executeAsyncTaskPlus(i);
        }

        context.close();
    }

}
