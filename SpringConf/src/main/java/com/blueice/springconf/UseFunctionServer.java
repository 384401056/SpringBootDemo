package com.blueice.springconf;

/**
 * Created by Administrator on 2017/3/29.
 */
public class UseFunctionServer {

    FunctionServer functionServer;

    public void setFunctionServer(FunctionServer functionServer) {
        this.functionServer = functionServer;
    }

    public String sayHello(String world){
        return functionServer.sayHello(world);
    }
}
