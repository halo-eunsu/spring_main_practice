package com.example.demo.controller;


import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping("")
    public ResponseEntity<ResponseDTO> create(@RequestBody RequestDto request) {
        ResponseDTO user = userService.save(request);
        return ResponseEntity.ok(user);
    }
}
