package com.blueice.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/15.
 */
@Service
public class DemoMethodServer {
    public void add(){
        System.out.println("DemoMethodServer Add...");
    }
}
