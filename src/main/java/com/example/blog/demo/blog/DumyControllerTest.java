package com.example.blog.demo.blog;

import com.example.blog.demo.Member.User;
import com.example.blog.demo.reposity.UserReposity;

import org.hibernate.annotations.DynamicInsert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableDefault;
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

        User user= userReposity.findById(id).get();

        return user;

    }

    @GetMapping("/dummy/user")// dummy/user/1 or 2 or 3
    public List<User> pageList(@PageableDefault(size = 1, sort = "id") Pageable pageable){
        Page <User> pagingUser = userReposity.findAll(pageable);

        if(pagingUser.isLast()){}

        return pagingUser.getContent();

    }


    @PostMapping("/dummy/join")
    public String join(User u){

        userReposity.save(u);

        return "회원가입이 완료되었습니다.";
    }
}
