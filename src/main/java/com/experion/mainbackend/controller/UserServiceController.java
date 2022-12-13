package com.experion.mainbackend.controller;


import com.experion.mainbackend.dto.UserRegistrationDTO;
import com.experion.mainbackend.entity.UserRegistration;
import com.experion.mainbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class UserServiceController {

    @Autowired
    UserService userService;

    @PostMapping("*/user-profile")
    private UserRegistration registerNewUserAccount(@RequestBody UserRegistrationDTO add) {
        return userService.registerNewUserAccount(add);
    }
}
