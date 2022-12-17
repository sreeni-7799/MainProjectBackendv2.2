package com.experion.mainbackend.repository;

import com.experion.mainbackend.entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "auction", path = "auction")
public interface AuctionRepo extends JpaRepository<Auction,Long> {
}
