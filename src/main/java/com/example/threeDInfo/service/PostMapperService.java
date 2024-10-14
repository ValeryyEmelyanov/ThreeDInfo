package com.example.threeDInfo.service;

import com.example.threeDInfo.dto.PostDTO;
import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.entity.User;
import org.springframework.stereotype.Service;

@Service
public class PostMapperService {

    public Post toPostEntity(PostDTO postDTO, User user) {
        Post post = new Post();

        post.setUser(user);
        post.setTitle(postDTO.getTitle());
        post.setBody(postDTO.getBody());
        return post;
    }

    public PostDTO toDTO(Post postEntity) {
        PostDTO postDTO = new PostDTO();
        postDTO.setTitle(postEntity.getTitle());
        postDTO.setBody(postEntity.getBody());


        return postDTO;
    }
}
