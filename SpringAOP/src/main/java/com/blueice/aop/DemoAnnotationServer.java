package com.blueice.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/15.
 */
@Service
public class DemoAnnotationServer {
    @Action(name =  "注解拦截的操作")
    public void add(){
        System.out.println("DemoAnnotaionServer Add...");
    }
}
