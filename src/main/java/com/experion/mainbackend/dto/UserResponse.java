package com.experion.mainbackend.dto;

import com.experion.mainbackend.entity.Role;
import lombok.Data;

@Data

public class UserResponse {

    private final Long roleid;
    private final String role;
    private final String email;
    private final int userLoginTracker;


}
