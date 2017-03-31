package com.blueice.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/30.
 */

public class BeanWayService {

    public BeanWayService(){
        super();
        System.out.println("初始化构建函数 BeanWayService");
    }


    public void init(){
        System.out.println("@Bean-init-method");
    }

    public void destory(){
        System.out.println("@Bean-destory-method");
    }

}
