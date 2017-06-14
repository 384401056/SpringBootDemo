package com.blueice.soundsystem;

/**
 * Created by Administrator on 2017/6/7.
 */
//@Component //使用自动扫描注入
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper的孤独的心灵俱乐部乐队";
    private String artist = "披头士";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
