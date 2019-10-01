package com.fellowscode.fishersarah.songr;

public class Album {
    public String title;
    public String artist;
    public int songCount;
    public int length; //in seconds
    public String imageUrl;

    Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String toString() {
        return String.format("%s's album %s contains %d songs and is %s seconds for total length. You can find an image of the album here %s", artist, title, songCount, length, imageUrl);
    }

}
