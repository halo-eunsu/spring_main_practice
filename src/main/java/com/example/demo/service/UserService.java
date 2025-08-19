package com.example.demo.service;

import com.example.demo.dto.RequestDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.entity.User;


public class UserService {


    UserRepository userRepository;

    public Boolean createUser(RequestDTO requestDTO){

        User request = request.from();
        Boolean iscreated = userRepository.save(user);

        return iscreated;

    }
}
