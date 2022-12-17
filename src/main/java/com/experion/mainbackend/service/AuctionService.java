package com.experion.mainbackend.service;

import com.experion.mainbackend.dto.AuctionPost;

public interface AuctionService {

    AuctionPost add(AuctionPost request);

    AuctionPost update(AuctionPost request);
}
