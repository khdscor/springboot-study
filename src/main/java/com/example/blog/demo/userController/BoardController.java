package com.example.blog.demo.userController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/test/test/test")
    public String index(){
        return "index";
    }
}
