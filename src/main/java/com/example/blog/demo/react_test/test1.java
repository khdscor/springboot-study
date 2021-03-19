package com.example.blog.demo.react_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class test1 {
    @GetMapping("/react_test1/hello")
    public String hello(){
        return "안녕하세요 현재 시각은 "+new Date()+"입니다";
    }
}
