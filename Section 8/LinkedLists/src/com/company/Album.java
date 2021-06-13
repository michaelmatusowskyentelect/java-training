package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration){
        if (findSong(name) != null)
            return false;
        songs.add(new Song(name, duration));
        return true;
    }

    private Song findSong(String name){
        for (Song song : songs) {
            if (song.getTitle().equals(name))
                return song;
        }
        return null;
    }

    public boolean addToPlayList(int songNumber, LinkedList<Song> playlist){
        if (songNumber > songs.size())
            return false;
        playlist.add(songs.get(songNumber-1));
        return true;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> playlist){
        if (findSong(songName) == null)
            return false;
        playlist.add(findSong(songName));
        return true;
    }
}
