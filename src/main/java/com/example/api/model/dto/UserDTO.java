package com.example.api.model.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;
    private String avatar;
}
