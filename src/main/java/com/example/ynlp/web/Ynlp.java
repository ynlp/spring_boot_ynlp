package com.example.ynlp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ynlp {
    @GetMapping("/index")
    public String index() {
        return "www";
    }
}
