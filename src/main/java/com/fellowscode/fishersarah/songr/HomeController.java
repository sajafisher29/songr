package com.fellowscode.fishersarah.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // To make this a route, we need to specify the method and the path
    @GetMapping("/")
    public String getHome() {
        return "home";
    }
}
