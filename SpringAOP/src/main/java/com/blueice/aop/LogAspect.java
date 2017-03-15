package com.blueice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/3/15.
 */



@Aspect //声明一个切面。
@Component //让此切面成为Spring容器管理的Bean。
public class LogAspect {

    @Pointcut("execution(* com.blueice.aop.DemoAnnotationServer.*(..))")//声明切点
    public void annotaionPointCut1(){};

    @Pointcut("execution(* com.blueice.aop.DemoMethodServer.*(..))")//声明切点
    public void annotaionPointCu2(){};

    @After("annotaionPointCut1()") //声明建言，并使用上面声明的切点。
    public void after(JoinPoint joinPoint){ //JoinPoint 表示目标类连接点对象
        MethodSignature signature = (MethodSignature) joinPoint.getSignature(); //获取连接点的方法签名对象
        Method method = signature.getMethod();
        Action action  = method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());
    }

//    @Before("execution(*com.blueice.aop.DemoMethodServer.*(..))") //声明一个建言，此建言直接使用拦截规则作为参数。
    @Before("annotaionPointCu2()")//声明一个建言，此建言直接使用拦截规则作为参数。
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature(); //获取连接点的方法签名对象
        Method method = signature.getMethod();
        System.out.println("方法规则拦截"+method.getName());
    }

}
