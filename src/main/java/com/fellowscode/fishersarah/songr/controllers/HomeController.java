package com.fellowscode.fishersarah.songr.controllers;

import com.fellowscode.fishersarah.songr.models.Album;
import com.fellowscode.fishersarah.songr.models.AlbumRepository;
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

    // To make this a route, we need to specify the method and the path
    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    //Create a hello world route
    @GetMapping("/hello/{username}")
    public String getHello(@RequestParam(required = false, defaultValue = "user") String username,
                           Model model) {
        System.out.println(username);
        model.addAttribute("username", username);
        return "hello";
    }

    //Create a route that turns words into upper case
    @GetMapping("/capitalize/{text}")
    // This will return the {text} in capital letters
    public String getCapitalizeRoute(@PathVariable String text, Model model) {
        model.addAttribute("text", text.toUpperCase());
        return "capitalize";
    }

    //Create a route at /albums that shows three album instances. (Hardcoded for today’s lab; create an array that contains three albums, and then display those three on the page.)
    @GetMapping("/albums")
    public String getAlbums(Model model) {
//        Album[] albums = new Album[] {
//                new Album("Into The Wild", "Eddie Vedder", 16, 1_984, "https://open.spotify.com/album/13xlpKbai3GGoMSr75lOeX"),
//                new Album("corinne bailey rae", "Corinne Bailey Rae", 11, 2_735, "https://en.wikipedia.org/wiki/Corinne_Bailey_Rae_(album)#/media/File:Corinne_Bailey_Rae_(US_and_Japan).png"),
//                new Album("The Lord of the Rings: The Fellowship of the Ring: Original Motion Picture Soundtrack", "Howard Shore, Suzana Perić", 18, 4_289, "https://en.wikipedia.org/wiki/The_Lord_of_the_Rings:_The_Fellowship_of_the_Ring_(soundtrack)#/media/File:Fotrcd-cover.jpg")
//        };

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
}
