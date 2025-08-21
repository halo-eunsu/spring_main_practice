package com.example.demo.service;

import com.example.demo.dto.UserRequestDTO;
import com.example.demo.dto.UserResponseDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {


    private UserRepository userRepository;

    public UserResponseDTO createUser(UserRequestDTO request) {

        User user = request.create();

        User created = userRepository.save(user);

        return UserResponseDto.from(created);

    }
}
