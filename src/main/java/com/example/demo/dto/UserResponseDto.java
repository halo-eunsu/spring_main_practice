package com.example.demo.dto;

import com.example.demo.repository.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class UserResponseDto {


    String name;
    String username;
    String password;
    String specialty;

    public UserResponseDto from(User entity) {

        
    }
}
