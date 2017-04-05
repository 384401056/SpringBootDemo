package com.blueice.springevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听器
 * Created by Administrator on 2017/3/31.
 */
@Component //（把普通pojo实例化到spring容器中，相当于配置文件中的<bean id="" class=""/>）
public class DemoListener implements ApplicationListener<DemoEvent> {

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println("(bean-demoListener)接收到了(bean-demoPublisher)发布的信息："+ msg);
    }
}
