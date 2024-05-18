package com.example.restaurantvoting.service.api;

import com.example.restaurantvoting.dto.Post;

import java.util.List;

public interface PostService {
    public default List<Post> search(){
        return null;
    };
}
