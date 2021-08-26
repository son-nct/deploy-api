package com.example.api.service;

import com.example.api.entity.User;
import com.example.api.model.dto.UserDTO;

import java.util.List;

public interface UserService {

    public List<UserDTO>getAll();

    public UserDTO findById(Long id);

    public UserDTO saveUser(User user);

    public UserDTO deleteUser(Long id);
}
