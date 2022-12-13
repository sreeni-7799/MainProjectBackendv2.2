package com.experion.mainbackend.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chittyaccount_details")
@Getter
@Setter
public class ChittyAccountDetails {

    @Id
    @Column(name="id")
    private Long id;

    @Column(name="amount")
    private Long amount;

    @Column(name="chit_number")
    private Long chitNumber;

    @Column(name="chit_type")
    private String chitType;

    @Column(name="days")
    private Long days;

    @Column(name="members")
    private Long members;

    @Column(name="start_date")
    private String startDate;


}
