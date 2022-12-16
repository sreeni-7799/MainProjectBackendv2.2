package com.experion.mainbackend.controller;


import com.experion.mainbackend.dto.UserRegistrationDTO;
import com.experion.mainbackend.entity.UserRegistration;
import com.experion.mainbackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    private ResponseEntity<Object> registerNewUserAccount(@RequestBody UserRegistrationDTO add) {
        this.userService.registerNewUserAccount(add);
        return new ResponseEntity<>("User registered succesfully", HttpStatus.CREATED);
    }
}
