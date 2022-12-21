package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.AuctionPost;
import com.experion.mainbackend.entity.*;
import com.experion.mainbackend.repository.AuctionRepo;
import com.experion.mainbackend.repository.ChitRepository;
import com.experion.mainbackend.repository.UserLoginRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AuctionServiceImpl implements AuctionService{

    private AuctionRepo auctionRepo;
    private UserLoginRepository userLoginRepository;

    private ChitRepository chitRepository;

    @Override
    public AuctionPost add(AuctionPost request) {
        Auction auction = new Auction();
        BeanUtils.copyProperties(request,auction);
        auction.setId(request.getId());
        Optional<UserLogin> userLogin = userLoginRepository.findById(request.getUserId());
        auction.setUserId(userLogin.get());
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
        auction.setId(request.getId());
        Optional<UserLogin> userLogin = userLoginRepository.findById(request.getUserId());
        auction.setUserId(userLogin.get());
        Optional<Chitty> chitty = chitRepository.findById(request.getChittyId());
        auction.setChittyId(chitty.get());
        auction.setCurrentBid(request.getCurrentBid());
        auctionRepo.save(auction);
        return request;
    }
}
