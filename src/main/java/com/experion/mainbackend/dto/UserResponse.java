package com.experion.mainbackend.dto;

import lombok.Data;

@Data
public class UserResponse {
    private final Long userId;
    private final Long roleId;
    private final String role;
    private final String email;
    private final int userLoginTracker;
}
