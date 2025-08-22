package com.example.demo.dto;

import com.example.demo.repository.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
public class UserResponseDto {


    String name;
    String username;
    String password;
    String specialty;

    public UserResponseDto from(User entity) {

        return new UserResponseDto(

                entity.getName(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getSpecialty()

        );
    }
}
