package com.blueice.hrm.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/4.
 */
public class User implements Serializable {
    private int id;
    private String loginname; //登陆名
    private String password;  //密码
    private int status;       //状态
    private Date create_date; //建档日期
    private String username;  //用户名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
