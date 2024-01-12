package com.mapper.devices.controllers;

import com.mapper.devices.entites.User;
import com.mapper.devices.repositories.UserRepository;
import com.mapper.devices.servises.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@Controller
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;
    private final UserService userService;


    @GetMapping
    public List<User> findAllUsers() {

        return (userService.findAll());

    }
}
