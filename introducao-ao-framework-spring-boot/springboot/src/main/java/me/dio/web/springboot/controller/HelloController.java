package me.dio.web.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HelloController {

    @GetMapping("/")
    public String hellloMessage(){
        return "Hello, Dio!";
    }

}
