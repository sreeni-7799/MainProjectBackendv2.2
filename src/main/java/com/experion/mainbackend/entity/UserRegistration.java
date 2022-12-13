package com.experion.mainbackend.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="customer")
public class UserRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iduser")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="mobile_no")
    private Long mobileNo;

    @Column(name="password")
    private String passWord;

    @Column(name = "roleid")
    private Integer roleId;
}
