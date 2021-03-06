package com.blueice.hrm.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Notice implements Serializable{
    private int id;
    private String title;     //标题
    private String content;   //内容
    private Date create_date; //发布日期
    private User user;      //发布人

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
