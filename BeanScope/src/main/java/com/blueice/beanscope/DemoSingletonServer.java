package com.blueice.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/27.
 */

@Service
@Scope("singleton") //默认不写就是Singleton,每次调用都共享一个实例。
public class DemoSingletonServer {

}
