package com.demoweb.demoweb.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home() {
        return "index.html";
    }

    @GetMapping("/board")
    public String board() {
        return "board/board.html";
    }

    @GetMapping("/about")
    public String about() {
        return "etc/about.html";
    }
}
