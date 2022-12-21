package com.experion.mainbackend.repository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserRegistrationRepoTest {

    @Autowired
    private UserRegistrationRepo userRegistrationRepo;

    @BeforeEach
    void setUp() {
        System.out.println("Set Up");
    }

    @Test
    void isUserExistsById() {

        Boolean actual=userRegistrationRepo.isUserExistsById(138L);
        assertThat(actual).isTrue();
    }

}