package com.example.blog.demo.blog;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Data // 개터세터
@AllArgsConstructor //생성자
//@RequiredArgsConstructor : final 걸린 놈들 생성자
@NoArgsConstructor //빈생성자
@Builder
public class Member_test {

    private int id;
    private String username;
    private String password;
    private String email;
}
