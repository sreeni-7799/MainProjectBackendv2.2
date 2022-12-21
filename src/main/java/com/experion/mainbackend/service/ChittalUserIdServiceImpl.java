package com.experion.mainbackend.service;

import com.experion.mainbackend.entity.ChittalDetails;

import com.experion.mainbackend.repository.ChitRepository;
import com.experion.mainbackend.repository.ChittalDetailsRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ChittalUserIdServiceImpl implements ChittalUserIdService{

    @Autowired
    private ChittalDetailsRepo chittalDetailsRepo;
    private ChitRepository chitRepository;


    @Override
    public Set<Long> getChitties(Long id) {
        List<ChittalDetails> chittalList = new ArrayList<ChittalDetails>();
        chittalList = chittalDetailsRepo.findAll();
        Set<Long> chittyNumbers = new HashSet<Long>();
        for(ChittalDetails chittalDetails : chittalList){
            if(chittalDetails.getUserId().getId().equals(id)){
                chittyNumbers.add(chittalDetails.getChittyId().getChitNumber());
            }
        }

        return chittyNumbers;

    }
}
