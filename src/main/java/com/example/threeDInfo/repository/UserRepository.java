package com.example.threeDInfo.repository;

import com.example.threeDInfo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    Optional<User> findByName(String email);

    List<User> findAll();

    void deleteByEmail(String email);

    boolean existsByEmail(String email);

    List<User> findAllByRole(String role);

}
