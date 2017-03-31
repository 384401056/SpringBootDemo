package com.blueice.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/15.
 */
@Service
public class DemoAnnotationServer {
    @Action(name =  "注解拦截的操作Add")
    public void add(){
        System.out.println("DemoAnnotaionServer Add...");
    }

    @Action(name =  "注解拦截的操作delete")
    public void delete(){
        System.out.println("DemoAnnotaionServer delete...");
    }
}
