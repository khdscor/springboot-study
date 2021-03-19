package com.example.blog.demo.Member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.sql.Timestamp;

@DynamicInsert
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable= false, length=30)
    private String username;

    @Column(nullable= false, length=100)
    private String password;

    @Column(nullable= false, length=50)
    private String email;

    @ColumnDefault(" 'USER' ")
    private String role;// Enum을 쓰는게 좋다(admin, customer 등)

    @CreationTimestamp
    private Timestamp createDate;
 }
