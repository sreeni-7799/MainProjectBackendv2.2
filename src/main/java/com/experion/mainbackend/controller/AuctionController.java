package com.experion.mainbackend.controller;

import com.experion.mainbackend.dto.AuctionPost;
import com.experion.mainbackend.service.AuctionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("*/auction")
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @PostMapping("/add")
    public AuctionPost add(@RequestBody AuctionPost request){
        return auctionService.add(request);
    }

    @PutMapping(value = "/update",produces = "Application/JSON")
    public AuctionPost update(@RequestBody AuctionPost request){
        return auctionService.update(request);
    }



}
