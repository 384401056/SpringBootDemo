package com.blueice.springmvcconfig;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/8.
 */
@Component
public class DiscC implements CompactDisc{
    
    @Override
    public void play() {
        System.out.println("DiscC is Playe!!!!");
    }
}
