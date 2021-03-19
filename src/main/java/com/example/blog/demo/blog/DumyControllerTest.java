package com.example.blog.demo.blog;

import com.example.blog.demo.Member.User;
import com.example.blog.demo.reposity.UserReposity;
import org.hibernate.annotations.DynamicInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.IllformedLocaleException;
import java.util.List;
import java.util.function.Supplier;

@RestController
public class DumyControllerTest {

    @Autowired
    private UserReposity userReposity;

    @GetMapping("/dummy/select/{id}")
    public User select_text(@PathVariable int id){

        User user= userReposity.findById(id).orElseThrow(new Supplier<IllformedLocaleException>() {

            @Override
            public IllformedLocaleException get() {
                return new IllformedLocaleException("해당유저는 없습니다");
            }
        });

        return user;

    }

    @PostMapping("/dummy/join")
    public String join(User u){

        userReposity.save(u);

        return "회원가입이 완료되었습니다.";
    }
}
