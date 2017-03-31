package com.blueice.springbean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2017/3/30.
 */
public class JSR250WayService {


    public JSR250WayService(){
        super();
        System.out.println("初始化构建函数 JSR250WayService");
    }

    @PostConstruct //在构造函数执行完后执行。
    public void init(){
        System.out.println("@JSR250-init-method");
    }

    @PreDestroy //在Bean销毁之前执行。
    public void destory(){
        System.out.println("@JSR250-destory-method");
    }

}
