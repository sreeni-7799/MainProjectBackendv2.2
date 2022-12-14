package com.experion.mainbackend.controller;


import com.experion.mainbackend.dto.ChangePassword;
import com.experion.mainbackend.dto.User;
import com.experion.mainbackend.dto.UserResponse;
import com.experion.mainbackend.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserLoginController {


    @Autowired
    UserLoginService userLoginService;

    @PostMapping("*/user")
    private UserResponse update(@RequestBody User user) {
        UserResponse userResponse = userLoginService.userLogin(user);
        return userResponse;
    }


    @PostMapping("*/user/userlogin")
    private UserResponse userLogin(@RequestBody User user ){
        return userLoginService.userLogin(user);
    }

    @PostMapping("*/user/change-password")
    private String changePassword(@RequestBody ChangePassword changePassword) {
        return userLoginService.changePassword(changePassword);
    }

}
