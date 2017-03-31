package com.blueice.beanscope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/3/27.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(ScopeConfig.class);

        //创建了两个DemoSingletonServer对象，其实它们都是同一个对象。
        DemoSingletonServer s1 = context.getBean(DemoSingletonServer.class);
        DemoSingletonServer s2 = context.getBean(DemoSingletonServer.class);

        //创建了两个DemoPrototypeServer对象，它们是不同的对象。
        DemoPrototypeServer p1 = context.getBean(DemoPrototypeServer.class);
        DemoPrototypeServer p2 = context.getBean(DemoPrototypeServer.class);

        System.out.println("s1和s2是否相等："+s1.equals(s2));
        System.out.println("p1和p2是否相等："+p1.equals(p2));

        context.close();

    }

}
