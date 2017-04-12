package com.blueice.springmvcconfig;


import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/8.
 */
@Component
public class DiscA implements CompactDisc{

    @Override
    public void play() {
        System.out.println("DiscA is Playe!!!!");
    }
}
