package com.experion.mainbackend.controller;

import com.experion.mainbackend.service.ChittalUserIdService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@CrossOrigin(origins = "*")
@Data
@RestController
public class ChittalUserIdController {

    @Autowired
   private ChittalUserIdService chittalUserIdService;

    @GetMapping("*/getchitties/{id}")
    Set<Long> getChitties(@PathVariable Long id){
        return chittalUserIdService.getChitties(id);
    }
}
