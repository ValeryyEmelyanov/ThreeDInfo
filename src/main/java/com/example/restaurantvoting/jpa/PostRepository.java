package com.example.restaurantvoting.jpa;

import com.example.restaurantvoting.dto.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByTitleLike(String query);

    List<Post> findAllByTitleContainingIgnoreCase(String query);
}

