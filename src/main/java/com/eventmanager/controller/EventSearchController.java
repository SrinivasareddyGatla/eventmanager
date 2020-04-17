package com.eventmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EventSearchController {

    @GetMapping("/search")
    public String searchEvents(@RequestParam final String searchterm, final Model model) {
        System.out.println(searchterm);
        return "search";
    }
}
