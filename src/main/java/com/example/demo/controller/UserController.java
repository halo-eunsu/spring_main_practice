package com.example.demo.controller;


import com.example.demo.dto.RequestDTO;
import com.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    UserService userService;

    @PostMapping("")
    public ResponseEntity<RequestDTO> create(@RequestBody RequestDTO request) {
        UserResponseDto user = userService.createUser(request);
        return ResponseEntity.ok(user);
    }


}
