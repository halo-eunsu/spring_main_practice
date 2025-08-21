package com.example.demo.repository.entity;

import com.example.demo.dto.Job;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
public class User {

    private  Integer id;
    private String name;
    private String username;
    private String password;
    private  Integer age;
    private Job job;
    private String specialty;


}
