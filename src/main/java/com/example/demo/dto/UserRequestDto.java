package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import com.example.demo.repository.entity.User;

@Getter
@NoArgsConstructor
public class UserRequestDto {


    String name;
    String username;
    String password;
    String specialty;


    public User create() {

        User user = new User();

        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        user.setSpecialty(specialty);
        return user;

    }
}
