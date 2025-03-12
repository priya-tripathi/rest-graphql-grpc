package com.priyatripathi.unifiedapi.controllers;

import com.priyatripathi.unifiedapi.models.User;
import com.priyatripathi.unifiedapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/users")
public class UnifiedApiRestController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    private User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/{userId}")
    private Optional<User> getUser(@PathVariable Long userId){
        return userRepository.findById(userId);
    }

    @GetMapping("/all")
    private List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @DeleteMapping("{userId}")
    private void deleteUser(@PathVariable Long userId){
        userRepository.deleteById(userId);
    }
}
