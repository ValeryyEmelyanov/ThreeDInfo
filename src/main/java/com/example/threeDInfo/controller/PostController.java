package com.example.threeDInfo.controller;

import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.service.PostService; // Подключаем сервисный слой
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/posts")  // Общий путь для всех методов в контроллере
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) { // Внедрение через конструктор для большей гибкости и тестируемости
        this.postService = postService;
    }

}
