package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.ChittyPost;
import com.experion.mainbackend.entity.Chitty;

import java.util.Optional;

public interface ChittyService {

    ChittyPost addChitty(ChittyPost request);
    ChittyPost updateChitty(ChittyPost request);
    public Optional<Chitty> findById(Long chitNumber);
    void deleteChitty(Long id);





}
