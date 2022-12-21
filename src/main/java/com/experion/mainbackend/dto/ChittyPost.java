package com.experion.mainbackend.dto;


import lombok.Data;

import java.time.LocalDate;


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
