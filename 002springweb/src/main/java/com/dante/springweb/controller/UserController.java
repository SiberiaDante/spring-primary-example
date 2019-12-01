package com.dante.springweb.controller;

import com.dante.springweb.bean.User;
import com.dante.springweb.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/getUserList")
    public List<User> getUserList() {
        return userRepository.findAll();
    }
}
