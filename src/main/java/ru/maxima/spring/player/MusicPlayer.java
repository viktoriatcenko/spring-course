package ru.maxima.spring.player;

import org.springframework.beans.propertyeditors.ClassArrayEditor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Now playing " + music.getSong());
    }
}
