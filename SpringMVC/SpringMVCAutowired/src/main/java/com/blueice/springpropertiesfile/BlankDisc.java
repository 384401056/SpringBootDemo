package com.blueice.springpropertiesfile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/9.
 */
@Component
public class BlankDisc {

    private String title;
    private String artist;
    private int count;

    //在自动装配的情况下，使用占位符。
    @Autowired
    public BlankDisc(@Value("${title}") String title,@Value("${artist}") String artist,@Value("${count}") int count) {
        this.title = title;
        this.artist = artist;
        this.count = count;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
