package com.fellowscode.fishersarah.songr;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private int length; //in seconds
    private String imageUrl;

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
