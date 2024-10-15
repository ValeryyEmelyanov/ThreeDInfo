package com.example.threeDInfo.service;


import com.example.threeDInfo.dto.PostDTO;
import com.example.threeDInfo.entity.Post;
import com.example.threeDInfo.entity.User;
import com.example.threeDInfo.exception.UserNotFoundException;
import com.example.threeDInfo.mapper.PostMapper;
import com.example.threeDInfo.repository.PostRepository;
import com.example.threeDInfo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class PostMapperService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;
    private final PostMapper postMapper;

    public PostMapperService(PostRepository postRepository, UserRepository userRepository, PostMapper postMapper) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
        this.postMapper = postMapper;
    }

    public PostDTO createPost(PostDTO postDTO) {
        // Поиск пользователя по email
        User user = userRepository.findByEmail(postDTO.getEmail())
                .orElseThrow(() -> new UserNotFoundException("User with email " + postDTO.getEmail() + " not found"));

        // Преобразование DTO в Post и сохранение
        Post post = postMapper.toEntity(postDTO, user);
        post = postRepository.save(post);

        // Преобразование обратно в DTO для возврата
        return postMapper.toDTO(post);
    }



}
