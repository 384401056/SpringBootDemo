package com.blueice.springasync;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/31.
 */
@Service
public class AsyncTaskServer {

    @Async //注明该方法是一个异步方法。如果注释在类级别，则表明该类中所有方法都是异步方法。
    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务:"+i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:"+(i+1));
    }

}
