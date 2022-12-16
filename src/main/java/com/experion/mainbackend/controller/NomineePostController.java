package com.experion.mainbackend.controller;

import com.experion.mainbackend.dto.ChittalPost;
import com.experion.mainbackend.dto.NomineePost;
import com.experion.mainbackend.service.ChittalService;
import com.experion.mainbackend.service.NomineeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("*/nominee")

public class NomineePostController {

    @Autowired
    private NomineeService nomineeService;

    @PostMapping("/add")
    public NomineePost addNominee(@RequestBody NomineePost request){
        return nomineeService.addNominee(request);
    }
}

