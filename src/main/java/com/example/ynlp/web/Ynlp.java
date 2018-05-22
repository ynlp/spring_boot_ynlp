package com.example.ynlp.web;

import com.example.ynlp.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ynlp {
    @GetMapping("/index")
    public User index() {
        User user=new User();
        user.setName("www");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }
}
