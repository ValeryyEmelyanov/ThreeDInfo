package com.example.threeDInfo.service.impl;

import com.example.threeDInfo.dto.Post;
import com.example.threeDInfo.jpa.PostRepository;
import com.example.threeDInfo.service.api.PostService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

@Service("dbPostService")
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

    @Override
    public Post findAllByIdIn(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Override
    public List<Post> searchInBody(String query) {
        return postRepository.findAllByTitleContainingIgnoreCaseOrBodyContainingIgnoreCase(query, query);
    }

    @Override
    public List<Post> findPostsAfterDate(LocalDate date) {
        return postRepository.findAllByCreatedDateAfter(date);
    }

    @Override
    public List<Post> findAllById(List<Long> ids) {
        return postRepository.findAllByIdIn(ids);
    }

    @Override
    public List<Post> findAllSortedByDate() {
        return postRepository.findAllByOrderByCreatedDateDesc();
    }
    public List<Post> savePost(Post post) {
        post.setCreatedDate(LocalDateTime.now()); // Устанавливаем текущее время
        return Collections.singletonList(postRepository.save(post));
    }

}
