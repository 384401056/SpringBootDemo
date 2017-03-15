package com.blueice.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/3/15.
 */

@Configuration //相当于把该类作为spring的xml配置文件中的<beans>
@ComponentScan("com.blueice.aop")
@EnableAspectJAutoProxy //开启Spring对AspectJ的支持
public class AopConfig {
}
