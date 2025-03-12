package com.priyatripathi.unifiedapi.service;

import com.priyatripathi.unifiedapi.records.User;
import com.priyatripathi.unifiedapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(String name, String email) {
        User user = new User(name, email);
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long userId) {
        return userRepository.findById(userId);
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User updateUser(Long userId, String email, String name) {
        return userRepository.findById(userId).map(user -> {
            user.setUserId(userId);
            user.setEmail(email);
            user.setName(name);
            return userRepository.save(user);
        }).orElseThrow(RuntimeException::new);
    }

    public void deleteUser(Long userId){
        userRepository.deleteById(userId);
    }


}
