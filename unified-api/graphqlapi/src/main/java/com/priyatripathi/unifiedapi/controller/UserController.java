package com.priyatripathi.unifiedapi.controller;

import com.priyatripathi.unifiedapi.records.User;
import com.priyatripathi.unifiedapi.service.UserService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

/**
 * Graphql resolvers
 */
@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @QueryMapping
    public Optional<User> getUser(@Argument Long userId){
        return userService.getUser(userId);
    }

    @QueryMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @MutationMapping
    public User createUser(@Argument String name, @Argument String email){
        return userService.createUser(name, email);
    }

    @MutationMapping
    public User updateUser(@Argument Long userId, @Argument String name, @Argument String email){
        return userService.updateUser(userId, email, name);
    }

    @MutationMapping
    public void deleteUser(@Argument Long userId){
        userService.deleteUser(userId);
    }
}
