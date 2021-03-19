package com.example.blog.demo.Member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class testTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Lob
    private String content;

    @ColumnDefault(" '아저씨' ")
    @Column(nullable = false, length = 30)
    private String username;

    @Column(nullable = false, length= 30)
    private String password;

    @ManyToOne
    @JoinColumn(name="foreign_user")
    private User user;
}
