package com.example.threeDInfo.service.api;

import com.example.threeDInfo.dto.Post;

import java.time.LocalDate;
import java.util.List;

public interface PostService {
    List<Post> search(String query);
    Post findAllByIdIn(Long id);
    List<Post> searchInBody(String query);
    List<Post> findPostsAfterDate(LocalDate date);
    List<Post> findAllById(List<Long> ids);
    List<Post> findAllSortedByDate();
}