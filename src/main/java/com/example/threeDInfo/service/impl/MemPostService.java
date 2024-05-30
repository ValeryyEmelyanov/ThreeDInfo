package com.example.threeDInfo.service.impl;

import com.example.threeDInfo.dto.Post;
import com.example.threeDInfo.service.api.PostService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    @Override
    public Post findAllByIdIn(Long id) {
        return posts.stream()
                .filter(post -> post.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Post> searchInBody(String query) {
        return null;
    }

    @Override
    public List<Post> findPostsAfterDate(LocalDate date) {
        return null;
    }

    @Override
    public List<Post> findAllById(List<Long> ids) {
        return null;
    }

    @Override
    public List<Post> findAllSortedByDate() {
        return null;
    }

    @Override
    public List<Post> savePost(Post post) {
        return null;
    }
}