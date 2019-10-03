package com.fellowscode.fishersarah.songr.controllers;

import com.fellowscode.fishersarah.songr.models.Album;
import com.fellowscode.fishersarah.songr.models.AlbumRepository;
import com.fellowscode.fishersarah.songr.models.Song;
import com.fellowscode.fishersarah.songr.models.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

// Controller specifies routes and actions

@Controller
public class HomeController {

    @Autowired
    AlbumRepository albumRepository;

    @Autowired
    SongRepository songRepository;

    // To make this a route, we need to specify the method and the path
    @GetMapping("/")
    public String getHome(@RequestParam(required = false, defaultValue = "user") String username, Model model) {

        System.out.println(username);
        model.addAttribute("username", username);
        return "home";

    }

    //Create a route at /albums that shows three album instances

    @GetMapping("/albums")
    public String getAlbums(Model model) {

        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "albums";

    }

    @PostMapping("/albums")
    public RedirectView addTheAlbum(String title, String artist, int songCount, int length, String imageUrl) {

        Album album = new Album(title, artist, songCount, length, imageUrl);
        albumRepository.save(album);
        return new RedirectView("/albums");

    }

    @PostMapping("albums/delete")
    public RedirectView deleteTheAlbum(long id) {

        albumRepository.deleteById(id);
        return new RedirectView("/albums");

    }

    @GetMapping("/albums/{id}")
    public String getAlbumDetail(@PathVariable long id, Model model) {
        model.addAttribute("album", albumRepository.getOne(id));
        return "album-details";
    }

    @PostMapping("/album")
    public RedirectView addSong(long id, Song song) { // Song song needs to be adjusted based on front end

        Album album = albumRepository.getOne(id);
        Song newSong = new Song();
        newSong.setAlbum(album);
        songRepository.save(newSong);

        return new RedirectView("/albums");
    }

}
