package com.example.threeDInfo.mapper;

import com.example.threeDInfo.dto.PostDTO;
import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.entity.User;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PostMapper {

    public Post toEntity(PostDTO postDTO, User user) {
        return Post.builder()
                .title(postDTO.getTitle())
                .body(postDTO.getBody())
                .createdDate(LocalDateTime.now())
                .published(false)
                .user(user)
                .build();
    }

    public PostDTO toDTO(Post post) {
        return PostDTO.builder()
                .firstName(post.getUser().getName())
                .title(post.getTitle())
                .body(post.getBody())
                .email(post.getUser().getEmail())
                .build();
    }
}
