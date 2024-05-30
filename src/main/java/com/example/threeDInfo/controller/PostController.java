package com.example.threeDInfo.controller;

import com.example.threeDInfo.dto.Post;
import com.example.threeDInfo.service.api.PostService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    // Определяем зависимость от сервиса PostService, который будет инъектирован через конструктор
    private final PostService postService;

    // Конструктор класса PostController. Аннотация @Qualifier указывает, что должен быть использован
    // конкретный бин с именем "dbPostService" для внедрения зависимости
    public PostController(@Qualifier("dbPostService") PostService postService) {
        this.postService = postService;
    }

    // Метод, обрабатывающий GET-запросы на корневой URL ("/")
    @GetMapping("/")
    public String hello(Model model, @RequestParam(required = false) String query) {
        // Добавляем в модель результат вызова метода search() из postService
        // Параметр query может быть null, если не указан в запросе
        model.addAttribute("posts", postService.search(query));

        // Возвращаем название шаблона (view), который будет использован для рендеринга ответа
        // В этом случае, шаблон с именем "hello"
        return "hello";
    }
    @GetMapping("/posts/{id}")
    public String getPostDetails(@PathVariable Long id, Model model) {
        // Получаем пост по ID
        Post post = postService.findAllByIdIn(id);
        model.addAttribute("post", post);
        return "postDetails";
    }
}
