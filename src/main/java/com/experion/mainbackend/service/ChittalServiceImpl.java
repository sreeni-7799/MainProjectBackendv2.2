package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.ChittalPost;
import com.experion.mainbackend.dto.ChittalPostResponse;
import com.experion.mainbackend.dto.UserJoinedChitty;
import com.experion.mainbackend.entity.ChittalDetails;
import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.entity.UserRegistration;
import com.experion.mainbackend.repository.ChitRepository;
import com.experion.mainbackend.repository.ChittalDetailsRepo;
import com.experion.mainbackend.repository.UserRegistrationRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ChittalServiceImpl implements ChittalService{

    private ChittalDetailsRepo chittalDetailsRepo;
    private UserRegistrationRepo userRegistrationRepo;
    private ChitRepository chitRepository;

    @Override
    public ChittalPostResponse addChittal(ChittalPost request) {
        ChittalDetails chittalDetails = new ChittalDetails();
        BeanUtils.copyProperties(request,chittalDetails);
        Optional<UserRegistration> userRegistration = userRegistrationRepo.findById(request.getUserId());
        chittalDetails.setUserId(userRegistration.get());
        Optional<Chitty> chitty = chitRepository.findById(request.getChittyId());
        chittalDetails.setChittyId(chitty.get());
        chittalDetails.setAge(request.getAge());
        chittalDetails.setAddress(request.getAddress());
        chittalDetails.setPinCode(request.getPinCode());
        chittalDetails.setUserPhone(request.getUserPhone());
        chittalDetails.setDob(request.getDob());
        chittalDetails.setStatus(request.getStatus());
        chittalDetails.setIncome(request.getIncome());
        chittalDetails.setAadhar(request.getAadhar());
        chittalDetailsRepo.save(chittalDetails);

        Long chittalId = chittalDetails.getChittalId();
        return new ChittalPostResponse(chittalId);
    }

    @Override
    public UserJoinedChitty getChitty(UserJoinedChitty chittyDetails) {
        chittyDetails.setUserId(chittyDetails.getUserId());
        return chittyDetails;
    }


}
