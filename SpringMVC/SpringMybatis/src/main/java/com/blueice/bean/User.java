package com.blueice.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/20.
 */
public class User implements Serializable {

    private int id;
    private String name;
    private String sex;
    private int age;

    public User(){

    }

    public User(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
