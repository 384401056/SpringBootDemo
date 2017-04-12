package com.blueice.springmvcautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 通过对Bean添加注解Autowired，进行自动装配。
 */
@Component
public class ClassB {

    @Autowired //自动装配。不需要在ClassConfig文件中@Bean了。会自动创建disc,虽然CompactDisc是一个接口。
    private CompactDisc disc;

    //@Autowired也可写在这里。
    public ClassB(CompactDisc disc) {
        this.disc = disc;
    }

    public CompactDisc getDisc() {
        return disc;
    }

    public void setDisc(CompactDisc disc) {
        this.disc = disc;
    }
}
