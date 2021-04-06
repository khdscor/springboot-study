package com.example.blog.demo;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class handler{

    @ExceptionHandler(value = Exception.class)
    public String testExceptionAdress(Exception e){
        return "<h1>" + e.getMessage() + "이거맞아?" +"</h1>";
    }
}
