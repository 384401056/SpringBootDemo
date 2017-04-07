package com.blueice.srpingtaskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/5.
 */
@Service
public class TaskService {

    @Async //注解该方法是一个异步方法,如果注解在类级别，则批该类下所有方法都是异步的。
    public void executeAsyncTask(int i){
        System.out.println("执行异步任务："+i);
    }

    @Async
    public void executeAsyncTaskPlus(int i){
        System.out.println("执行异步任务+1："+i);
    }

}
