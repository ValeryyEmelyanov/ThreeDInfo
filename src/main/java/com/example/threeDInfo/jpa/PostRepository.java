package com.example.threeDInfo.jpa;

import com.example.threeDInfo.dto.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

/**
 * В/д с БД, исполнение CRUD
 */

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {


    // Поиск query в теле title
    List<Post> findAllByTitleContainingIgnoreCase(String query);

    // Поиск query в после post
    List<Post> findAllByTitleContainingIgnoreCaseOrBodyContainingIgnoreCase(String titleQuery, String bodyQuery);

    // Поиск post по дате
    List<Post> findAllByCreatedDateAfter(LocalDate date);

    // Поиск post по id
    List<Post> findAllByIdIn(List<Long> id);

    // Поиск всех post с сортировкой по дате создания
    List<Post> findAllByOrderByCreatedDateDesc();

}

