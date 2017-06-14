package com.blueice.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 如果不使用自动扫描注入，则要使用此配置文件进行手动
 * Created by Administrator on 2017/6/7.
 */
@Configuration
public class MyConfig {
    @Bean
    public SgtPeppers sgtppers(){
        return new SgtPeppers();
    }

    @Bean(name = "aaa")
    public BlankDisc anotherBlankDisc(){
        return new BlankDisc("anotherBlankDisc","anotherBlankDisc");
    }

    @Bean
    @Primary
    public BlankDisc blankDisc(){
        return new BlankDisc("Blank的俱乐部乐队","Blank");
    }


    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(blankDisc());
    }


}
