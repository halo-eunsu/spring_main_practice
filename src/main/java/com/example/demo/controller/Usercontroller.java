package com.example.demo.controller;


import com.example.demo.dto.UserREquestDTO;
import com.example.demo.dto.UserResponseDTO;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {


    UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> create(@RequestBody UserREquestDTO request) {

        UserResponseDTO user = userService.save(request);

        return ResponseEntity.ok(user);
    }

}
