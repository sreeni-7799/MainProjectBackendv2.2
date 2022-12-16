package com.experion.mainbackend.dto;

import com.experion.mainbackend.entity.UserRegistration;
import lombok.Data;

@Data
public class UserRegistrationDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long mobileNo;
    private String passWord;
    private Integer roleId;
}
