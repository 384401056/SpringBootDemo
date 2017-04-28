package com.blueice.bean;

/**
 * Created by Administrator on 2017/4/21.
 */
public class Card {

    private int id;
    private String code;

    public Card() {
    }

    public Card(int id, String code) {
        this.id = id;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
