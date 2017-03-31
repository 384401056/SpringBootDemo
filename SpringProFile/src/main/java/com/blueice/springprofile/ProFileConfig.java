package com.blueice.springprofile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Administrator on 2017/3/30.
 */
@Configuration
public class ProFileConfig {

    @Bean
    @Profile("dev") //根据不同的配置文件，返回不同的对象。
    public DemoBean devDemoBean(){
        return new DemoBean("From Development ProFile");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean(){
        return new DemoBean("From Production ProFile");
    }

}
