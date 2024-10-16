package com.example.threeDInfo.controller;

import org.springframework.ui.Model;
import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Controller
public class MainController {

    private final PostService postService;

    @Autowired
    public MainController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String hello(Model model) {
        List<Post> posts = postService.getAllPosts();
        model.addAttribute("posts", posts);
        return "startPage";
    }

    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        Optional<Post> post = postService.findById(id);
        model.addAttribute("post", post);
        return "postView";
    }
}