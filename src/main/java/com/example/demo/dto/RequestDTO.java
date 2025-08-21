package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.repository.entity.User;

@Getter
@NoArgsConstructor
public class RequestDTO {

    private String name;
    private String username;
    private String password;
    private Integer age;
    private Job job;
    private String specialty;


    public User create() {

        User user = new User();
        user.setName(name);
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setJob(job);
        user.setSpecialty(specialty);

        return user;
    }

}
