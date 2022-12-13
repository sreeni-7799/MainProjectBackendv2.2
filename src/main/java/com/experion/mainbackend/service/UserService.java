package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.UserRegistrationDTO;
import com.experion.mainbackend.entity.UserRegistration;

public interface UserService {

    UserRegistration registerNewUserAccount(UserRegistrationDTO userRegistrationDTO);
}
