package com.blueice.spring_boot_starter_hello;

/**
 * Created by Administrator on 2017/5/26.
 */
public class HelloServiceProperties {
    private static final String MSG="world";

    private String msg = MSG;

    public static String getMSG() {
        return MSG;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
