package com.blueice.bean;

/**
 * Created by Administrator on 2017/4/21.
 */
public class Person {
    private int id;
    private String name;
    private String sex;
    private int age;
    //person和card的一对一关系
    private Card card;

    public Person() {
    }

    public Person(int id, String name, String sex, int age, Card card) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.card = card;
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
