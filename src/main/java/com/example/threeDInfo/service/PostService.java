package com.example.threeDInfo.service;

import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    // Получение всех постов, отсортированных по дате
    public List<Post> findAllSortedByDate() {
        return postRepository.findAllByOrderByCreatedDateDesc();
    }

    // Поиск поста по ID
    public Post findById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    // Добавление/обновление поста
    public void savePost(Post post) {
        postRepository.save(post);
    }

    // Удаление поста по ID
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    // Получение постов, созданных после определенной даты
    public List<Post> findPostsAfterDate(LocalDate date) {
        return postRepository.findAllByCreatedDateAfter(date);
    }
}
