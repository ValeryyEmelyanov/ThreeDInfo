package com.example.restaurantvoting.controller;

import com.example.restaurantvoting.service.api.PostService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    private final PostService postService;

    public PostController(@Qualifier("dbPostService") PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String hello (Model model, @RequestParam(required = false) String query){
        model.addAttribute("posts", postService.search(query));
        return "hello";
    }
}

