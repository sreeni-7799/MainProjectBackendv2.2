package com.experion.mainbackend.service;

import com.experion.mainbackend.entity.ChittalDetails;
import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.repository.ChitRepository;
import com.experion.mainbackend.repository.ChittalDetailsRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ChittalUserIdServiceImpl implements ChittalUserIdService{

    @Autowired
    private ChittalDetailsRepo chittalDetailsRepo;
    private ChitRepository chitRepository;
//    List<Chitty> chittyList = new ArrayList<Chitty>();
    List<Long> chittyNumbers = new ArrayList<>();
    List<ChittalDetails> chittalList = new ArrayList<ChittalDetails>();

    @Override
    public List<Long> getChitties(Long id) {
        chittalList = chittalDetailsRepo.findAll();
        for(ChittalDetails chittalDetails : chittalList){
//            System.out.println(chittalDetails.getUserId().getId());
//            System.out.println(id);
//            System.out.println(chittalDetails.getChittyId().getChitNumber());
            if(chittalDetails.getUserId().getId().equals(id)){
//                System.out.println(chittalDetails.getChittyId().getChitNumber());
//                System.out.println(chittalDetails.getChittyId());
                chittyNumbers.add(chittalDetails.getChittyId().getChitNumber());
            }
        }

        return chittyNumbers;

    }
}
