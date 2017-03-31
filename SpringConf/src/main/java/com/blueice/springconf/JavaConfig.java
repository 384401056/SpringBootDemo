package com.blueice.springconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/3/29.
 */
@Configuration
public class JavaConfig {

    @Bean
    public FunctionServer functionServer(){
        return new FunctionServer();
    }

    @Bean
    public UseFunctionServer useFunctionServer(){
        UseFunctionServer useFunctionServer = new UseFunctionServer();
        useFunctionServer.setFunctionServer(functionServer());
        return useFunctionServer;
    }

    @Bean
    public UseFunctionServer useFunctionServer(FunctionServer functionServer){
        UseFunctionServer useFunctionServer = new UseFunctionServer();
        useFunctionServer.setFunctionServer(functionServer);
        return useFunctionServer;
    }

}
