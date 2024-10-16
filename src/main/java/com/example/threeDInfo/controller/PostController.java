package com.example.threeDInfo.controller;

import com.example.threeDInfo.dto.PostDTO;
import com.example.threeDInfo.exception.UserNotFoundException;
import com.example.threeDInfo.service.PostMapperService;
import com.example.threeDInfo.service.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PostController {

    private final PostMapperService postMapperService;
    private final PostService postService;

    public PostController(PostMapperService postMapperService, PostService postService) {
        this.postMapperService = postMapperService;
        this.postService = postService;
    }

    @GetMapping("/posts/postInput")
    public String postInput () {

        return "postInput";
    }

    @PostMapping("/posts/postInput")
    public String createPost(@ModelAttribute PostDTO postDTO, RedirectAttributes redirectAttributes) {
        try {
            postMapperService.createPost(postDTO);
            redirectAttributes.addFlashAttribute("successMessage", "Post created successfully!");
        } catch (UserNotFoundException e) {
            redirectAttributes.addFlashAttribute("errorMessage", e.getMessage());
        }
        return "redirect:/";
    }
}
