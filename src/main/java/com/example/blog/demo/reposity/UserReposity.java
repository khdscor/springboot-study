package com.example.blog.demo.reposity;

import com.example.blog.demo.Member.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposity extends JpaRepository<User,Integer > {

}
