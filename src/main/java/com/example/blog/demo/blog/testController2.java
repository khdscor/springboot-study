package com.example.blog.demo.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController2 {

    @GetMapping("/temp/home")
    public String tempHome(){

        System.out.println("실행완료");
        return "/home.html";
    }
}
