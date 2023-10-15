package com.kailo.OAuth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }
    @GetMapping("/secured")
    public String secured() {
        return ("<h1>Secured</h1>");
    }

}
