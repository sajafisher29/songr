package com.fellowscode.fishersarah.songr.models;

import javax.persistence.*;

@Entity
public class Song {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    long id;

    //Build relationship between Song and Album
    @ManyToOne
    Album album;

    public String title;
    public int length; // Length in seconds
    public int trackNumber;

    public Song(){};

    public Song(String title, int length, int trackNumber) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String toString() {
        return String.format("%s song is %s seconds long and is track number %d.", title, length, trackNumber);
    }
}
