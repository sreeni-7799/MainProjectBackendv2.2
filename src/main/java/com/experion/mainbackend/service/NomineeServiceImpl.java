package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.NomineePost;
import com.experion.mainbackend.entity.ChittalDetails;
import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.entity.NomineeDetails;
import com.experion.mainbackend.entity.UserRegistration;
import com.experion.mainbackend.repository.ChittalDetailsRepo;
import com.experion.mainbackend.repository.NomineeDetailsRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class NomineeServiceImpl implements NomineeService{

    private NomineeDetailsRepo nomineeDetailsRepo;
    private ChittalDetailsRepo chittalDetailsRepo;


    @Override
    public NomineePost addNominee(NomineePost request) {
        NomineeDetails nomineeDetails = new NomineeDetails();
        BeanUtils.copyProperties(request,nomineeDetails);
        Optional<ChittalDetails> chittalDetails = chittalDetailsRepo.findById(request.getChittalId());
        nomineeDetails.setChittalId(chittalDetails.get());
        nomineeDetails.setName(request.getName());
        nomineeDetails.setAge(request.getAge());
        nomineeDetails.setDob(request.getDob());
        nomineeDetails.setPhone(request.getPhone());
        nomineeDetails.setAddress(request.getAddress());
        nomineeDetails.setPincode(request.getPincode());
        nomineeDetails.setAadhar(request.getAadhar());
        nomineeDetailsRepo.save(nomineeDetails);
        return request;
    }
}