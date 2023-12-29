package org.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();
    private String name;
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer() {

    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Music queue:");
        for (Music music : musicList) {
            System.out.println("Track: " + music.getSong());
        }
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
