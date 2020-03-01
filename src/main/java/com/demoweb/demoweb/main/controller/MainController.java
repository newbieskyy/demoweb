package com.demoweb.demoweb.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/board")
    public String Main() {
        return "board/board.html";
    }
}
