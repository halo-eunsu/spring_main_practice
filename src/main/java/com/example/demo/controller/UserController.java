package com.example.demo.controller;


import com.example.demo.dto.RequestDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping("")
    public ResponseEntity<RequestDTO> create(@RequestBody RequestDTO request) {
        UserResponseDto user = userService.save(request);
        return ResponseEntity.ok(user);
    }


}
