package com.blueice.springprofile;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Student {

    private String id;
    private String name;
    private String age;
    private String[] hobby;
    private HashMap<String,Integer> score;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public HashMap<String, Integer> getScore() {
        return score;
    }

    public void setScore(HashMap<String, Integer> score) {
        this.score = score;
    }
}
