package com.blueice.soundsystem;

/**
 * Created by Administrator on 2017/6/7.
 */
public class BlankDisc implements CompactDisc {

    private String title;
    private String artist;

    public BlankDisc(){

    }

    public BlankDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

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
