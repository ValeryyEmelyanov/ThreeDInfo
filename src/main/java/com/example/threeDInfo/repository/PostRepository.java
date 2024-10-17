package com.example.threeDInfo.repository;

import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findAllByTitleContainingIgnoreCase(String query);

    List<Post> findAllByUser(User user);
    List<Post> findAllByCreatedDateAfter(LocalDate date);

    Optional<Post> findById(Long id);

    List<Post> findAllByIdIn(List<Long> ids);

    List<Post> findAllByOrderByCreatedDateDesc();

    void deleteById(Long id);

    List<Post> findAllByPublishedTrueOrderByCreatedDateDesc();

    List<Post> findAllByUserAndPublishedTrueOrderByCreatedDateDesc(User user);
}

