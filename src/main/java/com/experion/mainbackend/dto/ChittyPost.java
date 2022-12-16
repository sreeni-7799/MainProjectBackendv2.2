package com.experion.mainbackend.dto;

import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.entity.ChittyCategory;
import com.experion.mainbackend.entity.Manager;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class ChittyPost {

    private Long chitNumber;
    private Long installment;
    private Long duration;
    private Long manager;
    private Integer numberOfChittal;
    private Integer currentNumberOfChittal;
    private Long category;
    private Long totalAmount;
    private LocalDate launchDate;
    private LocalDate startDate;
    private String status;
}
