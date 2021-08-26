package com.example.api.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private int age;
    private String avatar;
    private String email;
    private String name;
    private String password;
    private String phone;
}
