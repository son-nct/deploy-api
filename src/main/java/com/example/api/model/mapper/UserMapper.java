package com.example.api.model.mapper;

import com.example.api.entity.User;
import com.example.api.model.dto.UserDTO;

public class UserMapper {
    public static UserDTO userDTO(User user) {
        UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setAge(user.getAge());
        userDTO.setPhone(user.getPhone());
        userDTO.setAvatar(user.getAvatar());
        userDTO.setEmail(user.getEmail());
        userDTO.setAddress(user.getAddress());
        return userDTO;
    }
}
