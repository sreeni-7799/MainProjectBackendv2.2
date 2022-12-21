package com.experion.mainbackend.controller;


import com.experion.mainbackend.dto.NomineePost;
import com.experion.mainbackend.service.NomineeService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@AllArgsConstructor
@RequestMapping("*/nominee")

public class NomineePostController {

    private static final Logger logger =LoggerFactory.getLogger(NomineePostController.class);

    @Autowired
    private NomineeService nomineeService;

    @PostMapping("/add")
    public NomineePost addNominee(@RequestBody NomineePost request){
        logger.info("Nominee Posted");
        return nomineeService.addNominee(request);
    }


}

