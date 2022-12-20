package com.experion.mainbackend.service;



import com.experion.mainbackend.repository.ManagerRepo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ManagerServiceTest {

    @Mock
    private ManagerRepo managerRepo;


    private  ManagerService managerService;

    @BeforeEach
    void setUp() {
        this.managerService=new ManagerService(this.managerRepo);
    }

    @Test
    void getAllManagers() {
        managerService.getAllManagers();

        verify(managerRepo).findAll();
    }
}