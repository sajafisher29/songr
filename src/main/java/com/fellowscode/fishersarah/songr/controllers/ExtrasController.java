package com.fellowscode.fishersarah.songr.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

public class ExtrasController {

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

}
