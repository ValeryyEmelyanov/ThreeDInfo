package com.example.restaurantvoting.service.impl;

import com.example.restaurantvoting.dto.Post;
import com.example.restaurantvoting.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Реализация сервиса для работы с постами в памяти.
 */
@Service
public class MemPostService implements PostService {

    private ArrayList<Post> posts = new ArrayList<>(Arrays.asList());

    @Override
    public List<Post> search(String query) {
        return query != null && !query.isEmpty() ?
                posts.stream()
                        .filter(post -> post
                        .getTitle()
                        .toLowerCase()
                        .contains(query.toLowerCase()))
                        .collect(Collectors.toList()) :
                posts;
    }
}