package com.example.restaurantvoting.service.api;

import com.example.restaurantvoting.dto.Post;

import java.util.List;

public interface PostService {
    List<Post> search(String query);
}
