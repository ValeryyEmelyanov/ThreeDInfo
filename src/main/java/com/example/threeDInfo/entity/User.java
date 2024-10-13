package com.example.threeDInfo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "\"user\"") // Quoting the table name
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false, unique = true) // email не может быть пустым и должен быть уникальным
    private String email;

    private String password;

    @Column(nullable = false)
    private String role; // можно определить допустимые роли как "USER", "ADMIN" и т.д.
}
