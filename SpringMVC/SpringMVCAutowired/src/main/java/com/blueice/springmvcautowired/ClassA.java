package com.blueice.springmvcautowired;

import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;

/**
 * Created by Administrator on 2017/4/8.
 */
@Component
public class ClassA implements CompactDisc{

    private String name;
    private int age;

    public ClassA() {
        this.name = "ClassA";
        this.age = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public void play() {
        System.out.println("name:"+getName());
        System.out.println("age:"+getAge());
    }
}
