package com.example.restaurantvoting.controller;


import com.example.restaurantvoting.service.impl.MemPostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {

    private final MemPostService memPostService;

    public PostController(MemPostService memPostService) {
        this.memPostService = memPostService;
    }

    @GetMapping("/")
    public String hello (Model model){
        model.addAttribute("posts", memPostService.search());
        return "hello";
    }
}
