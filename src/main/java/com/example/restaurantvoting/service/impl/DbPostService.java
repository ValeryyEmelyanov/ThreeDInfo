package com.example.restaurantvoting.service.impl;

import com.example.restaurantvoting.dto.Post;
import com.example.restaurantvoting.jpa.PostRepository;
import com.example.restaurantvoting.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Реализация сервиса для работы с постами из базы данных.
 */
@Service
public class DbPostService implements PostService {

    private final PostRepository postRepository;

    public DbPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> search(String query) {
        return query != null && !query.isEmpty() ?
                postRepository.findAllByTitleContainingIgnoreCase(query) :
                postRepository.findAll();
    }
}