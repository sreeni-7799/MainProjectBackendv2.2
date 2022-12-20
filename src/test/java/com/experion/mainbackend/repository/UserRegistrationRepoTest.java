package com.experion.mainbackend.repository;

import com.experion.mainbackend.entity.UserRegistration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class UserRegistrationRepoTest {

//    UserRegistration user =new UserRegistration(138L,"Sreeni","Sreeni","srfgffdre3588f9@gmail.com", 1234567L,"sreeni", 2L);

    @Autowired
    private UserRegistrationRepo userRegistrationRepo;

    @BeforeEach
    void setUp() {
        System.out.println("Set Up");



//        userRegistrationRepo.save(user);
    }

    @Test
    void isUserExistsById() {


        Boolean actual=userRegistrationRepo.isUserExistsById(138L);

        assertThat(actual).isTrue();


    }

//    @AfterEach
//    void tearDown(UserRegistration user) {
//        System.out.println("Tear Down");
////        userRegistrationRepo.delete(user);
//    }
}