package com.fellowscode.fishersarah.songr.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    // The string in mappedBy specifies the instance variable of the class it is building a relationship with
    @OneToMany(mappedBy = "album")
    List<Song> songs;

    public String title;
    public String artist;
    public int songCount;
    public int length; //in seconds
    public String imageUrl;

    public Album(){}

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String toString() {
        return String.format("%s's album %s contains %d songs and is %s seconds for total length. You can find an image of the album here %s. The songs included are %s", artist, title, songCount, length, imageUrl, songs.toString());
    }

    public Long getId() {
        return id;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public int getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
