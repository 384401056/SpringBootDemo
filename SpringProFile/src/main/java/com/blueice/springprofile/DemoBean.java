package com.blueice.springprofile;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by Administrator on 2017/4/5.
 */
public class DemoBean {

    private String content;

    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
