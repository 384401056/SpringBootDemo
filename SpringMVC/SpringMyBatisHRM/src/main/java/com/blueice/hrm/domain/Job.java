package com.blueice.hrm.domain;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/4.
 */
public class Job implements Serializable {
    private int id;
    private String name;  //职位名称.
    private String remark;//详细描述.

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
