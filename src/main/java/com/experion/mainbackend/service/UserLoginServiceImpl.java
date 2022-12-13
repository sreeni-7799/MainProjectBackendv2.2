package com.experion.mainbackend.service;


import com.experion.mainbackend.dto.ChangePassword;
import com.experion.mainbackend.dto.User;
import com.experion.mainbackend.dto.UserResponse;
import com.experion.mainbackend.entity.Role;
import com.experion.mainbackend.entity.UserLogin;
import com.experion.mainbackend.entity.UserRegistration;
import com.experion.mainbackend.repository.UserLoginRepository;
import com.experion.mainbackend.repository.UserRegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service

public class UserLoginServiceImpl implements UserLoginService {
    @Autowired
    private UserLoginRepository userLoginRepository;
    @Autowired
    private UserRegistrationRepo userRegistrationRepo;


    @Override
    public UserResponse userLogin(User user) {
        BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder();
    Long roleId=null;
    String role= "";
   String email="";
   int userLoginTracker=0;


        List<UserLogin> login=userLoginRepository.findAll();


        for(UserLogin userLogin:login){

            if((userLogin.getEmail().equalsIgnoreCase(user.getEmail())) && (bcrypt.matches(user.getUserPassword(),userLogin.getPassword()))){
                roleId=userLogin.getRole().getId();
                role=userLogin.getRole().getRoleName();
                email=userLogin.getEmail();
                userLoginTracker=0;
                break;
            } else if ((userLogin.getEmail().equalsIgnoreCase(user.getEmail())) && (user.getUserPassword().equals(userLogin.getPassword()))) {
                roleId=userLogin.getRole().getId();
                role=userLogin.getRole().getRoleName();
                email=userLogin.getEmail();
                userLoginTracker=1;
                break;
            }

        }


        return new UserResponse(roleId,role,email,userLoginTracker);
    }



    @Override
    public String changePassword(ChangePassword changePassword) {
        BCryptPasswordEncoder bcrypt=new BCryptPasswordEncoder();
        String encryptedPassword= bcrypt.encode(changePassword.getNewPassword());
        List<UserLogin> login=userLoginRepository.findAll();

        for(UserLogin userLogin:login){
            if(Objects.equals(userLogin.getEmail(), changePassword.getEmail()) && Objects.equals(userLogin.getPassword(), changePassword.getCurrentPassword())) {
                userLogin.setPassword(encryptedPassword);
                userLoginRepository.save(userLogin);
                return "Password updated successfully!";
            }

             else if (Objects.equals(userLogin.getEmail(), changePassword.getEmail())&& (bcrypt.matches(changePassword.getCurrentPassword(),userLogin.getPassword()))) {
                userLogin.setPassword(encryptedPassword);
                userLoginRepository.save(userLogin);
                return "Password updated successfully!";

            }

        }

        return "User not found!";
    }


    //saving a specific record by using the method save() of CrudRepository

}
