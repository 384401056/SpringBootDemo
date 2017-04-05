package com.blueice.springevent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/3/31.
 */
@Component //（把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
public class DemoPublisher {

    @Autowired
    ApplicationContext context;

    public void publisher(String msg){
        context.publishEvent(new DemoEvent(this,msg));  //使用publishEvent方法来发布。
    }
}
