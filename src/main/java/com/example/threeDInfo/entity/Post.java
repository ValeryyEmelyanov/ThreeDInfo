package com.example.threeDInfo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // лучше использовать IDENTITY
    private Long id;

    private String title;

    @Lob // для хранения больших текстов
    private String body;

    private String img;

    @Column(name = "created_date", nullable = false, updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // автор поста
}
