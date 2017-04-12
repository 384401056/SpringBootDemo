package com.blueice.springmvcconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2017/4/8.
 */
@Configuration
@ComponentScan
public class ClassConfig {
    @Bean
    public CompactDisc compactDisc(){

        //根据随机数返回不同的对象。
        int value = (int)(Math.random()*10);
        switch (value){
            case 1:
            case 2:
            case 3:
                return new DiscA();
            case 4:
            case 5:
            case 6:
                return new DiscB();
            case 7:
            case 8:
            case 9:
                return new DiscC();
            default:
                return new DiscA();
        }
    }

    @Bean
    public ClassA classA(CompactDisc compactDisc){
        return new ClassA(compactDisc);
    }
}
