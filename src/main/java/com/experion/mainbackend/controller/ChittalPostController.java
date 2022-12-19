package com.experion.mainbackend.controller;

import com.experion.mainbackend.dto.ChittalPost;
import com.experion.mainbackend.dto.ChittalPostResponse;
import com.experion.mainbackend.dto.UserJoinedChitty;
import com.experion.mainbackend.repository.ChittalDetailsRepo;
import com.experion.mainbackend.service.ChittalService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("*/chittal")

public class ChittalPostController {

    @Autowired
    private ChittalService chittalService;
    @Autowired
    private ChittalDetailsRepo chittalDetailsRepo;

    @PostMapping("/add")
    public ChittalPostResponse addChittal(@RequestBody ChittalPost request){
        return chittalService.addChittal(request);
    }

    @GetMapping("/details/{id}")
    public UserJoinedChitty getChitty(@RequestBody UserJoinedChitty chittyDetails){
        return chittyDetails;
    }


}
