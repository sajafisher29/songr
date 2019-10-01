package com.fellowscode.fishersarah.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // To make this a route, we need to specify the method and the path
    @GetMapping("/")
    public String getHome() {
        return "home";
    }

    //Create a hello world route
    @GetMapping("/hello")
    public String getHello(@RequestParam(required = false, defaultValue = "user") String username,
                           Model model) {
        System.out.println(username);
        model.addAttribute("username", username);
        return "hello";
    }

    @GetMapping("/hello/{username}")
    // Username comes from the path
    public String getHelloRoute(@PathVariable String username, Model model) {
        model.addAttribute("username", username);
        return "home";
    }

    @GetMapping("/capitalize/{text}")
    // This will return the {text} in capital letters
    public String getCapitalizeRoute(@PathVariable String text, Model model) {
        model.addAttribute("text", text.toUpperCase());
        return "capitalize";
    }

    //Create a route that turns words into upper case

}
