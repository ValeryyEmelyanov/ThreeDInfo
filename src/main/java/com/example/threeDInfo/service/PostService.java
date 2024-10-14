package com.example.threeDInfo.service;

import com.example.threeDInfo.dto.PostDTO;
import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.entity.User;
import com.example.threeDInfo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> findAll() {
        return postRepository.findAllByOrderByCreatedDateDesc();
    }

    public List<Post> findAllPublished() {
        return postRepository.findAllByPublishedTrueOrderByCreatedDateDesc();
    }

    public List<Post> findPostsByUser(User user) {
        return postRepository.findAllByUserAndPublishedTrueOrderByCreatedDateDesc(user);
    }

    public Optional<Post> findById(Long id) {
        return postRepository.findById(id);
    }

    public Post savePost(Post post) {
        return postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    public List<Post> findPostsAfterDate(LocalDate date) {
        return postRepository.findAllByCreatedDateAfter(date);
    }

    public List<Post> getPostsByUser(User user) {
        return postRepository.findAllByUser(user);
    }

    public List<Post> getAllPosts() {
        return postRepository.findAllByOrderByCreatedDateDesc();
    }

    public Post createPost(Post post) {
        post.setCreatedDate(LocalDateTime.now());
        return postRepository.save(post);
    }

}
