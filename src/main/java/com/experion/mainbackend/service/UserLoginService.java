package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.ChangePassword;
import com.experion.mainbackend.dto.User;
import com.experion.mainbackend.dto.UserResponse;
import com.experion.mainbackend.entity.Role;


public interface UserLoginService {

UserResponse userLogin(User user);

String changePassword(ChangePassword changePassword);
}
