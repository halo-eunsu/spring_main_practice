package com.example.demo.service;

import com.example.demo.dto.RequestDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {


    // TODO : 1. 간이 DB를 할 자료 구조 Map을 정의 , 1-1 클래스 내 save 메서드 생성

    @Autowired
    private UserRepository userRepository;

    public Boolean createUser(RequestDTO requestDTO) {

        User request = requestDTO.create();


        Boolean createdUser = userRepository.save(request);
        if (Objects.isNull(createdUser)) {
            return false;
        }
        return true;


    }
}
