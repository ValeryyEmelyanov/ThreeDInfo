package com.example.threeDInfo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PostDTO {

    @NotEmpty(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Title is required")
    @Size(max = 100, message = "Title cannot be longer than 100 characters")
    private String title;

    @NotBlank(message = "Body is required")
    @Size(max = 500, message = "Body cannot be longer than 500 characters")
    private String body;

    @NotEmpty(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;
}
