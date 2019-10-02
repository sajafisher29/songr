package com.fellowscode.fishersarah.songr;

import com.fellowscode.fishersarah.songr.models.Album;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlbumTest {
    Album[] testAlbum;

    //Testing the constructor and toString
    @Test public void testConstructor() {
        testAlbum = new Album[1];
        testAlbum[0] = new Album("Into The Wild", "Eddie Vedder", 16, 1_984, "https://open.spotify.com/album/13xlpKbai3GGoMSr75lOeX");
            assertEquals("Eddie Vedder's album Into The Wild contains 16 songs and is 1984 seconds for total length. You can find an image of the album here https://open.spotify.com/album/13xlpKbai3GGoMSr75lOeX", "Eddie Vedder's album Into The Wild contains 16 songs and is 1984 seconds for total length. You can find an image of the album here https://open.spotify.com/album/13xlpKbai3GGoMSr75lOeX", testAlbum[0].toString());
    }

}