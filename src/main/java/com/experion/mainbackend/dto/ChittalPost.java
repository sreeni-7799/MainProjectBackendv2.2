package com.experion.mainbackend.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ChittalPost {

    private Long userId;
    private Long chittyId;
    private Integer age;
    private String address;
    private Long pinCode;
    private Long userPhone;
    private Date dob;
    private String status;
    private Long income;
    private Long aadhar;
}
