package com.example.threeDInfo.controller;

import com.example.threeDInfo.dto.PostDTO;
import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.service.PostService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/postInput")
    public String postInput () {

        return "postInput";
    }

//    @PostMapping("/create")
//    public String createPost(@Valid @RequestBody PostDTO postDTO) {
//        postService.savePost(postDTO);
//        return "Post created successfully!";
//    }

}
