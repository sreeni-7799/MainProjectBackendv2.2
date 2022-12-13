package com.experion.mainbackend.controller;

import com.experion.mainbackend.dto.ChittyPost;
import com.experion.mainbackend.entity.Chitty;
import com.experion.mainbackend.service.ChittyService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("*/chitty")

public class ChitPostController {

    @Autowired
    private ChittyService chittyService;

    @PostMapping("/add")
    public ChittyPost addChitty(@RequestBody ChittyPost request){
        return chittyService.addChitty(request);
    }


    @GetMapping("/get/{chitNumber}")
    Optional<Chitty> getChitty(@PathVariable Long chitNumber){
        return chittyService.findById(chitNumber);
    }
    @PutMapping(value = "/update",produces = "Application/JSON")
    public ChittyPost updateChitty(@RequestBody ChittyPost request){
        return chittyService.updateChitty(request);
    }



}
