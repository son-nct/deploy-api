package com.example.api.api;

import com.example.api.entity.User;
import com.example.api.model.dto.UserDTO;
import com.example.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
public class APIController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public ResponseEntity<?>getAllUser() {
        List<UserDTO>userList = userService.getAll();
        return  ResponseEntity.ok(userList);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<?>findById(@PathVariable("id")Long id) {
        UserDTO user = userService.findById(id);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/users")
    public ResponseEntity<?>addUser(@RequestBody User user) {
        UserDTO userDTO = userService.saveUser(user);
        return ResponseEntity.ok(userDTO);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<?>updateUser(@RequestBody User user, @PathVariable("id")Long id) {

        UserDTO oldUser = userService.findById(id);
        UserDTO userDTO = null;
        if(oldUser != null) {
            user.setId(id);
            userDTO = userService.saveUser(user);
        }

        return ResponseEntity.ok(userDTO);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?>updateUser(@PathVariable("id")Long id) {

        UserDTO deleteUser = userService.findById(id);
        if(deleteUser != null) {
            userService.deleteUser(id);

        }
        return ResponseEntity.ok(deleteUser);
    }

}
