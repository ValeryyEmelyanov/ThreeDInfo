package com.example.threeDInfo.repository;

import com.example.threeDInfo.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    // Поиск query в заголовке title
    List<Post> findAllByTitleContainingIgnoreCase(String query);


    // Поиск post по дате (после определённой даты)
    List<Post> findAllByCreatedDateAfter(LocalDate date);

    // Поиск post по списку id
    List<Post> findAllByIdIn(List<Long> ids);

    // Поиск всех post с сортировкой по дате создания (по убыванию)
    List<Post> findAllByOrderByCreatedDateDesc();

    // Удаление post по id
    void deleteById(Long id);

    // Сохранение поста
    Post save(Post post);
}
