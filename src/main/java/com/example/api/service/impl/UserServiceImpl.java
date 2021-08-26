package com.example.api.service.impl;

import com.example.api.entity.User;
import com.example.api.model.dto.UserDTO;
import com.example.api.model.mapper.UserMapper;
import com.example.api.repository.UserRepository;
import com.example.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;


    @Override
    public List<UserDTO> getAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs = new ArrayList<>();
        for (User user : users) {
             UserDTO userDTO = UserMapper.userDTO(user);
             userDTOs.add(userDTO);
        }
        return userDTOs;
    }

    @Override
    public UserDTO findById(Long id) {
        User user = userRepository.findById(id).get();
        UserDTO userDTO = UserMapper.userDTO(user);
        return userDTO;
    }

    @Override
    public UserDTO saveUser(User user) {
        UserDTO userDTO = UserMapper.userDTO(user);
        userRepository.save(user);
        return userDTO;
    }

    @Override
    public UserDTO deleteUser(Long id) {
        UserDTO userDTO = UserMapper.userDTO(userRepository.getById(id));
        userRepository.delete(userRepository.getById(id));
        return userDTO;
    }
}
