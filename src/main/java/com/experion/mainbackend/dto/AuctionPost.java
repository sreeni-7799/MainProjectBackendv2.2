package com.experion.mainbackend.dto;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;

@Data
public class AuctionPost {
    private Long Id;
    private Long chittyId;
    private Long userId;
    private Long currentBid;
}
