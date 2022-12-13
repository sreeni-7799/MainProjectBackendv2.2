package com.experion.mainbackend.entity;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "chitty")
@Data
public class Chitty {

    @Id
    @Column(name = "chit_number")
    private Long chitNumber;

    @Column(name = "installment")
    private Long installment;

    @Column(name = "duration")
    private Long duration;


    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",nullable = false)
    @JsonIgnore
    private ChittyCategory category;

    @Column(name = "number_of_chittals")
    private int numberOfChittal;

    @Column(name = "current_number_of_chittals")
    private int currentNumberOfChittal;

    @Column(name = "total_amount")
    private Long totalAmount;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_emp_id",nullable = false)
    @JsonIgnore
    private Manager manager;

    @Column(name="launch_date")
    private Date launchDate;

    @Column(name="start_date")
    private Date startDate;

    @Column(name = "status")
    private String status;

    public Chitty(Long chitNumber, Long installment, Long duration, ChittyCategory category, int numberOfChittal, int currentNumberOfChittal, Long totalAmount, Manager manager, Date launchDate, Date startDate, String status) {
        this.chitNumber = chitNumber;
        this.installment = installment;
        this.duration = duration;
        this.category = category;
        this.numberOfChittal = numberOfChittal;
        this.currentNumberOfChittal = currentNumberOfChittal;
        this.totalAmount = totalAmount;
        this.manager = manager;
        this.launchDate = launchDate;
        this.startDate = startDate;
        this.status = status;
    }

    public Chitty() {
    }

}
