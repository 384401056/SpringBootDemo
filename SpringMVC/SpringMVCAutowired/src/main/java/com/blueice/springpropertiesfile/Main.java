package com.blueice.springpropertiesfile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/4/9.
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExpressConfig.class);
        BlankDisc blankDisc = context.getBean(BlankDisc.class);
        System.out.println(blankDisc.getTitle());
        System.out.println(blankDisc.getArtist());
        System.out.println(blankDisc.getCount()+1);
        context.close();
    }
}
