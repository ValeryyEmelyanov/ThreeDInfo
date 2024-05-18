package com.example.restaurantvoting.service.impl;

import com.example.restaurantvoting.dto.Post;
import com.example.restaurantvoting.service.api.PostService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MemPostService implements PostService {

    private ArrayList<Post> posts = new ArrayList<Post>(Arrays.asList(
            Post.builder()
                    .title("First title")
                    .body("First body")
                    .img("/images/butter.jpg")
                    .build(),
            Post.builder()
                    .title("Second title")
                    .body("Second body")
                    .img("/images/cheess.jpg")
                    .build(),
            Post.builder()
                    .title("Third title")
                    .body("Third body")
                    .img("/images/milk.jpg")
                    .build()
    )
    );


    @Override
    public List<Post> search() {
        return posts;
    }
}
