package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.AuctionPost;
import com.experion.mainbackend.entity.Auction;
import com.experion.mainbackend.entity.ChittalDetails;
import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.entity.UserRegistration;
import com.experion.mainbackend.repository.AuctionRepo;
import com.experion.mainbackend.repository.ChitRepository;
import com.experion.mainbackend.repository.UserRegistrationRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuctionServiceImpl implements AuctionService{

    private AuctionRepo auctionRepo;
    private UserRegistrationRepo userRegistrationRepo;

    private ChitRepository chitRepository;

    @Override
    public AuctionPost add(AuctionPost request) {
        Auction auction = new Auction();
        BeanUtils.copyProperties(request,auction);
        auction.setId(request.getId());
        Optional<UserRegistration> userRegistration = userRegistrationRepo.findById(request.getUserId());
        auction.setUserId(userRegistration.get());
        Optional<Chitty> chitty = chitRepository.findById(request.getChittyId());
        auction.setChittyId(chitty.get());
        auction.setCurrentBid(request.getCurrentBid());
        auctionRepo.save(auction);
        return request;
    }

    @Override
    public AuctionPost update(AuctionPost request) {
        Optional<Auction> getAuction = auctionRepo.findById(request.getId());
        Auction auction = getAuction.get() ;
        BeanUtils.copyProperties(request,auction);
        Optional<UserRegistration> userRegistration = userRegistrationRepo.findById(request.getUserId());
        auction.setUserId(userRegistration.get());
        Optional<Chitty> chitty = chitRepository.findById(request.getChittyId());
        auction.setChittyId(chitty.get());
        auction.setCurrentBid(request.getCurrentBid());
        auctionRepo.save(auction);
        return request;
    }
}
