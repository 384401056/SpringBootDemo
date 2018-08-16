package com.blueice.soundsystem;

/**
 * Created by Administrator on 2017/6/11.
 */
public class CDPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(){

    }

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public CompactDisc getCompactDisc() {
        return compactDisc;
    }

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
}
