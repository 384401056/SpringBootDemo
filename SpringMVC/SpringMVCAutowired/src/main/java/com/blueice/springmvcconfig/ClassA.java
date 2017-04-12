package com.blueice.springmvcconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/8.
 */
@Component
public class ClassA {

    private CompactDisc disc;

    public ClassA(CompactDisc disc) {
        this.disc = disc;
    }

    public CompactDisc getDisc() {
        return disc;
    }

    public void setDisc(CompactDisc disc) {
        this.disc = disc;
    }
}
