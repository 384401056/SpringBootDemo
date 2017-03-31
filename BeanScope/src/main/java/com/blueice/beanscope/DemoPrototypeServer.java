package com.blueice.beanscope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/27.
 */
@Service
@Scope("prototype") //每次调用是创建一个新实例。
public class DemoPrototypeServer {

}
