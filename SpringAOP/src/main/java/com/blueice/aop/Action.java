package com.blueice.aop;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/3/15.
 */
@Target(ElementType.METHOD)//所修饰的对象范围.
@Retention(RetentionPolicy.RUNTIME) //表明这种类型的注解会被保留到那个阶段
@Documented //表明这个注解应该被 javadoc工具记录
public @interface Action {
    String name();
}
