package com.example.threeDInfo.controller;

import com.example.threeDInfo.dto.Post;
import com.example.threeDInfo.service.api.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class PostController {

    private final PostService postService;
    @Autowired
    private ImageUploader imageUploader;

    public PostController(@Qualifier("dbPostService") PostService postService) {
        this.postService = postService;
    }

    // Главная страница с поиском постов
    @GetMapping("/")
    public String listPosts(Model model, @RequestParam(required = false) String query) {
        List<Post> posts = postService.search(query);
        model.addAttribute("posts", posts);
        return "hello";  // Проверяем, что шаблон hello существует
    }

    // Показ формы для создания нового поста
    @GetMapping("/posts/add")
    public String showAddPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "editPost";  // Проверяем, что шаблон editPost существует и настроен правильно
    }

    // Просмотр информации о посте
    @GetMapping("/posts/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        Post post = postService.findAllByIdIn(id);
        if (post == null) {
            return "redirect:/";
        }
        model.addAttribute("post", post);
        return "viewPost";  // Проверяем, что шаблон viewPost существует и настроен правильно
    }


    // Показ формы для редактирования поста
    @GetMapping("/posts/{id}/edit")
    public String showEditPostForm(@PathVariable Long id, Model model) {
        Post post = postService.findAllByIdIn(id);
        if (post == null) {
            return "redirect:/";
        }
        model.addAttribute("post", post);
        return "editPost";  // Проверяем, что шаблон editPost используется и для редактирования
    }

    // Обновление поста
    @PostMapping("/posts/add")
    public String addPost(@ModelAttribute Post post) {
        post.setCreatedDate(LocalDateTime.now()); // Устанавливаем текущее время
        postService.savePost(post);
        return "redirect:/"; // Перенаправление на главную страницу после добавления поста
    }


//    @PostMapping("/posts/add")
//    public String addPost(@ModelAttribute Post post, @RequestParam("file") MultipartFile file) throws IOException {
//        // Загружаем изображение и получаем его имя
//        String imageUrl = imageUploader.uploadImage(file, post.getId());
//        if (imageUrl != null) {
//            // Если изображение было загружено успешно, устанавливаем его путь в объекте Post
//            post.setImgUrl(imageUrl);
//        }
//        // Устанавливаем дату создания поста
//        post.setCreatedDate(LocalDateTime.now());
//        // Сохраняем пост в базе данных
//        postService.savePost(post);
//        return "redirect:/";
//    }

    // Удаление поста
    @DeleteMapping("/posts/{id}/delete")
    public String deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return "redirect:/";
    }
}
