package com.experion.mainbackend.controller;

import com.experion.mainbackend.dto.ChittalPost;
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

    @PostMapping("/add")
    public ChittalPost addChittal(@RequestBody ChittalPost request){
        return chittalService.addChittal(request);
    }




}
